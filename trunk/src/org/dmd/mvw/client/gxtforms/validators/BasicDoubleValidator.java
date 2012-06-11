package org.dmd.mvw.client.gxtforms.validators;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.Validator;

public class BasicDoubleValidator implements Validator{

	@Override
	public String validate(Field<?> field, String value) {
		if (value == null)
			return(null);
		
		try{
			Double.parseDouble(value);
		}
		catch(NumberFormatException ex){
			return("Double value expected");
		}
		return null;
	}

}
