package org.dmd.mvw.client.gxtforms.editors;

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

//import com.extjs.gxt.ui.client.Style.SelectionMode;
//import com.extjs.gxt.ui.client.Style.SortDir;
//import com.extjs.gxt.ui.client.event.DNDListener;
//import com.extjs.gxt.ui.client.store.ListStore;
//import com.extjs.gxt.ui.client.store.Store;
//import com.extjs.gxt.ui.client.store.StoreEvent;
//import com.extjs.gxt.ui.client.store.StoreListener;
//import com.extjs.gxt.ui.client.widget.form.DualListField;
//import com.google.gwt.user.client.Element;

//public class GxtDualListReferenceField extends DualListField<GxtObjectReference> implements DmcPresentationIF {
public class GxtDualListReferenceField implements DmcPresentationIF {

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
//	// Whether or not we're mandatory
//	boolean 					mandatory;
//	
//	// Our attribute value adapter that also contains the original value (if any)
//	DmcAdapterIF				adapter;
//	
//	// A convenience handle to the adapter cast to an attribute
//	DmcAttribute<?>				attribute;
//	
//	// The thing that may be tracking our state of readiness
//	DmcPresentationTrackerIF	tracker;
//	
//	// This is only set if we're handling an indexed attribute, otherwise it's -1
//	int							attrIndex;
//	
//	// Allows us to look up the reference based on the object name
//	HashMap<DmcObjectName,GxtObjectReference>	nameToReference;
//	
//	ListStore<GxtObjectReference>				available;
//	
//	ListStore<GxtObjectReference>				selected;
//	
//	DNDListener									dndListener;
//	
//	StoreListener<GxtObjectReference>			storeListener;
//
//	DmcObject					DMO;
//
//	public GxtDualListReferenceField(){
//		setMode(Mode.INSERT);
//		attrIndex = -1;
//		fromField.setDisplayField("userLabel");
//		fromField.setFieldLabel("FROM");
//		fromField.getListView().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//		
//		toField.setDisplayField("userLabel");
//		toField.setFieldLabel("TO");
//		toField.getListView().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//		
//		storeListener = new StoreListener<GxtObjectReference>() {
//			@Override
//			public void handleEvent(StoreEvent<GxtObjectReference> be) {
//				DEBUG("GOT EVENT");
//				
//				if (be.getType() == Store.Add){
//					DEBUG("ADD");
//					try {
//						attribute.add(be.getModels().get(0).objName);
//						READY();
//					} catch (DmcValueException e) {
//						throw(new IllegalStateException("Adding an object name to an MV object reference shouldn't thrown an exception", e));
//					}
//				}
//				else if (be.getType() == Store.Remove){
//					DEBUG("REMOVE");
//					attribute.del(be.getModel().objName);
//					if (mandatory && (selected.getCount() == 0))
//						NOTREADY();
//					else
//						READY();
//				}
//			}
//		};
//		
//		available = new ListStore<GxtObjectReference>();
//		available.setDefaultSort("userLabel", SortDir.ASC);
//		available.setMonitorChanges(true);
//		toField.setStore(available);
//		
//		selected = new ListStore<GxtObjectReference>();
//		selected.setMonitorChanges(true);
//		fromField.setStore(selected);
//	}
//	
//	public void setSelectedEnabled(boolean enabled){
//		fromField.setEnabled(enabled);
//	}
//	
//	public void setAvailableEnabled(boolean enabled){
//		toField.setEnabled(enabled);
//	}
//	
//	public List<GxtObjectReference> getSelected(){
//		return(selected.getModels());
//	}
//	
//	public int getSelectedSize(){
//		return(selected.getCount());
//	}
//	
//	void startListening(){
//		selected.addStoreListener(storeListener);
//	}
//	
//	void stopListening(){
//		selected.removeStoreListener(storeListener);
//	}
//	
//	@Override
//	protected void onRender(Element target, int index) {
//		super.onRender(target, index);
//		allLeft.setVisible(false);
//		allRight.setVisible(false);
//		up.setVisible(false);
//		down.setVisible(false);
//	}
//	
//	/**
//	 * You must call this method to populate the set of available choices.
//	 * @param reflist
//	 */
//	public void setObjectReferences(List<GxtObjectReference> reflist){
//		DEBUG("GxtDualListReferenceField.setObjectReferences() " + reflist.size());
//		boolean update = false;
//		
//		// If we reset the references after we're initialized we should update the
//		// displayed value.
//		if (nameToReference != null)
//			update = true;
//		
//		nameToReference = new HashMap<DmcObjectName, GxtObjectReference>();
//		
//		for(GxtObjectReference ref: reflist){
//			nameToReference.put(ref.getObjectName(), ref);
//		}
//		
//		if (update)
//			setDisplayValue();
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
//	void setDisplayValue(){
//		if (nameToReference == null)
//			return;
//		
//		stopListening();
//		
//		if (available.getCount() > 0){
//			available.removeAll();
//		}
//		
//		for(GxtObjectReference ref: nameToReference.values())
//			available.add(ref);
//
//		if (selected.getCount() > 0)
//			selected.removeAll();
//		
//		if (attribute.getMVSize() > 0){
//			for(int i=0; i<attribute.getMVSize(); i++){
//				DmcNamedObjectREF<?> val = (DmcNamedObjectREF<?>) attribute.getMVnth(i);
//				if (val != null) {
//					GxtObjectReference ref = nameToReference.get(val.getObjectName());
//					if (ref == null) {
//						System.out.println("GxtDualListReferenceField: DON'T HAVE " 	+ val.getObjectName().getNameString());
//					} else {
//						available.remove(ref);
//						selected.add(ref);
//					}
//				}
//			}
//		}
//		
//		available.sort("userLabel", SortDir.ASC);
//		
//		startListening();
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
///*	@Override
//	public boolean isReady() {
//		return(true);
//	}*/
//
//	@Override
//	public boolean isReady() {
//		if (mandatory && (selected.getCount() == 0))
//			return (false);
//
//		return (true);
//	}
//	
//	@Override
//	public void resetToExisting() {
//		adapter.resetToExisting();
//		setDisplayValue();
//	}
//
//	@Override
//	public void setAdapter(DmcAdapterIF a) {
//		adapter = a;
//		attribute = (DmcAttribute<?>) adapter;
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
//	}
//
//	/*@Override
//	public void setMandatory(boolean m) {
//		mandatory = m;
//	}*/
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
//	public boolean isMandatory(){
//		return(mandatory);
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
//		return(adapter.valueChanged());
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
		

}
