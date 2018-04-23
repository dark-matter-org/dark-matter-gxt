package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.BasicDoubleValidator;

public class GxtDoubleField extends GXTTextField {
	
	public GxtDoubleField(){
		setValidator(new BasicDoubleValidator());
	}

	private void setValidator(BasicDoubleValidator basicDoubleValidator) {
		// TODO Auto-generated method stub
		
	}
}
