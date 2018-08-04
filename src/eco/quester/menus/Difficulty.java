package eco.quester.menus;


import java.util.HashMap;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;
import eco.quester.listeners.DifficultyActionListener;

public class Difficulty {
	
	public static CCheckBoxMenuItem noviceDiff;
	public static boolean novice = false;
	public static CCheckBoxMenuItem intermediateDiff;
	public static boolean intermediate = false;
	public static CCheckBoxMenuItem experiencedDiff;
	public static boolean experienced = false;
	public static CCheckBoxMenuItem masterDiff;
	public static boolean master = false;
	public static CCheckBoxMenuItem grandmasterDiff;
	public static boolean grandmaster = false;
	public static CCheckBoxMenuItem specialDiff;
	public static boolean special = false;
	
	public static HashMap<String, Boolean> difficultyMap;
	
	public static void fillDifficultyMap() {
		difficultyMap = new HashMap<String, Boolean>();
		difficultyMap.put("Novice".toLowerCase(), novice);
		difficultyMap.put("Intermediate".toLowerCase(), intermediate);
		difficultyMap.put("Experienced".toLowerCase(), experienced);
		difficultyMap.put("Master".toLowerCase(), master);
		difficultyMap.put("Grandmaster".toLowerCase(), grandmaster);
		difficultyMap.put("Special".toLowerCase(), special);
	}
	
	public static void initQuestDifficulties(CMenuBar menuBar) {
		fillDifficultyMap();
		
		CMenu questsDifficultyMenu = new CMenu("Quest Difficulty");
		
		noviceDiff = new CCheckBoxMenuItem("Novice");
		noviceDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(noviceDiff);
		
		intermediateDiff = new CCheckBoxMenuItem("Intermediate");
		intermediateDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(intermediateDiff);
		
		experiencedDiff = new CCheckBoxMenuItem("Experienced");
		experiencedDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(experiencedDiff);
		
		masterDiff = new CCheckBoxMenuItem("Master");
		masterDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(masterDiff);
		
		grandmasterDiff = new CCheckBoxMenuItem("Grand Master");
		grandmasterDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(grandmasterDiff);
		
		specialDiff = new CCheckBoxMenuItem("Special");
		specialDiff.addActionListener(new DifficultyActionListener());
		questsDifficultyMenu.add(specialDiff);
		
		menuBar.add(questsDifficultyMenu);
		
	}

}
