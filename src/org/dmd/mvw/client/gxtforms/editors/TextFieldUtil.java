package org.dmd.mvw.client.gxtforms.editors;

import com.sencha.gxt.widget.core.client.form.TextField;

/**
 * A utility for dealing with the TextField. 
 */
public class TextFieldUtil {

	static public boolean hasValue(TextField field) {
		if (field.getText() == null)
			return(false);
		if (field.getText().length() == 0)
			return(false);
		if (field.getText().trim().length() == 0)
			return(false);
		return(true);
	}

	static public boolean isEmpty(TextField field) {
		if (field.getText() == null)
			return(true);
		if (field.getText().length() == 0)
			return(true);
		if (field.getText().trim().length() == 0)
			return(true);
		return(false);
	}
}
