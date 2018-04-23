package org.dmd.mvw.client.gxtforms.validators;

import java.util.List;

import com.google.gwt.editor.client.Editor;

/**
 * The StringListValidator validates a comma separated list of strings;
 * which is to say that it doesn't do much ;-)
 */
public class StringListValidator extends CommaSeparatedValuesValidator<String> {
		
	public StringListValidator(){
		super();
	}

	
	public StringListValidator(int maxAllowedEntries) {
		super(maxAllowedEntries);
	}

	@Override
	String typeCheck(String value) {
		return(value);
	}


	@Override
	public List validate(Editor editor, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
