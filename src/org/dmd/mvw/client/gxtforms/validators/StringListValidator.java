package org.dmd.mvw.client.gxtforms.validators;

/**
 * The StringListValidator validates a comma separated list of strings;
 * which is to say that it doesn't do much ;-)
 */
public class StringListValidator extends CSVValidator<String> {
		
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
	
}
