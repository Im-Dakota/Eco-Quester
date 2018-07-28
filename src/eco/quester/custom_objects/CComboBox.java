package eco.quester.custom_objects;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;

import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class CComboBox extends JComboBox<String> {
	
	public CComboBox(String string, String[] options) {
		setEditable(true);
		setSelectedItem(string);
		setEditable(false);
		
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(Color.WHITE);
		setBorder(null);
		for(Component c : getComponents()) {
			if(c instanceof JButton)
				remove(c);
		}
		
		for(String s : options) {
			addItem(s);
		}
	}
	
	public CComboBox(String item1, String item2) {
		setBackground(Settings.BACKGROUND_COLOR);
		setForeground(Color.WHITE);
		setBorder(null);
		
		addItem(item1);
		addItem(item2);
	}

}
