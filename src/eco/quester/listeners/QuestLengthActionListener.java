package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.menus.Difficulty;
import eco.quester.menus.Length;

public class QuestLengthActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Short":
			applyAction(Length.lengthShort);
			break;
			
		case "Medium":
			applyAction(Length.lengthMedium);
			break;
			
		case "Long":
			applyAction(Length.lengthLong);
			break;
			
		
		}
		
	}
	
	public void applyAction(CCheckBoxMenuItem item) {
		if(item.isSelected())
			Length.lengthMap.put(item.getText().toLowerCase().replaceAll(" ", ""), true);
		else
			Length.lengthMap.put(item.getText().toLowerCase().replaceAll(" ", ""), false);
	}
	
	
}
