package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dmc.types.DmcTypeBoolean;

//import com.extjs.gxt.ui.client.event.Events;
//import com.extjs.gxt.ui.client.event.FieldEvent;
//import com.extjs.gxt.ui.client.event.Listener;
//import com.extjs.gxt.ui.client.widget.form.Radio;
//import com.extjs.gxt.ui.client.widget.form.RadioGroup;

/**
 * The GxtBooleanOnOff is used to display boolean values as radio selection e.g. on/off
 * enabled/disabled etc. You must set the labels for the radio button choices.
 */
//public class GxtBooleanOnOff extends RadioGroup implements DmcPresentationIF {
public class GxtBooleanOnOff implements DmcPresentationIF {

	@Override
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setToolTip(String tooltip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMandatory(boolean mandatory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReadOnly(boolean readonly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAdapter(DmcAdapterIF adapter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DmcAdapterIF getAdapter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTracker(DmcPresentationTrackerIF t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetToExisting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean valueChanged() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEnabled(boolean flag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueIndex(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDMO(DmcObject dmo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DmcObject getDMO() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	// Our Unique ID assigned by the tracker
//	int							ID;
//	
//	// Whether or not we're mandatory
//	boolean 					mandatory;
//	
//	// Our attribute value adapter that also contains the original value (if any)
//	DmcAdapterIF				adapter;
//	
//	// A convenience handle to the adapter cast to an attribute
//	DmcTypeBoolean				attribute;
//	
//	// The thing that may be tracking our state of readiness
//	DmcPresentationTrackerIF	tracker;
//	
//	// This is only set if we're handling an indexed attribute, otherwise it's -1
//	int							attrIndex;
//
//	// Listener for changes in our field value - we actually listen to all key up events
//	Listener<FieldEvent>		listener;
//	
//	// We hang on to our initial value in case we have the situation where we are marked
//	// as invalid (because of a validator). If we're invalid, we won't alter the adapter
//	// and thus we have to determine ourselves if our value has changed so that we can
//	// correctly answer the tracker through the valueChanged() method.
//	Boolean						initialValue;
//	
//	Radio						radioTrue;
//	
//	Radio						radioFalse;
//
//	DmcObject					DMO;
//
//	public GxtBooleanOnOff(){
//		attrIndex = -1;
//
//		setLabelStyle(LabelStyle.style);
//
//		listener = new Listener<FieldEvent>(){
//			@Override
//			public void handleEvent(FieldEvent be) {
//				
//				if (be.getType() == Events.Change){
//					System.out.println("GxtBooleanOnOff - Something changed: " + adapter.getAttributeInfo().name + " - "+ be.getValue());
//					if (attrIndex >= 0){
//						try {
//							attribute.setMVnth(attrIndex, be.getValue());
//							READY();
//						} catch (DmcValueException e) {
//							throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + getValue(),e));
//						}
//					}
//					else{
//						try {
//							attribute.set(be.getValue());
//							READY();
//						} catch (DmcValueException e) {
//							throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + getValue(),e));
//						}
//
//					}
//				}
//			} // handleEvent
//		};
//		
//		// BIG NOTE: we only listen to the True button
//		radioTrue = new Radio();
//		radioTrue.addListener(Events.Change, listener);
//		
//		radioFalse = new Radio();
//		
//		add(radioTrue);
//		add(radioFalse);
//	}
//	
//	public boolean getCurrentValue(){
//		return(radioTrue.getValue());
//	}
//	
//	public void setTrueLabel(String label){
//		radioTrue.setBoxLabel(label);
//	}
//	
//	public void setFalseLabel(String label){
//		radioFalse.setBoxLabel(label);
//	}
//	
//	void READY(){
//		if (tracker != null)
//			tracker.isReady(this);
//	}
//	
//	void NOTREADY(){
//		if (tracker != null)
//			tracker.isNotReady(this);
//	}
//
//	@Override
//	public void setAdapter(DmcAdapterIF adapter) {
//		if (!adapter.getAttributeInfo().type.equals("Boolean"))
//			throw(new IllegalStateException("The GxtBooleanOnOff editor is only applicable to Boolean values!"));
//		
//		this.adapter 	= adapter;
//		attribute 		= (DmcTypeBoolean) adapter;
//		setDisplayValue();
//	}
//	
//	void setDisplayValue(){
//		if (attribute.getAttributeInfo().indexSize == 0){
//			if (attribute.getSV() == null){
//				// We have to set the initial value before altering the radio buttons
//				initialValue = null;
//				radioFalse.setValue(true);
//			}
//			else{
//				// We have to set the initial value before altering the radio buttons
//				initialValue = attribute.getSV();
//				if (attribute.getSV())
//					radioTrue.setValue(true);
//				else
//					radioFalse.setValue(true);
//			}
//		}
//		else{
//			Object val = attribute.getMVnth(attrIndex);
//			if (val == null){
//				initialValue = null;
//				radioTrue.setValue(false);
//			}
//			else{
//				initialValue = attribute.getMVnth(attrIndex);
//				radioTrue.setValue(attribute.getMVnth(attrIndex));
//			}
//		}
//		
//	}
//
//	@Override
//	public void setLabel(String label) {
//		if (attrIndex >= 0){
//			int display = attrIndex+1;
//			setFieldLabel(label + " " + display);
//		}
//		else
//			setFieldLabel(label);
//	}
//
//	@Override
//	public void setMandatory(boolean m) {
//		mandatory = m;
//	}
//
//	@Override
//	public DmcAdapterIF getAdapter() {
//		return(adapter);
//	}
//
//	@Override
//	public boolean isReady(){
//		// We're always ready
//		return(true);
//	}
//
//	@Override
//	public void setTracker(DmcPresentationTrackerIF t, int id) {
//		tracker = t;
//		ID = id;
//	}
//
//	@Override
//	public void setReadOnly(boolean readonly){
//		// NOTE: had to overload this because the x-form-readonly style is missing and the
//		// field still appears editable but won't accept user input, which is confusing
//		if (readonly)
//			setEnabled(false);
//		else
//			setEnabled(true);
//	}
//
//	@Override
//	public boolean valueChanged() {
//		boolean rc = adapter.valueChanged();
//		
//		System.out.println("GxtBooleanOnOff 1 value changed " + rc);
//		if (rc)
//			return(rc);
//		
//		if (initialValue == null){
//			if (radioTrue.getValue())
//				rc = true;
//		}
//		else{
//			if (initialValue == true){
//				if (radioTrue.getValue() == false)
//					rc = true;
//			}
//			else{
//				if (radioTrue.getValue() == true)
//					rc = true;
//			}
//		}
//			
//		System.out.println("GxtBooleanOnOff 2 value changed " + rc);
//		return(rc);
//	}
//
//	@Override
//	public void setValueIndex(int index) {
//		attrIndex = index;
//	}
//
//	@Override
//	public int getID() {
//		return(ID);
//	}
//
//	@Override
//	public void resetToExisting() {
//		adapter.resetToExisting();
//		setDisplayValue();
//	}
//		
//	@Override
//	public String getLabel() {
//		return(getFieldLabel());
//	}
//		
//	@Override
//	public void setDMO(DmcObject dmo) {
//		DMO = dmo;
//	}
//
//	@Override
//	public DmcObject getDMO() {
//		return(DMO);
//	}
		

}
