package org.dmd.mvw.client.gxtforms.widgets;

import org.dmd.mvw.client.gxtforms.implementation.GxtEnumValue;

//import com.extjs.gxt.ui.client.widget.form.Radio;

//public class RadioEnumValue extends Radio {
public class RadioEnumValue {

	GxtEnumValue	enumValue;
	
	public RadioEnumValue(GxtEnumValue ev){
		enumValue = ev;
//		setBoxLabel(enumValue.getLabel());
	}

	public GxtEnumValue getEnumValue(){
		return(enumValue);
	}
}
