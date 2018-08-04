package eco.quester.custom_objects;

import javax.swing.JMenuBar;

import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class CMenuBar extends JMenuBar {
	
	public CMenuBar() {
		super();
		setBorder(null);
		setBackground(Settings.BACKGROUND_COLOR);
	}

}
