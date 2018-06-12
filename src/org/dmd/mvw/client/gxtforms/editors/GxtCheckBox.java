package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.types.DmcTypeBoolean;
import org.dmd.mvw.client.mvwforms.base.MvwFieldEditor;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.form.CheckBox;


/**
 * The GxtCheckBox is meant to display Boolean values in the form of a checkbox. This editor
 * supports both single valued and multi-valued, indexed Booleans (which would align with
 * a bit mask kind of display); you would have to set your own labels in such a situation,
 * since the auto set labels probably wouldn't make much sense.
 */
//public class GxtCheckBox extends CheckBox implements DmcPresentationIF {
public class GxtCheckBox extends MvwFieldEditor {
	
	protected CheckBox		widget;
	
	// A convenience handle to the adapter cast to an attribute
	private DmcTypeBoolean	attribute;

	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	private Boolean			initialValue;

	public GxtCheckBox() {
		widget = new CheckBox();
		
		widget.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> event) {
				if (attrIndex >= 0){
					try {
						attribute.setMVnth(attrIndex, widget.getValue());
						READY();
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + widget.getValue(),e));
					}
				}
				else{
					try {
						if (initialValue == null){
							if (widget.getValue().booleanValue())
								attribute.set(widget.getValue());
							else
								adapter.setEmpty();
						}
						else
							attribute.set(widget.getValue());
						
						READY();
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + widget.getValue(),e));
					}
	
				}
			}
		});
		
		// If we don't set the box label to be blank, the check box will be rendered in the
		// center of the fields display. Setting this to blank will cause it to line up on
		// the left side of the fields area.
		widget.setBoxLabel("");

		widget.setAutoValidate(true);
	}
	
	public Boolean getValue() {
		return(widget.getValue());
	}

	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() == null){
				// Always set initial value before altering our display component
				initialValue = null;
				widget.setValue(false);
			}
			else{
				// Always set initial value before altering our display component
				initialValue = attribute.getSV();
				widget.setValue(attribute.getSV());
			}
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null){
				// Always set initial value before altering our display component
				initialValue = null;
				widget.setValue(false);
			}
			else{
				// Always set initial value before altering our display component
				initialValue = attribute.getMVnth(attrIndex);
				widget.setValue(attribute.getMVnth(attrIndex));
			}
		}
		
	}

	// TODO: at some point, we may have to overload this to operate as
	// it did originally, but for now, we store a single label in the MvwEditor
//	@Override
//	public void setLabel(String label) {
//		if (attrIndex >= 0){
//			int display = attrIndex+1;
//			widget.setBoxLabel(label + " " + display);
////			widget.setFieldLabel(label + " " + display);
//		}
//		else {
//			widget.setBoxLabel(label);
////			widget.setFieldLabel(label);
//		}
//	}

	@Override
	public boolean valueChanged() {
		boolean rc = adapter.valueChanged();
		if (rc)
			return(rc);
		
		if (widget.getValue() == null){
			if (initialValue != null)
				rc = true;
		}
		else{
			if (initialValue == null){
				if (widget.getValue().booleanValue() == true){
					rc = true;
				}
			}
			else if (!widget.getValue().equals(initialValue))
				rc = true;
		}
			
		return(rc);
	}
		
	@Override
	public void setToolTip(String tooltip) {
		SafeHtml safeHtml = SafeHtmlUtils.fromTrustedString(tooltip);
		widget.setToolTip(safeHtml);
	}

	@Override
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	@Override
	public void setReadOnly(boolean readonly) {
		// NOTE: had to overload this because the x-form-readonly style is missing and the
		// field still appears editable but won't accept user input, which is confusing
		if (readonly)
			setEnabled(false);
		else
			setEnabled(true);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		if (!adapter.getAttributeInfo().type.equals("Boolean"))
		throw(new IllegalStateException("The GxtCheckBox editor is only applicable to Boolean values!"));
	
		this.adapter 	= adapter;
		attribute 		= (DmcTypeBoolean) adapter;
		setDisplayValue();
	}

	@Override
	public boolean isReady() {
		// We're always ready
		return(true);
	}

	@Override
	public boolean isValid() {
		return(true);
	}

	@Override
	public void resetToExisting() {
		adapter.resetToExisting();
		setDisplayValue();
	}

	@Override
	public void setEmpty() {
		if (adapter.hasValue()) {
			adapter.setEmpty();
			setDisplayValue();
		}
	}

	@Override
	public void setEnabled(boolean flag) {
		widget.setEnabled(flag);
	}

	@Override
	public Widget asWidget() {
		return(widget);
	}

	@Override
	public void focus() {
		widget.focus();
		
	}


}
