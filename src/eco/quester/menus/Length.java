package eco.quester.menus;

import java.util.HashMap;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;
import eco.quester.listeners.QuestLengthActionListener;

public class Length {
	
	public static CCheckBoxMenuItem lengthShort;
	private static boolean shortLength = false;
	public static CCheckBoxMenuItem lengthMedium;
	private static boolean mediumLength = false;
	public static CCheckBoxMenuItem lengthLong;
	private static boolean longLength = false;
	
	public static HashMap<String, Boolean> lengthMap;
	
	private static void fillLengthMap() {
		// TODO Auto-generated method stub
		lengthMap = new HashMap<String, Boolean>();
		lengthMap.put("Short".toLowerCase(), shortLength);
		lengthMap.put("Medium".toLowerCase(), mediumLength);
		lengthMap.put("Long".toLowerCase(), longLength);
		
	}
	
	
	public static void initQuestLength(CMenuBar menuBar) {
		fillLengthMap();
		
		CMenu questLengthMenu = new CMenu("Quest Length");
	
		lengthShort = new CCheckBoxMenuItem("Short");
		lengthShort.addActionListener(new QuestLengthActionListener());
		questLengthMenu.add(lengthShort);
		
		lengthMedium = new CCheckBoxMenuItem("Medium");
		lengthMedium.addActionListener(new QuestLengthActionListener());
		questLengthMenu.add(lengthMedium);
		
		lengthLong = new CCheckBoxMenuItem("Long");
		lengthLong.addActionListener(new QuestLengthActionListener());
		questLengthMenu.add(lengthLong);
		
//		CCheckBoxMenuItem shortLength = new CCheckBoxMenuItem("Short");
//		questLengthMenu.add(shortLength);
//		
//		CCheckBoxMenuItem mediumLength = new CCheckBoxMenuItem("Medium");
//		questLengthMenu.add(mediumLength);
//		
//		CCheckBoxMenuItem longLength = new CCheckBoxMenuItem("Long");
//		questLengthMenu.add(longLength);
		
		menuBar.add(questLengthMenu);
		
	}

}
