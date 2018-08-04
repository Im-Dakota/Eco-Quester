package eco.quester.custom_objects;

import java.awt.Color;

import javax.swing.JMenu;

import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class CMenu extends JMenu {
	
	public CMenu(String text) {
		super(text);
		setForeground(Color.WHITE);
		setOpaque(true);
		setBackground(Settings.BACKGROUND_COLOR);
		setBorder(null);
	}

}
