package org.dmd.mvw.client.gxtforms.validators;

import java.util.List;

import com.google.gwt.editor.client.Editor;
import com.sencha.gxt.widget.core.client.form.Validator;

//import com.extjs.gxt.ui.client.widget.form.Field;
//import com.extjs.gxt.ui.client.widget.form.Validator;

/**
 * The IntegerValidator validates that a value is an integer and, if it was constructed
 * with a range, will also perform range checking.
 */
public class IntegerValidator implements Validator {
	
	boolean range;
	Integer	start;
	Integer	end;
	
	public IntegerValidator(){
		super();
		range = false;
	}

	public IntegerValidator(Integer s, Integer e){
		super();
		range = true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end 	= e;
	}

//	@Override
//	public String validate(Field<?> field, String value) {
//		if (value == null)
//			return(null);
//		
//		try{
//			int iv = Integer.parseInt(value);
//			
//			if (range){
//				if ((iv < start) || (iv > end))
//					return("Value must be in the range " + start + " - " + end);
//			}
//		}
//		catch(NumberFormatException ex){
//			return("Integer value expected");
//		}
//		
//		return null;
//	}

	@Override
	public List validate(Editor editor, Object value) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
