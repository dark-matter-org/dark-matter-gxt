package org.dmd.mvw.client.gxtforms.implementation;

import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * The GxtCancelButton is used to cancel an overall operation e.g. editting an object.
 */
public class GxtCancelButton extends TextButton {
	
	private GxtCancelButtonListenerIF clickListener;
	
	public GxtCancelButton(String label, GxtCancelButtonListenerIF cl) {
		super(label);
		
		this.clickListener = cl;

		addSelectHandler(new SelectHandler() {
			
			@Override
			public void onSelect(SelectEvent event) {
				clickListener.cancelButtonClicked();
			}
		});
		
		setEnabled(true);
	}

}
