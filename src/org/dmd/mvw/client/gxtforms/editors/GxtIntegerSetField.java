package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerListValidator;

/**
 * The GxtIntegerSetField is used to display a comma separated list of integers.
 */
public class GxtIntegerSetField extends GxtCSVSetField<Integer> {

	public GxtIntegerSetField(){
		setValidator(new IntegerListValidator());
	}
}
