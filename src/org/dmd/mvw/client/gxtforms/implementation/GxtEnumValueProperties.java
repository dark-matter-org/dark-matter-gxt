package org.dmd.mvw.client.gxtforms.implementation;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface GxtEnumValueProperties extends PropertyAccess<GxtEnumValue> {

    @Path("enumValue")
    ModelKeyProvider<GxtEnumValue> key();

    LabelProvider<GxtEnumValue> label();

    ValueProvider<GxtEnumValue, String> sortOrder();

}
