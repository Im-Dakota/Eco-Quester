package eco.quester.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.menus.ExpRewards;

public class ExpRewardActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Attack":
			applyActionCombat(ExpRewards.attackXp);
			break;
			
		case "Constitution":
			applyActionCombat(ExpRewards.constitutionXp);
			break;
			
		case "Defence":
			applyActionCombat(ExpRewards.defenceXp);
			break;
			
		case "Magic":
			applyActionCombat(ExpRewards.magicXp);
			break;
			
		case "Prayer":
			applyActionCombat(ExpRewards.prayerXp);
			break;
			
		case "Range":
			applyActionCombat(ExpRewards.rangeXp);
			break;
			
		case "Strength":
			applyActionCombat(ExpRewards.strengthXp);
			break;
			
		case "Summoning":
			applyActionCombat(ExpRewards.summoningXp);
			break;
			
		case "Agility":
			applyActionNonCombat(ExpRewards.agilityXp);
			break;
			
		case "Construction":
			applyActionNonCombat(ExpRewards.constructionXp);
			break;
			
		case "Cooking":
			applyActionNonCombat(ExpRewards.cookingXp);
			break;
			
		case "Crafting":
			applyActionNonCombat(ExpRewards.craftingXp);
			break;
			
		case "Divination":
			applyActionNonCombat(ExpRewards.divinationXp);
			break;
			
		case "Dungeoneering":
			applyActionNonCombat(ExpRewards.dungeoneeringXp);
			break;
			
		case "Farming":
			applyActionNonCombat(ExpRewards.farmingXp);
			break;
			
		case "Firemaking":
			applyActionNonCombat(ExpRewards.firemakingXp);
			break;
			
		case "Fishing":
			applyActionNonCombat(ExpRewards.fishingXp);
			break;
		
		case "Fletching":
			applyActionNonCombat(ExpRewards.fletchingXp);
			break;
			
		case "Herblore":
			applyActionNonCombat(ExpRewards.herbloreXp);
			break;
			
		case "Hunter":
			applyActionNonCombat(ExpRewards.hunterXp);
			break;
			
		case "Invention":
			applyActionNonCombat(ExpRewards.inventionXp);
			break;
			
		case "Mining":
			applyActionNonCombat(ExpRewards.miningXp);
			break;
			
		case "Runecrafting":
			applyActionNonCombat(ExpRewards.runecraftingXp);
			break;
			
		case "Smithing":
			applyActionNonCombat(ExpRewards.smithingXp);
			break;
			
		case "Thieving":
			applyActionNonCombat(ExpRewards.thievingXp);
			break;
			
		case "Woodcutting":
			applyActionNonCombat(ExpRewards.woodcuttingXp);
			break;
		}
	}
	
	
	
	public void applyActionCombat(CCheckBoxMenuItem item) {
		if(item.isSelected())
			ExpRewards.combatXpMap.put(item.getText().toLowerCase().replaceAll(" ", ""), true);
		else
			ExpRewards.combatXpMap.put(item.getText().toLowerCase().replaceAll(" ", ""), false);
	}
	
	public void applyActionNonCombat(CCheckBoxMenuItem item) {
		if(item.isSelected())
			ExpRewards.nonCombatXpMap.put(item.getText().toLowerCase().replaceAll(" ", ""), true);
		else
			ExpRewards.nonCombatXpMap.put(item.getText().toLowerCase().replaceAll(" ", ""), false);
	}
	
}
