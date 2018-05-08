package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerValidator;

/**
 * The GxtIntegerField provides validation of fields containing Integer values.
 */
public class GxtIntegerField extends GXTTextField {
	
	public GxtIntegerField(){
		widget.addValidator(new IntegerValidator());
	}

	/**
	 * Provides a range checked integer field
	 * @param start the start of the range
	 * @param end the end of the range
	 */
	public GxtIntegerField(Integer start, Integer end){
		widget.addValidator(new IntegerValidator(start,end));
	}

}
