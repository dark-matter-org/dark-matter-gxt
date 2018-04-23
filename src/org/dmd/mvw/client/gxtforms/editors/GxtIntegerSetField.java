package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerListValidator;

/**
 * The GxtIntegerSetField is used to display a comma separated list of integers.
 */
//public class GxtIntegerSetField extends GxtCSVSetField<Integer> {
public class GxtIntegerSetField {

	public GxtIntegerSetField(){
		setValidator(new IntegerListValidator());
	}

	private void setValidator(IntegerListValidator integerListValidator) {
		// TODO Auto-generated method stub
		
	}
}
