package eco.quester.tabs;

import java.awt.Color;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.custom_objects.CTextArea;
import eco.quester.custom_objects.CTextField;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	public static CTextField nameTextField;
	public static CTextArea nameTextArea;
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		//Code here will display when Personal Statistics is selected
		
		nameTextField = new CTextField();
		nameTextField.setBackground(new Color(60, 60, 60));
		nameTextField.setBounds(Settings.FRAME_WIDTH / 2, Settings.FRAME_HEIGHT / 8, 150, 25);
		add(nameTextField);

		nameTextArea = new CTextArea("Player Name");
		nameTextArea.setBackground(Settings.BACKGROUND_COLOR);
		nameTextArea.setBounds(Settings.FRAME_WIDTH / 4, Settings.FRAME_HEIGHT / 8, 150, 25);
		add(nameTextArea);
		
		
	}

}
