package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.presentation.DmcAdapterIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumMappingIF;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;
import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValueProperties;
import org.dmd.mvw.client.mvwforms.base.MvwFieldEditor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.SortDir;
import com.sencha.gxt.widget.core.client.form.ComboBox;

public class GXTEnumField extends MvwFieldEditor {
	
	private ComboBox<GxtEnumValue>	combo;
	
	private ListStore<GxtEnumValue>	store;
	
	// We hang on to this so that we can service calls to getValue()
	// properly
	private GxtEnumValue			currentValue;
	
	// A convenience handle to the adapter cast to an attribute
	private DmcAttribute<?>	attribute;

	public GXTEnumField() {
		GxtEnumValueProperties properties = GWT.create(GxtEnumValueProperties.class);
		store = new ListStore<>(properties.key());
		store.addSortInfo(new ListStore.StoreSortInfo<GxtEnumValue>(properties.sortOrder(), SortDir.ASC));
		
		combo = new ComboBox<GxtEnumValue>(store, properties.label());
		combo.setTypeAhead(true);
		combo.setTriggerAction(TriggerAction.ALL);
		
		addHandlersForEventObservation(combo, properties.label());
		
		currentValue = null;
	}
	
	public void setEnumMapping(GxtEnumMappingIF mapping) {
		if (store.size() > 0)
			store.clear();
		
		for(GxtEnumValue gev: mapping.getMapping()) {
			store.add(gev);
		}
		
		combo.setEmptyText(mapping.getEmptyText());
		setDisplayValue();
	}
		
	/**
	 * @return the current value, or null if none is selected.
	 */
	public GxtEnumValue getValue() {
		return(currentValue);
//		return(combo.getValue());
	}

	@Override
	public void setToolTip(String tooltip) {
		SafeHtml safeHtml = SafeHtmlUtils.fromTrustedString(tooltip);
		combo.setToolTip(safeHtml);
	}

	@Override
	public void setMandatory(boolean mandatory) {
		combo.setAllowBlank(!mandatory);
	}

	@Override
	public void setReadOnly(boolean readonly) {
		combo.setEditable(!readonly);

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
		if (!combo.isEnabled())
			return(true);

		// At this stage, we may or may not have been rendered. If we're not rendered, the
		// isValid() will always be false, and that's not what we want. If we have a validator,
		// we will call it directly.
		if (mandatory && (combo.getValue() == null)){
			DEBUG(attribute.getName() + " is mandatory but has no value FALSE");
			return(false);
		}

		return(true);
	}

	@Override
	public boolean isValid() {
		// If we're disabled, assume we're "ready" - this prevents problems with fields that are marked
		// as mandatory but their enable/disable state is controlled by, perhaps, a checkbox. While they
		// are disabled, that don't affect the tracker's ready state.
		if (!combo.isEnabled())
			return(true);

		boolean rc = combo.isCurrentValid();
		
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
		return(adapter.valueChanged());
 	}

	@Override
	public void setEnabled(boolean flag) {
		combo.setEnabled(flag);
	}

	@Override
	public Widget asWidget() {
		return(combo);
	}

	@Override
	public void focus() {
		// Does nothing at the moment
	}
	
	///////////////////////////////////////////////////////////////////////////
	
    private <T> void addHandlersForEventObservation(ComboBox<T> combo, final LabelProvider<T> labelProvider) {
//        combo.addValueChangeHandler(new ValueChangeHandler<T>() {
//            @Override
//            public void onValueChange(ValueChangeEvent<T> event) {
//            	if (event.getValue() == null) {	
////            		logger.fine("Nothing selected");
//            	}
//            	else {
////            		logger.fine("Selected: " + event.getValue().toString());
//            	}
//            }
//          });

    	combo.addSelectionHandler(new SelectionHandler<T>() {
            @Override
            public void onSelection(SelectionEvent<T> event) {
            	if (event.getSelectedItem() == null) {
                	DEBUG("GXTEnumField selected: null");
                	currentValue = null;
            	}
            	else {
                	DEBUG("GXTEnumField selected: " + ((GxtEnumValue)event.getSelectedItem()).getEnumValue());
                	currentValue = (GxtEnumValue)event.getSelectedItem();
                	
                	try {
						attribute.set(((GxtEnumValue)event.getSelectedItem()).getEnumValue());
						READY();
						isValid();
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Shouldn't throw an exception setting an enum value!"));
					}
            	}
            }
    	});

    }
    
	void setDisplayValue(){
		// We can only set the current value if we have a value and the mappings
		if ( (attribute.getSV() != null) && (store.size() > 0)){
			DEBUG("Trying to find enum value for: " + attribute.getSV().toString());
			GxtEnumValue current = store.findModelWithKey(attribute.getSV().toString());
			
			if (current == null){
				DEBUG("\n\n *** GXTEnumFiled - current value for " + adapter.getAttributeInfo().name + " is null. *** \n\n");
				combo.setValue(store.get(0));
				
				currentValue = null;
			}
			else{
				DEBUG("GXTEnumFiled - current is: " + current.toString());
				combo.setValue(current);
				
				currentValue = current;
			}
		}
	}

	@Override
	public void setEmpty() {
		combo.clear();
		currentValue = null;
		setDisplayValue();
		isValid();
	}



}
