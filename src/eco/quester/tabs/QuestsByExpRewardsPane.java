package eco.quester.tabs;

import javax.swing.JPanel;

import eco.quester.custom_objects.CButton;
import eco.quester.settings.Settings;

@SuppressWarnings("serial")
public class QuestsByExpRewardsPane extends JPanel {
	
	public QuestsByExpRewardsPane() {
		setBackground(Settings.BACKGROUND_COLOR);
		setLayout(null);
		
		//Code here will display when Quests by Exp Rewards is selected
		CButton b = new CButton("Button");
		b.setBounds(5, 5, 100, 30);
		add(b);
	}

}
