package org.dmd.mvw.client.gxtforms.editors;

import org.dmd.mvw.client.gxtforms.validators.StringListValidator;

/**
 * The GXTStringSetField editor extends the base GXTCSVSetField to handle
 * comma separated sets of Strings.
 */
public class GXTStringSetField extends GXTCSVSetField<String> {
	
	public GXTStringSetField() {
		super(new StringListValidator());
	}

	@Override
	public void setEmpty() {
		if (adapter.hasValue()) {
			widget.setText(null);
			process();
		}
	}

}
