package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.MACListValidator;

/**
 * The GxtMACSetField is used to display a comma separated list of MAC addresses.
 * MACs consist of the 6 tuples of 2 hex digits (using lowercase).
 */
public class GxtMACSetField extends GxtCSVSetField<String> {

	public GxtMACSetField(){
		setValidator(new MACListValidator());
	}
}
