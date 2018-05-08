package org.dmd.mvw.client.gxtforms.editors;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.mvw.client.gxtforms.validators.CSVValidator;
import org.dmd.mvw.client.mvwforms.base.MvwFieldEditor;

import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.Validator;

/**
 * The GXTCSVSetField is used to display a set comma separated values and is
 * an abstract base for concrete CSV fields. This type of display must be used in
 * conjunction with a CSVValidator of the appropriate type.
 * @param <E> the type of the values.
 */
abstract public class GXTCSVSetField<E> extends MvwFieldEditor {

	// Our widget implementation
	protected TextField			widget;

	// A convenience handle to the adapter cast to an attribute
	protected DmcAttribute<?>	attribute;
	
	protected CSVValidator<E> 	ourValidator;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	private	TreeSet<E>					initialValues;

	
	/**
	 * Derived classes should call this constructor with their appropriate validator.
	 * @param validator
	 */
	protected GXTCSVSetField(CSVValidator<E> validator) {
		super();
		widget = new TextField();
		widget.addValidator(validator);
		
		widget.setAutoValidate(true);
		// The validation of the field used to take place prior to our
		// being called for the key up event, now, we get called before
		// validation - so we have to use the valid handler event, even though
		// this gets called more frequently e.g. when the field gains focus,
		// prior to validation and after validation.
		
		widget.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				process();
			}
		});
	}
	
	private void process() {
		if (attrIndex >= 0){
			throw(new IllegalStateException("Indexed attributes not yet supported with this editor"));
		}
		else{
			if (widget.getText() == null){
				if (isValid()){
					adapter.setEmpty();
					READY();
				}
				else
					NOTREADY();
			}
			else{
				if (isValid()){
					try {
						adapter.setEmpty();
						for(E value: ourValidator.getValues())
							attribute.add(value);
						READY();
						
						tracker.debug("GXTCSVSetField: updating value: " + widget.getText() + " READY");
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + widget.getText(),e));
					}
				}
				else{
					NOTREADY();
					tracker.debug("GXTCSVSetField: invalid value: " + widget.getText() + " NOT READY");
				}
			}
		}
		
	}
	
	@Override
	public void setToolTip(String tooltip) {
		widget.setToolTip(tooltip);
	}

	@Override
	public void setMandatory(boolean flag) {
		mandatory = flag;
		
		if (mandatory)
			widget.setAllowBlank(false);
		else
			widget.setAllowBlank(true);
		
		boolean v = widget.isCurrentValid();
		
		if (v)
			READY();
		else
			NOTREADY();
	}
	

	@Override
	public void setReadOnly(boolean readonly) {
		if (readonly)
			setEnabled(false);
		else
			setEnabled(true);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		this.adapter = adapter;
		attribute	= (DmcAttribute<?>) adapter;
		setDisplayValue();
	}

	@Override
	public boolean isReady() {
		// If we're disabled, assume we're "ready" - this prevents problems with fields that are marked
		// as mandatory but their enable/disable state is controlled by, perhaps, a checkbox. While they
		// are disabled, that don't affect the tracker's ready state.
		if (!widget.isEnabled())
			return(true);

		// We need a value, but we don't have one - not ready
		if (mandatory && (widget.getText() == null)){
			return(false);
		}
		
		if (!widget.isRendered()){
			boolean rc = true;
			
			List<Validator<String>> validators = widget.getValidators();
			for(Validator<String> validator: validators) {
				List<EditorError> errors = validator.validate(widget, widget.getText());
				if ((errors == null) || (errors.size()==0)) {
					// It's okay
				}
				else {
					rc = false;
					break;
				}
			}
			
			if (rc)
				tracker.debug(attribute.getName() + " is not rendered, but validation ok TRUE");
			else
				tracker.debug(attribute.getName() + " is not rendered, but validation failed FALSE");

			return(rc);
		}

		tracker.debug(attribute.getName() + " isValid() = " + widget.isCurrentValid() +"\n");
		
		if(widget.isCurrentValid())
			return true;
		
		return(false);		
	}

	@Override
	public boolean isValid() {
		boolean rc = widget.isCurrentValid();
		
		if (rc)
			READY();
		else
			NOTREADY();
		
		return(rc);
	}

	@Override
	public void resetToExisting() {
		adapter.resetToExisting();
		setDisplayValue();
	}

	@Override
	public boolean valueChanged() {
		// If we're disabled, don't take our changed state into account
		if (!widget.isEnabled())
			return(false);
		
		boolean rc = adapter.valueChanged();
		if (rc)
			return(rc);
		
		if (widget.getText() == null){
			if (initialValues != null)
				rc = true;
		}
		else{
			if (initialValues == null)
				rc = true;
			else{
				if (ourValidator.getValues().size() != initialValues.size())
					rc = true;
				else{
					for(E value: ourValidator.getValues()){
						if (!initialValues.contains(value)){
							rc = true;
							break;
						}
					}
				}
			}
		}
			
		return(rc);
	}

	@Override
	public void setEnabled(boolean enabled) {
		widget.setEnabled(enabled);
		
		if (enabled)
			isValid();
		else
			widget.clearInvalid();
	}

	@Override
	public Widget asWidget() {
		return(widget);
	}

	@Override
	public void focus() {
		widget.focus();
	}
	
	///////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unchecked")
	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getMVSize() == 0){
				widget.setText(null);
				initialValues = null;
			}
			else{
				initialValues = new TreeSet<E>();
				StringBuilder sb = new StringBuilder();
				int count = 0;
				Iterator<E>	iterator = (Iterator<E>) attribute.getMV();
				while(iterator.hasNext()){
					E value = iterator.next();
					if (count > 0)
						sb.append(",");
					sb.append(value.toString());
					initialValues.add(value);
					count++;
				}
				
				widget.setText(sb.toString());
				
				// We force validation here so that the validator has the current set of values that
				// we use in the valueChanged() method
				ourValidator.validate(widget, widget.getText());
			}
		}
		else{
			throw(new IllegalStateException("CSV SET not supported for indexed attributes for now"));
		}
	}

}
