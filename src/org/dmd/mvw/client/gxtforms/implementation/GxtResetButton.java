package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.presentation.DmcChangeListenerIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;

import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * The GxtResetButton is used to reset a form to its initial state by calling the reset()
 * method on the DmcPresentationTrackerIF implementation. Another component can listen
 * for this event so that additional reset behaviour can be triggered.
 */
public class GxtResetButton extends TextButton implements DmcChangeListenerIF {
	
	private DmcPresentationTrackerIF tracker;
	private GxtResetButtonListenerIF clickListener;
	
	public GxtResetButton(String label, DmcPresentationTrackerIF tr, GxtResetButtonListenerIF cl) {
		super(label);
		
		this.tracker = tr;
		this.clickListener = cl;

		addSelectHandler(new SelectHandler() {
			
			@Override
			public void onSelect(SelectEvent event) {
				tracker.reset();
				clickListener.resetButtonClicked();
			}
		});
		
		tracker.addChangeListener(this);
		
		setEnabled(false);
	}

	/**
	 * This button should only be enabled when something has changed on the form. The
	 * tracker will call this method when any modification occurs and indicate if the
	 * initial state of the form has changed.
	 */
	@Override
	public void isChanged(boolean changed) {
		setEnabled(changed);
	}

}
