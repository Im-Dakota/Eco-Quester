package eco.quester.custom_objects;


import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBoxMenuItem;

import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class CCheckBoxMenuItem extends JCheckBoxMenuItem {
	
	public CCheckBoxMenuItem(String text) {
		super(text);
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(Color.WHITE);
		setBorder(null);
	}

	@Override
	protected void processMouseEvent(MouseEvent evt) {
		if (evt.getID() == MouseEvent.MOUSE_RELEASED && contains(evt.getPoint())) {
			doClick();
			setArmed(true);
		} else
			super.processMouseEvent(evt);
	}
	
}
