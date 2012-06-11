package org.dmd.mvw.client.gxtforms.editors;

import java.util.HashMap;
import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;
import org.dmd.mvw.client.gxtforms.widgets.CheckEnumValue;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.FieldEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;

/**
 * The GxtEnumCheckField is used to display a set of enum values as checkboxes. It 
 * is only applicable to multi-valued, unindexed values.
 */
public class GxtEnumCheckField extends CheckBoxGroup implements DmcPresentationIF {
	
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
	
	// Listener for changes in our field value - we actually listen to all key up events
	Listener<FieldEvent>		listener;
	
	// We hang on to our initial value in case we have the situation where we are marked
	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
	// and thus we have to determine ourselves if our value has changed so that we can
	// correctly answer the tracker through the valueChanged() method.
//	String						initialValue;
	
	HashMap<String,CheckEnumValue>	checkMap;
	
	DmcObject					DMO;
	
	boolean						settingDisplayValue;

	public GxtEnumCheckField(){
		setLabelStyle(LabelStyle.style);

		listener = new Listener<FieldEvent>(){
			@Override
			public void handleEvent(FieldEvent be) {
				
				if (be.getType() == Events.Change){
					CheckEnumValue checkBox = be.getComponent();
					
					if (settingDisplayValue)
						return;
					
					System.out.println("GxtEnumCheckField " + adapter.getAttributeInfo().name + " " + checkBox.getEnumValue().getEnumValue() + " " + checkBox.getValue());

					if (checkBox.getValue() == true){
						try {
							attribute.add(checkBox.getEnumValue().getEnumValue());
							READY();
						} catch (DmcValueException e) {
							throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + checkBox.getEnumValue().getEnumValue(),e));
						}
					}
					else{
						attribute.del(checkBox.getEnumValue().getEnumValue());
						READY();
					}
				}
			} // handleEvent
		};
		
	}
	
	public void setEnumMapping(GxtEnumMappingIF mapping){
		checkMap = new HashMap<String, CheckEnumValue>();
		
		for(GxtEnumValue value: mapping.getMapping()){
			CheckEnumValue check = new CheckEnumValue(value);
			check.addListener(Events.Change, listener);
			add(check);
			
			checkMap.put(value.getEnumValue(), check);
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
		if ( (adapter.getAttributeInfo().indexSize > 0) || (adapter.getAttributeInfo().valueType == ValueTypeEnum.SINGLE))
			throw(new IllegalStateException("GxtEnumCheckField: is only valid for multi-valued, unindexed values"));
			
		this.adapter 	= adapter;
		attribute 		= (DmcAttribute<?>) adapter;
		if (checkMap != null)
			setDisplayValue();
	}
	
	void setDisplayValue(){
		settingDisplayValue = true;
		
		for(CheckEnumValue check: checkMap.values()){
			check.setValue(false);
		}
		if (attribute.getMVSize() > 0){
			Iterator<?> it = attribute.getMV();
			while(it.hasNext()){
				Object key = it.next().toString();
				CheckEnumValue check = checkMap.get(key);
				if (check == null)
					throw(new IllegalStateException("GxtEnumCheckField: unknown enum value: " + key + " for attribute: " + attribute.getAttributeInfo().name));
				check.setValue(true);
			}
		}
		
		settingDisplayValue = false;
	}

	@Override
	public void setLabel(String label) {
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
		
		System.out.println("GxtEnumCheckField 1 value changed " + rc);
		if (rc)
			return(rc);
		
//		RadioEnumValue isTrue = null;
//		for(RadioEnumValue value: radioMap.values()){
//			if(value.getValue() == true){
//				isTrue = value;
//				break;
//			}
//		}
//		
//		if (initialValue == null){
//			if (isTrue != null)
//				rc = true;
//		}
//		else{
//			if (isTrue == null)
//				rc = true;
//			else{
//				if (!initialValue.equals(isTrue.getEnumValue().getEnumValue()))
//					rc = true;
//			}
//			
//		}
			
		System.out.println("GxtEnumCheckField 2 value changed " + rc);
		return(rc);
	}

	@Override
	public void setValueIndex(int index) {
		throw(new IllegalStateException("GxtEnumCheckField: is only valid for unindexed values"));
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
