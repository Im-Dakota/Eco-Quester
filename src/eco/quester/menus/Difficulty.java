package eco.quester.menus;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;

public class Difficulty {
	
	public static void initQuestDifficulties(CMenuBar menuBar) {
		
		CMenu questsDifficultyMenu = new CMenu("Quest Difficulty");
		
		CCheckBoxMenuItem noviceDiff = new CCheckBoxMenuItem("Novice");
		questsDifficultyMenu.add(noviceDiff);
		
		CCheckBoxMenuItem intermediateDiff = new CCheckBoxMenuItem("Intermediate");
		questsDifficultyMenu.add(intermediateDiff);
		
		CCheckBoxMenuItem experiencedDiff = new CCheckBoxMenuItem("Experienced");
		questsDifficultyMenu.add(experiencedDiff);
		
		CCheckBoxMenuItem masterDiff = new CCheckBoxMenuItem("Master");
		questsDifficultyMenu.add(masterDiff);
		
		CCheckBoxMenuItem grandmasterDiff = new CCheckBoxMenuItem("Grand Master");
		questsDifficultyMenu.add(grandmasterDiff);
		
		CCheckBoxMenuItem specialDiff = new CCheckBoxMenuItem("Special");
		questsDifficultyMenu.add(specialDiff);
		
		menuBar.add(questsDifficultyMenu);
	}

}
