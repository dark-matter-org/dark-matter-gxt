package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerValidator;


public class GxtIntegerField extends GxtTextField {
	
	public GxtIntegerField(){
		setValidator(new IntegerValidator());
	}
}
