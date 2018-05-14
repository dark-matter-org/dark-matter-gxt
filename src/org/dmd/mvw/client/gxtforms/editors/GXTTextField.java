package org.dmd.mvw.client.gxtforms.editors;

import java.util.List;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.mvw.client.mvwforms.base.MvwFieldEditor;

import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.event.ValidEvent;
import com.sencha.gxt.widget.core.client.event.ValidEvent.ValidHandler;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.Validator;

public class GXTTextField extends MvwFieldEditor {
	
	// Our widget implementation
	protected TextField		widget;

	// A convenience handle to the adapter cast to an attribute
	private DmcAttribute<?>	attribute;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	private String			initialValue;

	public GXTTextField() {
		super();
		widget = new TextField();
		
		// The value change event is only fired when the field loses focus
		// so that's useless.
//		widget.addValueChangeHandler(new ValueChangeHandler<String>() {
//			
//			@Override
//			public void onValueChange(ValueChangeEvent<String> event) {
//				DEBUG(event.toDebugString());
//				if (widget.getText() == null){
//					DEBUG("It's empty");
//				}
//				else {
//					DEBUG("Have value: " + widget.getText());
//					
//				}
//			}
//		});
		
//		widget.addValidHandler(new ValidHandler() {
//			
//			@Override
//			public void onValid(ValidEvent event) {
//				DEBUG(event.toDebugString());
//				if (widget.getText() == null){
//					DEBUG("It's empty");
//				}
//				else {
//					DEBUG("Have value: " + widget.getText());
//					
//				}
//			}
//		});
		
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
		
//		widget.addValidHandler(new ValidHandler() {
//			
//			@Override
//			public void onValid(ValidEvent event) {
//				process();
//				
//			}
//		});
				
	}
	
	private void process() {
		if (attrIndex >= 0){
			if (TextFieldUtil.isEmpty(widget)){
				if (isValid()){
					try {
						attribute.setMVnth(attrIndex, null);
						READY();
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): null",e));
					}								
				}
				else {
					NOTREADY();
				}
			}
			else{
				if (isValid()){
					try {
						attribute.setMVnth(attrIndex, widget.getText());
						READY();
						DEBUG("GxtTextField: setMVnth " + attrIndex + " " + widget.getText() + " READY");
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + widget.getText(),e));
					}
				}
				else{
					NOTREADY();
					DEBUG("GxtTextField: invalid value: " + attrIndex + " " + widget.getText() + " NOT READY");
				}
			}
		}
		else{
			if (TextFieldUtil.isEmpty(widget)){
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
						attribute.set(widget.getText());
						READY();
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + widget.getText(),e));
					}
				}
				else{
					NOTREADY();
				}
			}
		}
	
		
	}
	
	/**
	 * A convenience function to allow for altering whether or not a field is mandatory on the fly.
	 * When you change the mandatory state, call isValid() and we'll let the tracker know if we're
	 * ready or not.
	 */
	@Override
	public boolean isValid() {
//		boolean rc = widget.isValid();
		boolean rc = widget.isCurrentValid();
		
		if (rc)
			READY();
		else
			NOTREADY();
		
		return(rc);
	}

	@Override
	public void setToolTip(String tooltip) {
		widget.setToolTip(tooltip);
	}

	@Override
	public void setReadOnly(boolean readonly) {
		// NOTE: old note from extjs days:
		// had to overload this because the x-form-readonly style is missing and the
		// field still appears editable but won't accept user input, which is confusing
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
		
		// At this stage, we may or may not have been rendered. If we're not rendered, the
		// isValid() will always be false, and that's not what we want. If we have a validator,
		// we will call it directly.
		if (mandatory && TextFieldUtil.isEmpty(widget)){
			return(false);
		}
		
		List<Validator<String>> validators = widget.getValidators();
		if (validators.size() == 0){
			return(true);
		}
		
		if (!widget.isRendered()){
			boolean rc = true;
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
				DEBUG(attribute.getName() + " is not rendered, but validation ok TRUE");
			else
				DEBUG(attribute.getName() + " is not rendered, but validation failed FALSE");

			return(rc);
		}
			
//		DEBUG(attribute.getName() + " isValid() = " + widget.isValid() +"\n");
		DEBUG(attribute.getName() + " isValid() = " + widget.isCurrentValid() +"\n");
		
//		if(widget.isValid())
		if(widget.isCurrentValid())
			return true;
		
		return(false);
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
		
		if (TextFieldUtil.isEmpty(widget)){
			if (initialValue != null)
				rc = true;
		}
		else{
			if (initialValue == null)
				rc = true;
			else if (!widget.getText().equals(initialValue))
				rc = true;
		}
			
		return(rc);
	}

	/**
	 * We override this to clear any outstanding invalid flags on the field when it is disabled.
	 * Otherwise, the invalid stuff remains even when the field is disabled.
	 */
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
	public void setMandatory(boolean flag) {
		mandatory = flag;
		
		if (mandatory)
			widget.setAllowBlank(false);
		else
			widget.setAllowBlank(true);
		
//		boolean v = widget.isValid();
		boolean v = widget.isCurrentValid();
		if (v)
			READY();
		else
			NOTREADY();
		
	}
	
	///////////////////////////////////////////////////////////////////////////

	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() == null){
				widget.setText(null);
				initialValue = null;
			}
			else{
				widget.setText(attribute.getSV().toString());
				initialValue = widget.getText();
			}
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null){
				widget.setText(null);
				initialValue = null;
			}
			else{
				widget.setText(attribute.getMVnth(attrIndex).toString());
				initialValue = widget.getText();
			}
		}
	}
	
	@Override
	public void focus() {
		widget.focus();
	}

	@Override
	public void setEmpty() {
		if (adapter.hasValue()) {
			widget.setText(null);
			process();
		}
	}



}
