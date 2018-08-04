package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.menus.Difficulty;

public class DifficultyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Novice":
			applyAction(Difficulty.noviceDiff);
			break;
			
		case "Intermediate":
			applyAction(Difficulty.intermediateDiff);
			break;
			
		case "Experienced":
			applyAction(Difficulty.experiencedDiff);
			break;
			
		case "Master":
			applyAction(Difficulty.masterDiff);
			break;
			
		case "Grand Master":
			applyAction(Difficulty.grandmasterDiff);
			break;
			
		case "Special":
			applyAction(Difficulty.specialDiff);
			break;
		
		}
		
	}
	
	public void applyAction(CCheckBoxMenuItem item) {
		if(item.isSelected())
			Difficulty.difficultyMap.put(item.getText().toLowerCase().replaceAll(" ", ""), true);
		else
			Difficulty.difficultyMap.put(item.getText().toLowerCase().replaceAll(" ", ""), false);
	}

}
