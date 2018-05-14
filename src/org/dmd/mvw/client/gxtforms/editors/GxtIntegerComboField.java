package org.dmd.mvw.client.gxtforms.editors;

import java.util.ArrayList;
import java.util.List;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;

//import com.extjs.gxt.ui.client.Style.SortDir;
//import com.extjs.gxt.ui.client.event.Events;
//import com.extjs.gxt.ui.client.event.FieldEvent;
//import com.extjs.gxt.ui.client.event.Listener;
//import com.extjs.gxt.ui.client.store.ListStore;
//import com.extjs.gxt.ui.client.widget.form.ComboBox;

/**
 * The GxtIntegerComboField provides a integer value picker with an "off" indication.
 */
//public class GxtIntegerComboField extends ComboBox<GxtEnumValue> implements DmcPresentationIF {
public class GxtIntegerComboField implements DmcPresentationIF {

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

	@Override
	public void setEmpty() {
		// TODO Auto-generated method stub
		
	}
	
//	// Our Unique ID assigned by the tracker
//	int							ID;
//	
//	final GxtIntegerComboField			instance;
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
//	GxtEnumValue 				off;
//	
//	List<GxtEnumValue> 			selected;
//
//	DmcObject					DMO;
//
//	public GxtIntegerComboField(){
//		setLabelStyle(LabelStyle.style);
//		
//		selected = new ArrayList<GxtEnumValue>();
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
//						System.out.println("GxtEnumField: " + current.get(0).getEnumValue() + " selected");
//						try {
////							if (current.get(0) == off)
////								adapter.setEmpty();
////							else
//								attribute.set(current.get(0).getNumericValue());
//							
//							if (tracker != null)
//								tracker.isReady(instance);
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
//	public void initialize(String offLabel, int offValue, int start, int end, int step){
//		List<GxtEnumValue>	values = new ArrayList<GxtEnumValue>();
//		
//		off = new GxtEnumValue(offLabel, offValue, "000", offLabel);
//		values.add(off);
//		
//		for(int i=start; i<=end; i+=step){
//			String sort = "" + i;
//			if (sort.length() == 1)
//				sort = "00" + sort;
//			else if (sort.length() == 2)
//				sort = "0" + sort;
//			values.add(new GxtEnumValue("" + i, i, sort, "" + i));
//		}
//		
//		setDisplayField("label");
//		enumValues = new ListStore<GxtEnumValue>();
//		enumValues.add(values);
//		enumValues.sort("sortOrder", SortDir.ASC);
//		
//		setStore(enumValues);
//		
//		setValue(off);
//	}
//	
//	public void initialize(int start, int end, int step){
//		List<GxtEnumValue>	values = new ArrayList<GxtEnumValue>();
//		
//		for(int i=start; i<=end; i+=step){
//			String sort = "" + i;
//			if (sort.length() == 1)
//				sort = "00" + sort;
//			else if (sort.length() == 2)
//				sort = "0" + sort;
//			values.add(new GxtEnumValue("" + i, i, sort, "" + i));
//		}
//		
//		setDisplayField("label");
//		enumValues = new ListStore<GxtEnumValue>();
//		enumValues.add(values);
//		enumValues.sort("sortOrder", SortDir.ASC);
//		
//		setStore(enumValues);
//		
//		setValue(off);
//	}
//	
////	public void setEnumMapping(GxtEnumMappingIF mapping){
////		setDisplayField("label");
////		enumValues = new ListStore<GxtEnumValue>();
////		enumValues.add(mapping.getMapping());
////		enumValues.sort("sortOrder", SortDir.ASC);
////		
////		setStore(enumValues);
////		
////		setValue(mapping.getMapping().get(0));
////	}
//	
//	public void forceRefresh(){
//		setDisplayValue();
//		if (tracker != null)
//			tracker.isReady(instance);
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
//			GxtEnumValue current = enumValues.findModel("enumValue", attribute.getSV().toString());
//			
//			if (current == null){
////				throw(new IllegalStateException("Enum value: " + attribute.getSV().toString() + " does not match all value in available mapping, you made need to regen!"));
//			}
//			else{
//				if (selected.size() > 0)
//					selected.remove(0);
//				selected.add(current);
//				setSelection(selected);
//			}
//		}
//		if (attribute.getSV() == null){
//			if (selected.size() > 0)
//				selected.remove(0);
//			selected.add(off);
//			setSelection(selected);
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
//			System.out.println(attribute.getName() + " is mandatory but has no value FALSE");
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

}
