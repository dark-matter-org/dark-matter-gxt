package org.dmd.mvw.client.gxtforms.validators;

/**
 * The IntegerListValidator validates a comma separated list of integers.
 * If constructed with a range, it will also check that the integers are
 * in the specified range.
 */
public class IntegerListValidator extends CommaSeparatedValuesValidator<Integer> {
	
	boolean range;
	Integer	start;
	Integer	end;
	
	public IntegerListValidator(){
		super();
		range = false;
	}

	public IntegerListValidator(Integer s, Integer e){
		super();
		range = true;
		if (s >= e)
			throw(new IllegalStateException("The start of the range must be less than the end of the range."));
		start 	= s;
		end 	= e;
	}

	@Override
	Integer typeCheck(String value) {
		try{
			Integer iv = Integer.parseInt(value);
			if (range){
				if ((iv < start) || (iv > end)){
					lastError = "Value must be in the range " + start + " - " + end;
					return(null);
				}
			}
			return(iv);
		}
		catch(NumberFormatException ex){
			lastError = "Invalid integer: " + value;
			return(null);
		}
	}

	
}
