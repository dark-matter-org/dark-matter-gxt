package org.dmd.mvw.client.gxtforms.implementation;

import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dmc.presentation.DmcReadyListenerIF;

import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.event.ShowEvent;
import com.sencha.gxt.widget.core.client.event.ShowEvent.ShowHandler;

/**
 * The GxtApplyButton is used to trigger application of changes made to
 * a DmcObject via a form.
 */
public class GxtApplyButton extends TextButton implements DmcReadyListenerIF {
	
	private DmcPresentationTrackerIF tracker;
	private GxtApplyButtonListenerIF clickListener;
	
	public GxtApplyButton(String label, DmcPresentationTrackerIF tr, GxtApplyButtonListenerIF cl) {
		super(label);
		
		this.tracker = tr;
		this.clickListener = cl;
		
		addSelectHandler(new SelectHandler() {
			
			@Override
			public void onSelect(SelectEvent event) {
				clickListener.applyButtonClicked();
			}
		});
		
		addShowHandler(new ShowHandler() {
			
			@Override
			public void onShow(ShowEvent event) {
				tracker.startTracking();
			}
		});
		
		tracker.addReadyListener(this);
		
		setEnabled(false);
	}

	@Override
	public void isReady(boolean ready) {
		setEnabled(ready);
	}


}
