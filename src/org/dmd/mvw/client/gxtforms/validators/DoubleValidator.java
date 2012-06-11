package org.dmd.mvw.client.gxtforms.validators;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.Validator;

public class DoubleValidator implements Validator {

	boolean range;
	Double	start;
	Double	end;
	boolean integerLimited;
	int		afterDecimal;

	public DoubleValidator(int ad){
		super();
		range 			= false;
		integerLimited 	= false;
		afterDecimal 	= ad;
	}
	
	public DoubleValidator(Double s, Double e, int ad){
		super();
		range 	= true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end		= e;
		integerLimited = false;
		afterDecimal 	= ad;
	}
	
	public DoubleValidator(Double s, Double e, boolean i, int ad){
		super();
		range 	= true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end		= e;
		integerLimited = true;
		afterDecimal 	= ad;
	}
	
	
	@Override
	public String validate(Field<?> field, String value) {
		if (value == null)
			return(null);
		
		try{
			double fv = Double.parseDouble(value);
			
			if (range){
				if ((fv < start) || (fv > end))
					return("Value must be in the range " + start + " to " + end);
			}

			if (integerLimited){
				int iv = (int) fv;
				double fv2 = iv;
				if (fv > fv2)
					return("Value must be integer compatible");
			}
			
			int decimalpos = value.indexOf(".");
			if (decimalpos != -1){
				int diff = value.length() - decimalpos;
				if (diff > (afterDecimal + 1) )
					return("Only " + afterDecimal + " digits allowed after the decimal point.");
			}

//			if (!value.equals("" + fv)){
//				return("This value cannot be accuratedly represented!");
//			}
		}
		catch(NumberFormatException ex){
			return("Double value expected");
		}
		

		return null;
	}

}
