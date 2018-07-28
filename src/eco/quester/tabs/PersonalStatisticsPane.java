package eco.quester.tabs;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		CButton button = new CButton("Click Me");
		button.setBounds(5, 5, 190, 30);
		add(button);
	}

}
