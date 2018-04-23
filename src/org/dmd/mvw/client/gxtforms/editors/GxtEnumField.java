package org.dmd.mvw.client.gxtforms.editors;

import java.util.List;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;

//import com.extjs.gxt.ui.client.Style.SortDir;
//import com.extjs.gxt.ui.client.event.Events;
//import com.extjs.gxt.ui.client.event.FieldEvent;
//import com.extjs.gxt.ui.client.event.Listener;
//import com.extjs.gxt.ui.client.store.ListStore;
//import com.extjs.gxt.ui.client.widget.form.ComboBox;

//public class GxtEnumField extends ComboBox<GxtEnumValue> implements DmcPresentationIF {
public class GxtEnumField implements DmcPresentationIF {

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
//	final GxtEnumField			instance;
//	boolean 					mandatory;
//	DmcAdapterIF				adapter;
//	DmcPresentationTrackerIF	tracker;
//	
//	// A convenience handle to the adapter cast to an attribute
//	DmcAttribute<?>				attribute;
//	
//	// This is only set if we're handling an indexed attribute
//	int							attrIndex;
//	
//	Listener<FieldEvent>		listener;
//	
//	ListStore<GxtEnumValue>		enumValues;
//
//	DmcObject					DMO;
//
//	public GxtEnumField(){
//		setLabelStyle(LabelStyle.style);
//
//		instance = this;
//		
//		listener = new Listener<FieldEvent>(){
//			
//			@Override
//			public void handleEvent(FieldEvent event) {
//				
//				if (event.getType() == Events.Select){
//					List<GxtEnumValue> current = instance.getSelection();
//					if (current == null){
////						System.out.println("GxtEnumField: getSelection() null");
//					}
//					else{
//						DEBUG("GxtEnumField: " + current.get(0).getEnumValue() + " selected");
//						try {							
//							attribute.set(current.get(0).getEnumValue());
//							if (tracker != null)
//								tracker.isReady(instance);
//							isValid();
//						} catch (DmcValueException e) {
//							throw(new IllegalStateException("Shouldn't throw an exception setting an enum value!"));
//						}
//					}
//				}
//				
//			}
//			
//		};
//		
//		addListener(Events.Select, listener);
//		
//		// This has to be here in order to cause the combobox to redisplay the
//		// the pulldown after a value is selected. If you don't specify this,
//		// you get to select a single value and then can't access the pulldown!
//	    setTriggerAction(TriggerAction.ALL);
//	}
//	
//	public void setEnumMapping(GxtEnumMappingIF mapping){
//		setDisplayField("label");
//		enumValues = new ListStore<GxtEnumValue>();
//		enumValues.add(mapping.getMapping());
//		enumValues.sort("sortOrder", SortDir.ASC);
//		
//		setStore(enumValues);
//		
//		setDisplayValue();
//		
////		setValue(mapping.getMapping().get(0));
//	}
//
//	@Override
//	public void setAdapter(DmcAdapterIF adapter) {
//		this.adapter 	= adapter;
//		attribute 		= (DmcAttribute<?>) adapter;
//		setDisplayValue();
//	}
//	
//	void setDisplayValue(){
//		// We can only set the current value if we have a value and the mappings
//		if ( (attribute.getSV() != null) && (enumValues != null)){
//			DEBUG("Trying to find enum value for: " + attribute.getSV().toString());
//			
//			GxtEnumValue current = enumValues.findModel("enumValue", attribute.getSV().toString());
//			
//			if (current == null){
//				DEBUG("\n\n *** Current value for " + adapter.getAttributeInfo().name + " is null. *** \n\n");
//				setValue(enumValues.getAt(0));
////				throw(new IllegalStateException("Enum value: " + attribute.getSV().toString() + " does not match any value in available mapping, you made need to regen!"));
//			}
//			else{
//				DEBUG("Current is: " + current.toString());
//				setValue(current);
//			}
//		}
//		
//	}
//
//	@Override
//	public void setLabel(String label) {
//		setFieldLabel(label);
//	}
//
//	@Override
//	public void setMandatory(boolean m) {
//		mandatory = m;
//		if (mandatory)
//			setAllowBlank(false);
//		else
//			setAllowBlank(true);
//	}
//
//	@Override
//	public DmcAdapterIF getAdapter() {
//		return(adapter);
//	}
//
//	@Override
//	public boolean isReady(){
//		// At this stage, we may or may not have been rendered. If we're not rendered, the
//		// isValid() will always be false, and that's not what we want. If we have a validator,
//		// we will call it directly.
//		if (mandatory && (getValue() == null)){
//			DEBUG(attribute.getName() + " is mandatory but has no value FALSE");
//			return(false);
//		}
//
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
//	public boolean valueChanged() {
//		return(adapter.valueChanged());
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
//	void DEBUG(String msg){
//		if (tracker.debug())
//			System.out.println(msg);
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
//	public boolean isValid(){
//		boolean rc = super.isValid();
//		if (rc)
//			READY();
//		else
//			NOTREADY();
//		
//		return(rc);
//	}
}
