package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.IntegerListValidator;

/**
 * The GXTIntegerSetField editor extends the base GXTCSVSetField to handle
 * comma separated sets of Integers.
 */
public class GXTIntegerSetField extends GXTCSVSetField<Integer> {

	public GXTIntegerSetField() {
		super(new IntegerListValidator());
	}
	
	@Override
	public void setEmpty() {
		if (adapter.hasValue()) {
			widget.setText(null);
			process();
		}
	}

}
