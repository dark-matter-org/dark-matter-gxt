package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.BasicDoubleValidator;

public class GxtDoubleField extends GxtTextField {
	
	public GxtDoubleField(){
		setValidator(new BasicDoubleValidator());
	}
}
