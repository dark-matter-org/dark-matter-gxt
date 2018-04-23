package org.dmd.mvw.client.gxtforms.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

//import com.extjs.gxt.ui.client.Style.SortDir;
//import com.extjs.gxt.ui.client.event.Events;
//import com.extjs.gxt.ui.client.event.FieldEvent;
//import com.extjs.gxt.ui.client.event.Listener;
//import com.extjs.gxt.ui.client.store.ListStore;
//import com.extjs.gxt.ui.client.widget.form.ComboBox;

//public class GxtObjectRefComboBox extends ComboBox<GxtObjectReference> implements DmcPresentationIF {
public class GxtObjectRefComboBox implements DmcPresentationIF {

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
	
//	final GxtObjectRefComboBox		instance;
//	
//	// Our Unique ID assigned by the tracker
//	int								ID;
//	DmcAdapterIF					adapter;
//	DmcPresentationTrackerIF		tracker;
//	
//	// A convenience handle to the adapter cast to an attribute
//	DmcAttribute<?>					attribute;
//	
//	// This is only set if we're handling an indexed attribute
//	int								attrIndex;
//	
//	Listener<FieldEvent>			listener;
//	
//	ListStore<GxtObjectReference>	objRefs;
//	
//	// Utility list for setting the selected reference
//	List<GxtObjectReference>		selection;
//	GxtObjectReference				unsetValue;
//	
//	boolean							mandatory;
//	
//	// Allows us to look up the reference based on the object name
//	HashMap<DmcObjectName,GxtObjectReference>	nameToReference;
//	
//	GxtObjectReference				initialValue;
//	
//	DmcObject					DMO;
//
//	public GxtObjectRefComboBox(){
//		instance = this;
//		setLabelStyle(LabelStyle.style);
//		selection = new ArrayList<GxtObjectReference>();
//		
//		attrIndex = -1;
//		
//		listener = new Listener<FieldEvent>(){
//			
//			@Override
//			public void handleEvent(FieldEvent event) {
//				
//				if (event.getType() == Events.Select){
//					if (getValue() == unsetValue){
//						if (debug())
//							System.out.println("GxtObjectRefComboBox - value unset");
//						
//						if (attrIndex >= 0){
//							try {
//								attribute.setMVnth(attrIndex, null);
//							} catch (DmcValueException e) {
//								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + getValue(),e));
//							}
//						}
//						else{
//							adapter.setEmpty();
//						}
//						
//						if (mandatory)
//							NOTREADY();
//						else
//							READY();
//					}
//					else {
//						if (debug())
//							System.out.println("GxtObjectRefComboBox - value set: " + getValue().getObjectName());
//
//						if (attrIndex >= 0){
//							try {
//								attribute.setMVnth(attrIndex, getValue().getObjectName());
//							} catch (DmcValueException e) {
//								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on setMVnth(): " + getValue(),e));
//							}
//						}
//						else{
//							try {
//								attribute.set(getValue().getObjectName());
//							} catch (DmcValueException e) {
//								throw(new IllegalStateException("Underlying attribute " + attribute.getName() + " should not throw an exception on set(): " + getValue().getObjectName(),e));
//							}
//						}
//						
////						if (mandatory)
////							NOTREADY();
////						else
//							READY();
//					}
//				}
//				
//			}
//		};
//
//		addListener(Events.Select, listener);
//		
//		objRefs = new ListStore<GxtObjectReference>();
//		objRefs.setMonitorChanges(true);
//		objRefs.setDefaultSort("sortOrder", SortDir.ASC);
//		
//		setStore(objRefs);
//
//		// This has to be here in order to cause the combobox to redisplay the
//		// the pulldown after a value is selected. If you don't specify this,
//		// you get to select a single value and then can't access the pulldown!
//	    setTriggerAction(TriggerAction.ALL);
//	    
//	    mandatory = false;
//
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
//	boolean debug(){
//		if (tracker == null)
//			return(false);
//		if (tracker.debug())
//			return(true);
//		return(false);
//	}
//
//	/**
//	 * You must call this method to populate the combo box with the allowable object references.
//	 * By convention, the first value in the list should be your "unset" value - which will not
//	 * have an actual object reference, just a label to indicate that the reference isn't set.
//	 * @param reflist The reference list.
//	 */
//	public void setObjectReferences(List<GxtObjectReference> reflist){
//		if (reflist.size() == 0)
//			return;
//		
//		setDisplayField("userLabel");
//		unsetValue = reflist.get(0);
//		
//		nameToReference = new HashMap<DmcObjectName, GxtObjectReference>();
//		for(GxtObjectReference ref: reflist){
//			if (ref.getObjectName() != null)
//				nameToReference.put(ref.getObjectName(), ref);
//		}
//
//		if (objRefs.getCount() > 0)
//			objRefs.removeAll();
//		
//		objRefs.add(reflist);
//		objRefs.sort("sortOrder", SortDir.ASC);
//		
//		if (attribute == null)
//			setValue(unsetValue);
//		else
//			setDisplayValue();
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
//		if (attribute.getAttributeInfo().indexSize == 0){
//			DmcNamedObjectREF<?> val = (DmcNamedObjectREF<?>) attribute.getSV();
//			if (val == null){
//				setValue(unsetValue);
//				initialValue = unsetValue;
//			}
//			else{
//				GxtObjectReference ref = nameToReference.get(val.getObjectName());
//				if (ref == null)
//					throw(new IllegalStateException("Could not find mapping for: " + val.getObjectName().getNameString()));
//				setValue(ref);
//				initialValue = ref;
//			}
//		}
//		else{
//			DmcNamedObjectREF<?> val = (DmcNamedObjectREF<?>) attribute.getMVnth(attrIndex);
//			if (val == null){
//				setValue(unsetValue);
//				initialValue = unsetValue;
//			}
//			else{
//				GxtObjectReference ref = nameToReference.get(val.getObjectName());
//				if (ref == null)
//					throw(new IllegalStateException("Could not find mapping for: " + val.getObjectName().getNameString()));
//				setValue(ref);
//				initialValue = ref;
//			}
//		}
//	}
//
//	@Override
//	public DmcAdapterIF getAdapter() {
//		return(adapter);
//	}
//
//	@Override
//	public int getID() {
//		return(ID);
//	}
//
//	@Override
//	public boolean isReady() {
//		if (mandatory){
//			if (getValue() == unsetValue)
//				return(false);
//		}
//		return(true);
//	}
//
//	@Override
//	public void resetToExisting() {
//		adapter.resetToExisting();
//		setDisplayValue();
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
////		setFieldLabel(label);
//	}
//
//	@Override
//	public void setMandatory(boolean m) {
//		mandatory = m;
//		boolean v = isValid();
//		if (v)
//			READY();
//		else
//			NOTREADY();
//	}
//
//	@Override
//	public void setTracker(DmcPresentationTrackerIF t, int id) {
//		tracker = t;
//		ID = id;
//	}
//
//	@Override
//	public void setValueIndex(int index) {
//		attrIndex = index;
//	}
//
//	@Override
//	public boolean valueChanged() {
//		if (initialValue == getValue())
//			return(false);
//		return(true);
//	}
//	
//	public boolean isMandatory(){
//		return(mandatory);
//	}
//	
//	public boolean hasValueSet(){
//		if (getValue() == unsetValue)
//			return(false);
//		return(true);
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
