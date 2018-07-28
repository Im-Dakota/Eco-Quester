package eco.quester.tabs;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.custom_objects.CTextField;
import eco.quester.listeners.ButtonActionListener;
import eco.quester.listeners.ButtonKeyListener;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	private final int VIEW_HEIGHT = Settings.FRAME_HEIGHT - 25;
	private final int VIEW_WIDTH = Settings.FRAME_WIDTH - 140;
	
	public static CTextField nameTextField;
	public static CButton searchPlayer;
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		//Code here will display when Personal Statistics is selected
		
		searchPlayer = new CButton("Find Player");
		searchPlayer.setBounds(0, this.VIEW_HEIGHT - 30, 150, 30);
		searchPlayer.addActionListener(new ButtonActionListener());
		add(searchPlayer);
		
		nameTextField = new CTextField();
		nameTextField.addKeyListener(new ButtonKeyListener("Find Player"));
		nameTextField.setBounds(150, this.VIEW_HEIGHT - 30, this.VIEW_WIDTH - 150, 30);
		add(nameTextField);
		
	}

}
