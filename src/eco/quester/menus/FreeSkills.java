package eco.quester.menus;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;

public class FreeSkills {
	
public static void initFreeSkills(CMenuBar menuBar) {
		
		CMenu freeSkillsMenu = new CMenu("Free Skills");
		
		CCheckBoxMenuItem attackSk = new CCheckBoxMenuItem("Attack");
		freeSkillsMenu.add(attackSk);
		
		CCheckBoxMenuItem constitutionSk = new CCheckBoxMenuItem("Constitution");
		freeSkillsMenu.add(constitutionSk);
		
		CCheckBoxMenuItem cookingSk = new CCheckBoxMenuItem("Cooking");
		freeSkillsMenu.add(cookingSk);
		
		CCheckBoxMenuItem craftingSk = new CCheckBoxMenuItem("Crafting");
		freeSkillsMenu.add(craftingSk);
		
		CCheckBoxMenuItem defenceSk = new CCheckBoxMenuItem("Defence");
		freeSkillsMenu.add(defenceSk);
		
		CCheckBoxMenuItem dungeoneeringSk = new CCheckBoxMenuItem("Dungeoneering");
		freeSkillsMenu.add(dungeoneeringSk);
		
		CCheckBoxMenuItem firemakingSk = new CCheckBoxMenuItem("Firemaking");
		freeSkillsMenu.add(firemakingSk);
		
		CCheckBoxMenuItem fishingSk = new CCheckBoxMenuItem("Fishing");
		freeSkillsMenu.add(fishingSk);
		
		CCheckBoxMenuItem fletchingSk = new CCheckBoxMenuItem("Fletching");
		freeSkillsMenu.add(fletchingSk);
		
		CCheckBoxMenuItem magicSk = new CCheckBoxMenuItem("Magic");
		freeSkillsMenu.add(magicSk);
		
		CCheckBoxMenuItem miningSk = new CCheckBoxMenuItem("Mining");
		freeSkillsMenu.add(miningSk);
		
		CCheckBoxMenuItem prayerSk = new CCheckBoxMenuItem("Prayer");
		freeSkillsMenu.add(prayerSk);
		
		CCheckBoxMenuItem rangeSk = new CCheckBoxMenuItem("Range");
		freeSkillsMenu.add(rangeSk);
		
		CCheckBoxMenuItem runecraftingSk = new CCheckBoxMenuItem("Runecrafting");
		freeSkillsMenu.add(runecraftingSk);
		
		CCheckBoxMenuItem smithingSk = new CCheckBoxMenuItem("Smithing");
		freeSkillsMenu.add(smithingSk);
		
		CCheckBoxMenuItem strengthSk = new CCheckBoxMenuItem("Strength");
		freeSkillsMenu.add(strengthSk);
		
		CCheckBoxMenuItem woodcuttingSk = new CCheckBoxMenuItem("Woodcutting");
		freeSkillsMenu.add(woodcuttingSk);
		
		menuBar.add(freeSkillsMenu);
	}

}
