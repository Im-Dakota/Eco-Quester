package eco.quester.listeners;

import java.util.Map;

import eco.quester.menus.Difficulty;
import eco.quester.menus.ExpRewards;
import eco.quester.menus.Length;

public class Filters {
	
	public static void applyDifficultyFilter() {
		
		String activeFiltersDifficulty = "[";
		for(Map.Entry<String, Boolean> entry : Difficulty.difficultyMap.entrySet())
			if(entry.getValue() == true)
				activeFiltersDifficulty += entry.getKey() + ", ";
		if(!activeFiltersDifficulty.equals("["))
			activeFiltersDifficulty = activeFiltersDifficulty.substring(0, activeFiltersDifficulty.length() - 2);
		activeFiltersDifficulty += "]";
		System.out.println(activeFiltersDifficulty);
		
		
//		for(String key : Difficulty.difficultyMap.keySet())		//Prints out keys
//			System.out.println(key);

//		for(boolean value : Difficulty.difficultyMap.values())	//Prints out values
//			System.err.println(value);

//		for(Map.Entry<String, Boolean> entry : Difficulty.difficultyMap.entrySet())		//Prints out keys and values
//			System.out.println(entry.getKey() + " = " + entry.getValue());
	}
	
	public static void applyLengthFilter() {
		String activeFiltersLength = "[";
		for(Map.Entry<String, Boolean> entry : Length.lengthMap.entrySet())
			if(entry.getValue() == true)
				activeFiltersLength += entry.getKey() + ", ";
		if(!activeFiltersLength.equals("["))
			activeFiltersLength = activeFiltersLength.substring(0, activeFiltersLength.length() - 2);
		activeFiltersLength += "]";
		System.out.println(activeFiltersLength);
	}

//	public static void applyQuestRewardExpFilter() {
//		String activeFiltersLength = "[";
//		for(Map.Entry<String, Boolean> entry : ExpRewards.questExpMap.entrySet())
//			if(entry.getValue() == true)
//				activeFiltersLength += entry.getKey() + ", ";
//		if(!activeFiltersLength.equals("["))
//			activeFiltersLength = activeFiltersLength.substring(0, activeFiltersLength.length() - 2);
//		activeFiltersLength += "]";
//		System.out.println(activeFiltersLength);
//	}
	
	
	public static void applyCombatExpRewardFilter() {
		String activeFiltersLength = "[";
		for(Map.Entry<String, Boolean> entry : ExpRewards.combatXpMap.entrySet())
			if(entry.getValue() == true)
				activeFiltersLength += entry.getKey() + ", ";
		if(!activeFiltersLength.equals("["))
			activeFiltersLength = activeFiltersLength.substring(0, activeFiltersLength.length() - 2);
		activeFiltersLength += "]";
		System.out.println(activeFiltersLength);
	}
	
	public static void applyNonCombatExpFilter() {
		String activeFiltersLength = "[";
		for(Map.Entry<String, Boolean> entry : ExpRewards.nonCombatXpMap.entrySet())
			if(entry.getValue() == true)
				activeFiltersLength += entry.getKey() + ", ";
		if(!activeFiltersLength.equals("["))
			activeFiltersLength = activeFiltersLength.substring(0, activeFiltersLength.length() - 2);
		activeFiltersLength += "]";
		System.out.println(activeFiltersLength);
	}

}
