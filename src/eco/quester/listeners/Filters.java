package eco.quester.listeners;

import java.util.Map;

import eco.quester.menus.Difficulty;

public class Filters {
	
	public static void applyDifficultyFilter() {
		
		String activeFilters = "[";
		for(Map.Entry<String, Boolean> entry : Difficulty.difficultyMap.entrySet())
			if(entry.getValue() == true)
				activeFilters += entry.getKey() + ", ";
		if(!activeFilters.equals("["))
			activeFilters = activeFilters.substring(0, activeFilters.length() - 2);
		activeFilters += "]";
		System.out.println(activeFilters);
		
//		for(String key : Difficulty.difficultyMap.keySet())		//Prints out keys
//			System.out.println(key);

//		for(boolean value : Difficulty.difficultyMap.values())	//Prints out values
//			System.err.println(value);

//		for(Map.Entry<String, Boolean> entry : Difficulty.difficultyMap.entrySet())		//Prints out keys and values
//			System.out.println(entry.getKey() + " = " + entry.getValue());
	}

}
