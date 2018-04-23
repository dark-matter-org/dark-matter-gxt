package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerValidator;


public class GxtIntegerField extends GXTTextField {
	
	public GxtIntegerField(){
		setValidator(new IntegerValidator());
	}

	private void setValidator(IntegerValidator integerValidator) {
		// TODO Auto-generated method stub
		
	}
}
