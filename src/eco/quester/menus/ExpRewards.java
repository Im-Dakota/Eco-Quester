package eco.quester.menus;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;

public class ExpRewards {
	
	public static void initQuestRewards(CMenuBar menuBar) {
		
		CMenu expRewardsMenu = new CMenu("Experience Rewards");
		
		CMenu combatRewards = new CMenu("Combat");
		CCheckBoxMenuItem attackSk = new CCheckBoxMenuItem("Attack");
		combatRewards.add(attackSk);
		
		CCheckBoxMenuItem constitutionSk = new CCheckBoxMenuItem("Constitution");
		combatRewards.add(constitutionSk);
		
		CCheckBoxMenuItem defenceSk = new CCheckBoxMenuItem("Defence");
		combatRewards.add(defenceSk);
		
		CCheckBoxMenuItem magicSk = new CCheckBoxMenuItem("Magic");
		combatRewards.add(magicSk);
		
		CCheckBoxMenuItem prayerSk = new CCheckBoxMenuItem("Prayer");
		combatRewards.add(prayerSk);
		
		CCheckBoxMenuItem rangeSk = new CCheckBoxMenuItem("Range");
		combatRewards.add(rangeSk);
		
		CCheckBoxMenuItem strengthSk = new CCheckBoxMenuItem("Strength");
		combatRewards.add(strengthSk);
		
		CCheckBoxMenuItem summoningSk = new CCheckBoxMenuItem("Summoning");
		combatRewards.add(summoningSk);
		
		
		CMenu nonCombatRewards = new CMenu("Non-Combat");
		CCheckBoxMenuItem agilitySk = new CCheckBoxMenuItem("Agility");
		nonCombatRewards.add(agilitySk);
		
		CCheckBoxMenuItem constructionSk = new CCheckBoxMenuItem("Construction");
		nonCombatRewards.add(constructionSk);
		
		CCheckBoxMenuItem cookingSk = new CCheckBoxMenuItem("Cooking");
		nonCombatRewards.add(cookingSk);
		
		CCheckBoxMenuItem craftingSk = new CCheckBoxMenuItem("Crafting");
		nonCombatRewards.add(craftingSk);
		
		CCheckBoxMenuItem divinationSk = new CCheckBoxMenuItem("Divination");
		nonCombatRewards.add(divinationSk);
		
		CCheckBoxMenuItem dungeoneeringSk = new CCheckBoxMenuItem("Dungeoneering");
		nonCombatRewards.add(dungeoneeringSk);
		
		CCheckBoxMenuItem farmingSk = new CCheckBoxMenuItem("Farming");
		nonCombatRewards.add(farmingSk);
		
		CCheckBoxMenuItem firemakingSk = new CCheckBoxMenuItem("Firemaking");
		nonCombatRewards.add(firemakingSk);
		
		CCheckBoxMenuItem fishingSk = new CCheckBoxMenuItem("Fishing");
		nonCombatRewards.add(fishingSk);
		
		CCheckBoxMenuItem fletchingSk = new CCheckBoxMenuItem("Fletching");
		nonCombatRewards.add(fletchingSk);
		
		CCheckBoxMenuItem herbloreSk = new CCheckBoxMenuItem("Herblore");
		nonCombatRewards.add(herbloreSk);
		
		CCheckBoxMenuItem hunterSk = new CCheckBoxMenuItem("Hunter");
		nonCombatRewards.add(hunterSk);
		
		CCheckBoxMenuItem inventionSk = new CCheckBoxMenuItem("Invention");
		nonCombatRewards.add(inventionSk);
		
		CCheckBoxMenuItem miningSk = new CCheckBoxMenuItem("Mining");
		nonCombatRewards.add(miningSk);
		
		CCheckBoxMenuItem runecraftingSk = new CCheckBoxMenuItem("Runecrafting");
		nonCombatRewards.add(runecraftingSk);
		
		CCheckBoxMenuItem smithingSk = new CCheckBoxMenuItem("Smithing");
		nonCombatRewards.add(smithingSk);
		
		CCheckBoxMenuItem thievingSk = new CCheckBoxMenuItem("Thieving");
		nonCombatRewards.add(thievingSk);
		
		CCheckBoxMenuItem woodcuttingSk = new CCheckBoxMenuItem("Woodcutting");
		nonCombatRewards.add(woodcuttingSk);
		
		
		menuBar.add(expRewardsMenu);
		expRewardsMenu.add(combatRewards);
		expRewardsMenu.add(nonCombatRewards);
	}

}
