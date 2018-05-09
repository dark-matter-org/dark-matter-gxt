package org.dmd.mvw.client.gxtforms;

import java.util.HashMap;
import java.util.Iterator;

import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.mvw.client.mvwforms.base.MvwFieldEditor;
import org.dmd.mvw.client.mvwforms.base.MvwFormBindingIF;

import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.form.FieldLabel;

/**
 * The GxtOneColumnForm is a convenience class that uses the DmcPresentationIF
 * supported by editors to manage your fields and wrap them with FieldLabels.
 * If you need to show/hide the fields, you just use the handle to the editor
 * available from a generated field binding to access the appropriate 
 * label/editor.
 * </p>
 * The form will be automatically populated with the editors in your form binding
 * in the order they are specified in in the FormBindingDefinition.
 */
public class GXTOneColumnForm extends VBoxLayoutContainer {

	private MvwFormBindingIF				binding;
	private HashMap<Integer,LabelAndEditor>	labelsAndEditors;
	
	public GXTOneColumnForm(VBoxLayoutAlign align, MvwFormBindingIF binding) {
		super(align);
		
		this.binding = binding;
		labelsAndEditors = new HashMap<>();
		init();
	}
	
	public GXTOneColumnForm(MvwFormBindingIF binding) {
		super();
		
		this.binding = binding;
		labelsAndEditors = new HashMap<>();
		init();
	}
	
	private void init() {
		Iterator<DmcPresentationIF> it = binding.getEditors();
		while(it.hasNext()) {
			DmcPresentationIF dpi = it.next();
			if (dpi instanceof MvwFieldEditor) {
				MvwFieldEditor editor = (MvwFieldEditor)dpi;
				FieldLabel label = new FieldLabel(editor, editor.getLabel());
				labelsAndEditors.put(editor.getID(), new LabelAndEditor(label, editor));
				if (binding.getLabelWidth() != null)
					label.setLabelWidth(binding.getLabelWidth());
				add(label);
			}
			else {
				throw(new IllegalStateException("The DmcPresentationIF implementation for label: " + dpi.getLabel() + " must be derived from MvwFieldEditor for now."));
			}
		}
	}
	
//	public void addEditor(MvwFieldEditor editor) {
//		if (labelsAndEditors.get(editor.getID()) == null) {
//			FieldLabel label = new FieldLabel(editor, editor.getLabel());
//			labelsAndEditors.put(editor.getID(), new LabelAndEditor(label, editor));
//			add(label);
//		}
//		else
//			throw(new IllegalStateException("You've added the same MvwEditor twice - label: " + editor.getLabel()));
//	}
	
	/**
	 * Shows or hides the specified editor and its associated label.
	 * @param editor the editor to show/hide
	 * @param visible true to show and false to hide
	 */
	public void setVisible(MvwFieldEditor editor, boolean visible) {
		LabelAndEditor lae = labelsAndEditors.get(editor.getID());
		if (lae == null)
			throw(new IllegalStateException("You didn't add the following editor MvwEditor - label: " + editor.getLabel()));
		
		lae.label.setVisible(visible);
	}
	
	private class LabelAndEditor {
		
		FieldLabel		label;
		@SuppressWarnings("unused")
		MvwFieldEditor	editor;
		
		public LabelAndEditor(FieldLabel label, MvwFieldEditor editor) {
			this.label = label;
			this.editor = editor;
		}
	}
}
