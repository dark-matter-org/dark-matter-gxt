package org.dmd.mvw.client.gxtforms.widgets;

import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;

import com.extjs.gxt.ui.client.widget.form.CheckBox;

public class CheckEnumValue extends CheckBox {

	GxtEnumValue	enumValue;
	
	public CheckEnumValue(GxtEnumValue ev){
		enumValue = ev;
		setBoxLabel(enumValue.getLabel());
	}

	public GxtEnumValue getEnumValue(){
		return(enumValue);
	}
}
