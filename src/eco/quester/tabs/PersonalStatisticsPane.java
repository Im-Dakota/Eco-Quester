package eco.quester.tabs;

import java.awt.Color;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.custom_objects.CTextArea;
import eco.quester.custom_objects.CTextField;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		CButton grabStats = new CButton("Grab Stats");
		grabStats.setBounds(5, Settings.FRAME_HEIGHT - 65, 190, 30);
		add(grabStats);
		
		CTextField nameField = new CTextField("Im Dakota");
		nameField.setBounds(200, Settings.FRAME_HEIGHT - 65, 265, 30);
		add(nameField);
		
		CTextArea console = new CTextArea("I am so god damn tired.");
		console.setBackground(Settings.BACKGROUND_COLOR);
		console.setForeground(Color.WHITE);
		console.setBounds(5, 5, 460, Settings.FRAME_HEIGHT - 75);
		add(console);
		
		grabStats.addActionListener(e -> {
			console.setText("I'm so fucking tired..");
		});
		
	}

}
