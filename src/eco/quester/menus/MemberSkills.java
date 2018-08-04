package eco.quester.menus;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;

public class MemberSkills {
	
public static void initMemberSkills(CMenuBar menuBar) {
		
		CMenu memberSkillsMenu = new CMenu("Member Skills");
		
		CCheckBoxMenuItem agilitySk = new CCheckBoxMenuItem("Agility");
		memberSkillsMenu.add(agilitySk);
		
		CCheckBoxMenuItem constructionSk = new CCheckBoxMenuItem("Construction");
		memberSkillsMenu.add(constructionSk);
		
		CCheckBoxMenuItem divinationSk = new CCheckBoxMenuItem("Divination");
		memberSkillsMenu.add(divinationSk);
		
		CCheckBoxMenuItem farmingSk = new CCheckBoxMenuItem("Farming");
		memberSkillsMenu.add(farmingSk);
		
		CCheckBoxMenuItem herbloreSk = new CCheckBoxMenuItem("Herblore");
		memberSkillsMenu.add(herbloreSk);
		
		CCheckBoxMenuItem hunterSk = new CCheckBoxMenuItem("Hunter");
		memberSkillsMenu.add(hunterSk);
		
		CCheckBoxMenuItem inventionSk = new CCheckBoxMenuItem("Invention");
		memberSkillsMenu.add(inventionSk);
		
		CCheckBoxMenuItem slayerSk = new CCheckBoxMenuItem("Slayer");
		memberSkillsMenu.add(slayerSk);
		
		CCheckBoxMenuItem summoningSk = new CCheckBoxMenuItem("Summoning");
		memberSkillsMenu.add(summoningSk);
		
		CCheckBoxMenuItem thievingSk = new CCheckBoxMenuItem("Thieving");
		memberSkillsMenu.add(thievingSk);
		
		menuBar.add(memberSkillsMenu);
		
	}

}
