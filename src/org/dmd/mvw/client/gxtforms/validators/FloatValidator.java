package org.dmd.mvw.client.gxtforms.validators;

import java.util.List;

import com.google.gwt.editor.client.Editor;
import com.sencha.gxt.widget.core.client.form.Validator;

//import com.extjs.gxt.ui.client.widget.form.Field;
//import com.extjs.gxt.ui.client.widget.form.Validator;

public class FloatValidator implements Validator {

	boolean range;
	Float	start;
	Float	end;
	boolean integerLimited;
	int		afterDecimal;

	public FloatValidator(){
		super();
		range 			= false;
		integerLimited 	= false;
		afterDecimal 	= 4;
	}
	
	public FloatValidator(Float s, Float e){
		super();
		range 	= true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end		= e;
		integerLimited = false;
		afterDecimal 	= 4;
	}
	
	public FloatValidator(Float s, Float e, boolean i){
		super();
		range 	= true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end		= e;
		integerLimited = true;
		afterDecimal 	= 4;
	}
	
	
//	@Override
//	public String validate(Field<?> field, String value) {
//		if (value == null)
//			return(null);
//		
//		try{
//			float fv = Float.parseFloat(value);
//			
//			if (range){
//				if ((fv < start) || (fv > end))
//					return("Value must be in the range " + start + " to " + end);
//			}
//
//			if (integerLimited){
//				int iv = (int) fv;
//				float fv2 = iv;
//				if (fv > fv2)
//					return("Value must be integer compatible");
//			}
//			
//			// The Float will only allow for 4 digits - use a double if you need more.
//			int decimalpos = value.indexOf(".");
//			if (decimalpos != -1){
//				int diff = value.length() - decimalpos;
//				if (diff > (afterDecimal + 1))
//					return("Only " + afterDecimal + " digits allowed after the decimal point.");
//			}
//			
//			if (!value.equals("" + fv)){
//				return("This value cannot be accuratedly represented!");
//			}
//
//		}
//		catch(NumberFormatException ex){
//			return("Float value expected");
//		}
//		
//
//		return null;
//	}

	@Override
	public List validate(Editor editor, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
