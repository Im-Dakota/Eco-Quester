package eco.quester.menus;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;

public class Length {
	
	public static void initQuestLength(CMenuBar menuBar) {
		
		CMenu questLengthMenu = new CMenu("Quest Length");
	
		CCheckBoxMenuItem shortLength = new CCheckBoxMenuItem("Short");
		questLengthMenu.add(shortLength);
		
		CCheckBoxMenuItem mediumLength = new CCheckBoxMenuItem("Medium");
		questLengthMenu.add(mediumLength);
		
		CCheckBoxMenuItem longLength = new CCheckBoxMenuItem("Long");
		questLengthMenu.add(longLength);
		
		menuBar.add(questLengthMenu);
		
	}

}
