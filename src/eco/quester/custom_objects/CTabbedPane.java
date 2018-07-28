package eco.quester.custom_objects;
import java.awt.Color;

import javax.swing.JTabbedPane;

import eco.quester.settings.*;

@SuppressWarnings("serial")
public class CTabbedPane extends JTabbedPane {
	
	public CTabbedPane(){	//Simple class that sets some standards for the CTabbedPane
		
		setBackground(Settings.BACKGROUND_COLOR.darker());
		setForeground(Color.WHITE);
		setBorder(null);
		
	}

}
