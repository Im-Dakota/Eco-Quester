package eco.quester.custom_objects;

import java.awt.Color;

import javax.swing.JMenu;

import eco.quester.menus.FreeSkills;

@SuppressWarnings("serial")
public class CMenu extends JMenu {
	
	public CMenu(String text) {
		super(text);
		setForeground(Color.WHITE);
		setBorder(null);
	}

}
