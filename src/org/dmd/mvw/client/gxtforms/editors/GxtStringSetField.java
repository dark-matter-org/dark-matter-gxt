package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.StringListValidator;


/**
 * The GxtStringSetField is used to display a comma separated list of strings.
 */
public class GxtStringSetField extends GxtCSVSetField<String> {

	public GxtStringSetField(){
		setValidator(new StringListValidator());
	}
}
