package org.dmd.mvw.client.gxtforms.validators;

import java.util.ArrayList;

import org.dmd.dmc.types.CheapSplitter;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.Validator;

/**
 * The CommaSeparatedValuesValidator provides a common base for validating a
 * set of comma separated values of some type. Just derive from it and fill in
 * the typeCheck() method to perform the appropriate validation of the type
 * being presented.
 * @param <E>
 */
public abstract class CommaSeparatedValuesValidator<E> implements Validator {

	ArrayList<E>		lastValues;
	
	// Derived class should assign this if they find an error during the typeCheck()
	protected String	lastError;
	
	int maxAllowedEntries = 0;
	
	protected CommaSeparatedValuesValidator(){
		lastValues = new ArrayList<E>();
	}
	
	protected CommaSeparatedValuesValidator(int maxAllowedEntries){
		lastValues = new ArrayList<E>();
		this.maxAllowedEntries = maxAllowedEntries;
	}
	
	@Override
	public String validate(Field<?> field, String value) {
		while(lastValues.size() > 0)
			lastValues.remove(0);
		
		if (value == null){
			return(null);
		}
		
		if (value.trim().endsWith(","))
			return("Missing value after comma.");
			
		
		ArrayList<String> values = CheapSplitter.split(value, ',', false, true);
		for(String val: values){
			E checkedValue = typeCheck(val);
			if (checkedValue == null)
				return(lastError);
			lastValues.add(checkedValue);
		}
		
		if(maxAllowedEntries > 0){
			if(lastValues.size() > maxAllowedEntries){
				return("Max allowed entries are "+maxAllowedEntries);
			}
		}
		return null;
	}
	
	public ArrayList<E> getValues(){
		return(lastValues);
	}

	/**
	 * Derived classes must overload this method to validate the specified value.
	 * If not valid, null should be returned and lastError should be set to contain the 
	 * validation error message.
	 * @param value
	 * @return
	 */
	abstract E typeCheck(String value);

}
