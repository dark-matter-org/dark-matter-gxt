package org.dmd.mvw.client.gxtforms.editors;

import java.util.HashMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;
import org.dmd.mvw.client.gxtforms.widgets.RadioEnumValue;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.RadioGroup;

/**
 * The GxtEnumRadioField is used to display boolean values as radio selection e.g. on/off
 * enabled/disabled etc. You must set the labels for the radio button choices.
 */
public class GxtEnumRadioField extends RadioGroup implements DmcPresentationIF {
	
	// Our Unique ID assigned by the tracker
	int							ID;
	
	// Whether or not we're mandatory
	boolean 					mandatory;
	
	// Our attribute value adapter that also contains the original value (if any)
	DmcAdapterIF				adapter;
	
	// A convenience handle to the adapter cast to an attribute
	DmcAttribute<?>				attribute;
	
	// The thing that may be tracking our state of readiness
	DmcPresentationTrackerIF	tracker;
	
	// This is only set if we're handling an indexed attribute, otherwise it's -1
	int							attrIndex;

	// Listener for changes in our field value - we actually listen to all key up events
	Listener<FieldEvent>		listener;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
	String						initialValue;
	
	HashMap<String,RadioEnumValue>	radioMap;
	
	DmcObject					DMO;

	public GxtEnumRadioField(){
		attrIndex = -1;

		setLabelStyle(LabelStyle.style);

		listener = new Listener<FieldEvent>(){
			@Override
			public void handleEvent(FieldEvent be) {
				
				if (be.getType() == Events.Change){
					RadioEnumValue radio = be.getComponent();
					
					if (radio.getValue() == true){
						System.out.println("GxtEnumRadioField " + adapter.getAttributeInfo().name + " " + radio.getEnumValue().getEnumValue() + " " + radio.getValue());
						
						if (attrIndex >= 0){
							try {
								attribute.setMVnth(attrIndex, radio.getEnumValue().getEnumValue());
								READY();
							} catch (DmcValueException e) {
								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + radio.getEnumValue().getEnumValue(),e));
							}
						}
						else{
							try {
								attribute.set(radio.getEnumValue().getEnumValue());
								READY();
							} catch (DmcValueException e) {
								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + radio.getEnumValue().getEnumValue(),e));
							}
	
						}
					}
				}
			} // handleEvent
		};
		
	}
	
	public void setEnumMapping(GxtEnumMappingIF mapping){
		radioMap = new HashMap<String, RadioEnumValue>();
		
		for(GxtEnumValue value: mapping.getMapping()){
			RadioEnumValue radio = new RadioEnumValue(value);
			radio.addListener(Events.Change, listener);
			add(radio);
			
			radioMap.put(value.getEnumValue(), radio);
		}
	}
	
	void READY(){
		if (tracker != null)
			tracker.isReady(this);
	}
	
	void NOTREADY(){
		if (tracker != null)
			tracker.isNotReady(this);
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		this.adapter 	= adapter;
		attribute 		= (DmcAttribute<?>) adapter;
		if (radioMap != null)
			setDisplayValue();
	}
	
	void setDisplayValue(){
		if (attribute.getAttributeInfo().indexSize == 0){
			if (attribute.getSV() == null){
				// We have to set the initial value before altering the radio buttons
				initialValue = null;
				for(RadioEnumValue radio: radioMap.values()){
					radio.setValue(false);
				}
			}
			else{
				// We have to set the initial value before altering the radio buttons
				initialValue = attribute.getSV().toString();
				if (radioMap == null)
					throw(new IllegalStateException("setEnumMapping was not called on field: " + attribute.getAttributeInfo().name));
				
				RadioEnumValue radio = radioMap.get(initialValue);
				if (radio == null)
					throw(new IllegalStateException("GxtEnumRadioField: unknown enum value: " + attribute.getSV().toString() + " for attribute: " + attribute.getAttributeInfo().name));
				else
					radio.setValue(true);
			}
		}
		else{
			Object val = attribute.getMVnth(attrIndex);
			if (val == null){
				initialValue = null;
				for(RadioEnumValue radio: radioMap.values()){
					radio.setValue(false);
				}
			}
			else{
				initialValue = attribute.getMVnth(attrIndex).toString();
				RadioEnumValue radio = radioMap.get(initialValue);
				if (radio == null)
					throw(new IllegalStateException("GxtEnumRadioField: unknown enum value: " + attribute.getSV().toString() + " for attribute: " + attribute.getAttributeInfo().name));
				else
					radio.setValue(true);
			}
		}
		
	}

	@Override
	public void setLabel(String label) {
		if (attrIndex >= 0){
			int display = attrIndex+1;
			setFieldLabel(label + " " + display);
		}
		else
			setFieldLabel(label);
	}

	@Override
	public void setMandatory(boolean m) {
		mandatory = m;
	}

	@Override
	public DmcAdapterIF getAdapter() {
		return(adapter);
	}

	@Override
	public boolean isReady(){
		// We're always ready
		return(true);
	}

	@Override
	public void setTracker(DmcPresentationTrackerIF t, int id) {
		tracker = t;
		ID = id;
	}

	@Override
	public void setReadOnly(boolean readonly){
		// NOTE: had to overload this because the x-form-readonly style is missing and the
		// field still appears editable but won't accept user input, which is confusing
		if (readonly)
			setEnabled(false);
		else
			setEnabled(true);
	}

	@Override
	public boolean valueChanged() {
		boolean rc = adapter.valueChanged();
		
		System.out.println("GxtEnumRadioField 1 value changed " + rc);
		if (rc)
			return(rc);
		
		RadioEnumValue isTrue = null;
		for(RadioEnumValue value: radioMap.values()){
			if(value.getValue() == true){
				isTrue = value;
				break;
			}
		}
		
		if (initialValue == null){
			if (isTrue != null)
				rc = true;
		}
		else{
			if (isTrue == null)
				rc = true;
			else{
				if (!initialValue.equals(isTrue.getEnumValue().getEnumValue()))
					rc = true;
			}
			
//			if (initialValue == true){
//				if (radioTrue.getValue() == false)
//					rc = true;
//			}
//			else{
//				if (radioTrue.getValue() == true)
//					rc = true;
//			}
		}
			
		System.out.println("GxtEnumRadioField 2 value changed " + rc);
		return(rc);
	}

	@Override
	public void setValueIndex(int index) {
		attrIndex = index;
	}

	@Override
	public int getID() {
		return(ID);
	}

	@Override
	public void resetToExisting() {
		adapter.resetToExisting();
		setDisplayValue();
	}
		
	@Override
	public String getLabel() {
		return(getFieldLabel());
	}
		
	@Override
	public void setDMO(DmcObject dmo) {
		DMO = dmo;
	}

	@Override
	public DmcObject getDMO() {
		return(DMO);
	}
		

}
