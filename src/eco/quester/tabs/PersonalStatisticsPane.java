package eco.quester.tabs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.custom_objects.CTextArea;
import eco.quester.custom_objects.CTextField;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	public static CTextField nameTextField;
	public static CTextArea nameTextArea;
	public static CButton searchPlayer;
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		//Code here will display when Personal Statistics is selected
		
		nameTextField = new CTextField();
		nameTextField.setBackground(new Color(60, 60, 60));
		nameTextField.setBounds(110, Settings.FRAME_HEIGHT / 16, 150, 25);
		add(nameTextField);

		nameTextArea = new CTextArea("Player Name");
		nameTextArea.setBackground(Settings.BACKGROUND_COLOR);
		nameTextArea.setBounds(20, Settings.FRAME_HEIGHT / 16, 80, 25);
		add(nameTextArea);
		
		searchPlayer = new CButton("Search");
		searchPlayer.setBounds(270, Settings.FRAME_HEIGHT / 16, 80, 25);
		add(searchPlayer);
		
		searchPlayer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nameTextArea.setText(nameTextField.getText());
				nameTextField.setText("");
			}
		});
		
	}

}
