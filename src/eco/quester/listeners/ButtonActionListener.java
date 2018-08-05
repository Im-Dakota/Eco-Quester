package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import eco.quester.custom_frame.CustomFrame;

public class ButtonActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
		case "Apply Filter":
			CustomFrame.statusBar.setText("Applying Filter...");
			Filters.applyDifficultyFilter();
			Filters.applyLengthFilter();
//			Filters.applyQuestRewardExpFilter();
			Filters.applyCombatExpRewardFilter();
			Filters.applyNonCombatExpFilter();
			break;
		
		}
	}

}
