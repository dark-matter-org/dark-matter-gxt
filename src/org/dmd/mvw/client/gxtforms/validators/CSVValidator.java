package org.dmd.mvw.client.gxtforms.validators;

import java.util.ArrayList;
import java.util.List;

import org.dmd.dmc.types.CheapSplitter;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.EditorError;
import com.sencha.gxt.widget.core.client.form.validator.AbstractValidator;

/**
 * The CSVValidator provides a common base for validators of comma separated lists of
 * values of a particular type. 
 * @param <E> the type of values e.g. Integer, String, MAC addresses etc.
 */
public abstract class CSVValidator<E> extends AbstractValidator<String> {

	ArrayList<E>		lastValues;
	
	// Derived class should assign this if they find an error during the typeCheck()
	protected String	lastError;
	
	int maxAllowedEntries = 0;
	
	protected CSVValidator() {
		lastValues = new ArrayList<E>();
	}

	protected CSVValidator(int maxAllowedEntries) {
		lastValues = new ArrayList<E>();
		this.maxAllowedEntries = maxAllowedEntries;
	}

	
	@Override
	public List<EditorError> validate(Editor<String> editor, String value) {
		while(lastValues.size() > 0)
			lastValues.remove(0);
		
		if (value == null){
			return(null);
		}
		
		if (value.trim().endsWith(","))
			return(createError(editor, "Missing value after comma.", value));			
		
		ArrayList<String> values = CheapSplitter.split(value, ',', false, true);
		for(String val: values){
			E checkedValue = typeCheck(val);
			if (checkedValue == null)
				return(createError(editor, lastError, value));
			lastValues.add(checkedValue);
		}
		
		if(maxAllowedEntries > 0){
			if(lastValues.size() > maxAllowedEntries){
				return(createError(editor, "Max allowed entries are " + maxAllowedEntries, value));
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
