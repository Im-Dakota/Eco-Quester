package eco.quester.tabs;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class PersonalStatisticsPane extends JPanel {
	
	public PersonalStatisticsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		CButton button = new CButton("Button A");
		button.setBounds(5, 5, 190, 30);
		add(button);
		button.addActionListener(e -> {
			System.out.println("Fuck me in the ass, please");
		});
		
		CButton button2 = new CButton("Button B");
		button2.setBounds(5, 50, 190, 30);
		add(button2);
	}

}
