package eco.quester.menus;

import java.util.HashMap;

import eco.quester.custom_objects.CCheckBoxMenuItem;
import eco.quester.custom_objects.CMenu;
import eco.quester.custom_objects.CMenuBar;
import eco.quester.listeners.ExpRewardActionListener;

public class ExpRewards {
//	Combat Stats
	public static CCheckBoxMenuItem attackXp;
	public static boolean attack = false;
	public static CCheckBoxMenuItem constitutionXp;
	public static boolean constitution = false;
	public static CCheckBoxMenuItem defenceXp;
	public static boolean defence = false;
	public static CCheckBoxMenuItem magicXp;
	public static boolean magic = false;
	public static CCheckBoxMenuItem prayerXp;
	public static boolean prayer = false;
	public static CCheckBoxMenuItem rangeXp;
	public static boolean range = false;
	public static CCheckBoxMenuItem strengthXp;
	public static boolean strength = false;
	public static CCheckBoxMenuItem summoningXp;
	public static boolean summoning = false;
	
//	Non-Combat stats
	public static CCheckBoxMenuItem agilityXp;
	public static boolean agility = false;
	public static CCheckBoxMenuItem constructionXp;
	public static boolean construction = false;
	public static CCheckBoxMenuItem cookingXp;
	public static boolean cooking = false;
	public static CCheckBoxMenuItem craftingXp;
	public static boolean crafting = false;
	public static CCheckBoxMenuItem divinationXp;
	public static boolean divination = false;
	public static CCheckBoxMenuItem dungeoneeringXp;
	public static boolean dungeoneering = false;
	public static CCheckBoxMenuItem farmingXp;
	public static boolean farming = false;
	public static CCheckBoxMenuItem firemakingXp;
	public static boolean firemaking = false;
	public static CCheckBoxMenuItem fishingXp;
	public static boolean fishing = false;
	public static CCheckBoxMenuItem fletchingXp;
	public static boolean fletching = false;
	public static CCheckBoxMenuItem herbloreXp;
	public static boolean herblore = false;
	public static CCheckBoxMenuItem  hunterXp;
	public static boolean hunter = false;
	public static CCheckBoxMenuItem inventionXp;
	public static boolean invention = false;
	public static CCheckBoxMenuItem miningXp;
	public static boolean mining = false;
	public static CCheckBoxMenuItem runecraftingXp;
	public static boolean runecrafting = false;
	public static CCheckBoxMenuItem smithingXp;
	public static boolean smithing = false;
	public static CCheckBoxMenuItem thievingXp;
	public static boolean thieving = false;
	public static CCheckBoxMenuItem woodcuttingXp;
	public static boolean woodcutting = false;
	
	public static HashMap<String, Boolean> combatXpMap;
	public static HashMap<String, Boolean> nonCombatXpMap;

//	public static HashMap<String, Boolean> questExpMap;
	
	public static void fillQuestExpRewardMap() {
		combatXpMap = new HashMap<String, Boolean>();
		combatXpMap.put("Attack".toLowerCase(), attack);
		combatXpMap.put("Constitution".toLowerCase(), constitution);
		combatXpMap.put("Defence".toLowerCase(), defence);
		combatXpMap.put("Magic".toLowerCase(), magic);
		combatXpMap.put("Prayer".toLowerCase(), prayer);
		combatXpMap.put("Range".toLowerCase(), range);
		combatXpMap.put("Strength".toLowerCase(), strength);
		combatXpMap.put("Summoning".toLowerCase(), summoning);
		
		nonCombatXpMap.put("Agility".toLowerCase(), agility);
		nonCombatXpMap.put("Construction".toLowerCase(), constitution);
		nonCombatXpMap.put("Cooking".toLowerCase(), cooking);
		nonCombatXpMap.put("Crafting".toLowerCase(), crafting);
		nonCombatXpMap.put("Divination".toLowerCase(), divination);
		nonCombatXpMap.put("Dungeoneering".toLowerCase(), dungeoneering);
		nonCombatXpMap.put("Farming".toLowerCase(), farming);
		nonCombatXpMap.put("Firemaking".toLowerCase(), firemaking);
		nonCombatXpMap.put("Fishing".toLowerCase(), fishing);
		nonCombatXpMap.put("Fletching".toLowerCase(), fletching);
		nonCombatXpMap.put("Herblore".toLowerCase(), herblore);
		nonCombatXpMap.put("Hunter".toLowerCase(), hunter);
		nonCombatXpMap.put("Intention".toLowerCase(), invention);
		nonCombatXpMap.put("Mining".toLowerCase(), mining);
		nonCombatXpMap.put("Runecrafting".toLowerCase(), runecrafting);
		nonCombatXpMap.put("Smithing".toLowerCase(), smithing);
		nonCombatXpMap.put("Thieving".toLowerCase(), thieving);
		nonCombatXpMap.put("Woodcutting".toLowerCase(), woodcutting);
		
	}
	
//	public static void initQuestExpRewards (CMenuBar menuBar) {
//		fillQuestExpRewardMap();
//		
//		CMenu expRewardsMenu = new CMenu("Experience Rewards");
//		
//		CMenu combatRewards = new CMenu("Combat");
//		
//		CMenu nonCombatRewards = new CMenu("Non-Combat");
//		
//		attackXp = new CCheckBoxMenuItem("Attack");
//		attackXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(attackXp);
//		
//		constitutionXp = new CCheckBoxMenuItem("Constitution");
//		constitutionXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(constitutionXp);
//		
//		defenceXp = new CCheckBoxMenuItem("Defence");
//		defenceXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(defenceXp);
//		
//		magicXp = new CCheckBoxMenuItem("Magic");
//		magicXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(magicXp);
//		
//		prayerXp = new CCheckBoxMenuItem("Prayer");
//		prayerXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(prayerXp);
//		
//		rangeXp = new CCheckBoxMenuItem("Range");
//		rangeXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(rangeXp);
//		
//		strengthXp = new CCheckBoxMenuItem("Strength");
//		strengthXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(strengthXp);
//		
//		summoningXp = new CCheckBoxMenuItem("Summoning");
//		summoningXp.addActionListener(new ExpRewardActionListener());
//		combatRewards.add(summoningXp);
//		
//		
//		agilityXp = new CCheckBoxMenuItem("Agility");
//		agilityXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(agilityXp);
//
//		constructionXp = new CCheckBoxMenuItem("Construction");
//		constructionXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(constructionXp);
//
//		cookingXp = new CCheckBoxMenuItem("Cooking");
//		cookingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(cookingXp);
//
//		craftingXp = new CCheckBoxMenuItem("Crafting");
//		craftingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(craftingXp);
//
//		divinationXp = new CCheckBoxMenuItem("Divination");
//		divinationXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(divinationXp);
//
//		dungeoneeringXp = new CCheckBoxMenuItem("Dungeoneering");
//		dungeoneeringXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(dungeoneeringXp);
//
//		farmingXp = new CCheckBoxMenuItem("Farming");
//		farmingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(farmingXp);
//
//		firemakingXp = new CCheckBoxMenuItem("Firemaking");
//		firemakingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(firemakingXp);
//
//		fishingXp = new CCheckBoxMenuItem("Fishing");
//		fishingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(fishingXp);
//
//		fletchingXp = new CCheckBoxMenuItem("Fletching");
//		fletchingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(fletchingXp);
//
//		herbloreXp = new CCheckBoxMenuItem("Herblore");
//		herbloreXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(herbloreXp);
//
//		hunterXp = new CCheckBoxMenuItem("Hunter");
//		hunterXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(hunterXp);
//
//		inventionXp = new CCheckBoxMenuItem("Invention");
//		inventionXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(inventionXp);
//
//		miningXp = new CCheckBoxMenuItem("Mining");
//		miningXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(miningXp);
//
//		runecraftingXp = new CCheckBoxMenuItem("Runecrafting");
//		runecraftingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(runecraftingXp);
//
//		smithingXp= new CCheckBoxMenuItem("Smithing");
//		smithingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(smithingXp);
//
//		thievingXp = new CCheckBoxMenuItem("Thieving");
//		thievingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(thievingXp);
//
//		woodcuttingXp = new CCheckBoxMenuItem("Woodcutting");
//		woodcuttingXp.addActionListener(new ExpRewardActionListener());
//		nonCombatRewards.add(woodcuttingXp);
//		
//		menuBar.add(expRewardsMenu);
//		expRewardsMenu.add(combatRewards);
//		expRewardsMenu.add(nonCombatRewards);
//		
//		
//	}
	
	
	
	
	public static void fillCombatXpMap() {
		combatXpMap = new HashMap<String, Boolean>();
		combatXpMap.put("Attack".toLowerCase(), attack);
		combatXpMap.put("Constitution".toLowerCase(), constitution);
		combatXpMap.put("Defence".toLowerCase(), defence);
		combatXpMap.put("Magic".toLowerCase(), magic);
		combatXpMap.put("Prayer".toLowerCase(), prayer);
		combatXpMap.put("Range".toLowerCase(), range);
		combatXpMap.put("Strength".toLowerCase(), strength);
		combatXpMap.put("Summoning".toLowerCase(), summoning);
	}
	
	public static void fillNonCombatXpMap() {
		nonCombatXpMap = new HashMap<String, Boolean>();
		nonCombatXpMap.put("Agility".toLowerCase(), agility);
		nonCombatXpMap.put("Construction".toLowerCase(), constitution);
		nonCombatXpMap.put("Cooking".toLowerCase(), cooking);
		nonCombatXpMap.put("Crafting".toLowerCase(), crafting);
		nonCombatXpMap.put("Divination".toLowerCase(), divination);
		nonCombatXpMap.put("Dungeoneering".toLowerCase(), dungeoneering);
		nonCombatXpMap.put("Farming".toLowerCase(), farming);
		nonCombatXpMap.put("Firemaking".toLowerCase(), firemaking);
		nonCombatXpMap.put("Fishing".toLowerCase(), fishing);
		nonCombatXpMap.put("Fletching".toLowerCase(), fletching);
		nonCombatXpMap.put("Herblore".toLowerCase(), herblore);
		nonCombatXpMap.put("Hunter".toLowerCase(), hunter);
		nonCombatXpMap.put("Intention".toLowerCase(), invention);
		nonCombatXpMap.put("Mining".toLowerCase(), mining);
		nonCombatXpMap.put("Runecrafting".toLowerCase(), runecrafting);
		nonCombatXpMap.put("Smithing".toLowerCase(), smithing);
		nonCombatXpMap.put("Thieving".toLowerCase(), thieving);
		nonCombatXpMap.put("Woodcutting".toLowerCase(), woodcutting);
	}
	
	
	public static void initCombatXp(CMenuBar menuBarCombat) {
		fillCombatXpMap();
		
		CMenu combatExpMenu = new CMenu("Combat Exp");
		
		attackXp = new CCheckBoxMenuItem("Attack");
		attackXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(attackXp);
		
		constitutionXp = new CCheckBoxMenuItem("Constitution");
		constitutionXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(constitutionXp);
		
		defenceXp = new CCheckBoxMenuItem("Defence");
		defenceXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(defenceXp);
		
		magicXp = new CCheckBoxMenuItem("Magic");
		magicXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(magicXp);
		
		prayerXp = new CCheckBoxMenuItem("Prayer");
		prayerXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(prayerXp);
		
		rangeXp = new CCheckBoxMenuItem("Range");
		rangeXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(rangeXp);
		
		strengthXp = new CCheckBoxMenuItem("Strength");
		strengthXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(strengthXp);
		
		summoningXp = new CCheckBoxMenuItem("Summoning");
		summoningXp.addActionListener(new ExpRewardActionListener());
		combatExpMenu.add(summoningXp);
		
		menuBarCombat.add(combatExpMenu);
	}
	
	public static void initNonCombatXp(CMenuBar menuBarNonCombat) {
		fillNonCombatXpMap();
		
		CMenu nonCombatXpMenu = new CMenu("Non-Combat Exp");
		
		agilityXp = new CCheckBoxMenuItem("Agility");
		agilityXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(agilityXp);

		constructionXp = new CCheckBoxMenuItem("Construction");
		constructionXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(constructionXp);

		cookingXp = new CCheckBoxMenuItem("Cooking");
		cookingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(cookingXp);

		craftingXp = new CCheckBoxMenuItem("Crafting");
		craftingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(craftingXp);

		divinationXp = new CCheckBoxMenuItem("Divination");
		divinationXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(divinationXp);

		dungeoneeringXp = new CCheckBoxMenuItem("Dungeoneering");
		dungeoneeringXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(dungeoneeringXp);

		farmingXp = new CCheckBoxMenuItem("Farming");
		farmingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(farmingXp);

		firemakingXp = new CCheckBoxMenuItem("Firemaking");
		firemakingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(firemakingXp);

		fishingXp = new CCheckBoxMenuItem("Fishing");
		fishingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(fishingXp);

		fletchingXp = new CCheckBoxMenuItem("Fletching");
		fletchingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(fletchingXp);

		herbloreXp = new CCheckBoxMenuItem("Herblore");
		herbloreXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(herbloreXp);

		hunterXp = new CCheckBoxMenuItem("Hunter");
		hunterXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(hunterXp);

		inventionXp = new CCheckBoxMenuItem("Invention");
		inventionXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(inventionXp);

		miningXp = new CCheckBoxMenuItem("Mining");
		miningXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(miningXp);

		runecraftingXp = new CCheckBoxMenuItem("Runecrafting");
		runecraftingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(runecraftingXp);

		smithingXp= new CCheckBoxMenuItem("Smithing");
		smithingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(smithingXp);

		thievingXp = new CCheckBoxMenuItem("Thieving");
		thievingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(thievingXp);

		woodcuttingXp = new CCheckBoxMenuItem("Woodcutting");
		woodcuttingXp.addActionListener(new ExpRewardActionListener());
		nonCombatXpMenu.add(woodcuttingXp);
		
		
		menuBarNonCombat.add(nonCombatXpMenu);
		
	}
	
	
	
	
//	public static void initQuestRewards(CMenuBar menuBar) {
//		
//		CMenu expRewardsMenu = new CMenu("Experience Rewards");
//		
//		CMenu combatRewards = new CMenu("Combat");
//		
//		CMenu nonCombatRewards = new CMenu("Non-Combat");
		
		
//		CMenu combatRewards = new CMenu("Combat");
//		CCheckBoxMenuItem attackSk = new CCheckBoxMenuItem("Attack");
//		combatRewards.add(attackSk);
//		
//		CCheckBoxMenuItem constitutionSk = new CCheckBoxMenuItem("Constitution");
//		combatRewards.add(constitutionSk);
//		
//		CCheckBoxMenuItem defenceSk = new CCheckBoxMenuItem("Defence");
//		combatRewards.add(defenceSk);
//		
//		CCheckBoxMenuItem magicSk = new CCheckBoxMenuItem("Magic");
//		combatRewards.add(magicSk);
//		
//		CCheckBoxMenuItem prayerSk = new CCheckBoxMenuItem("Prayer");
//		combatRewards.add(prayerSk);
//		
//		CCheckBoxMenuItem rangeSk = new CCheckBoxMenuItem("Range");
//		combatRewards.add(rangeSk);
//		
//		CCheckBoxMenuItem strengthSk = new CCheckBoxMenuItem("Strength");
//		combatRewards.add(strengthSk);
//		
//		CCheckBoxMenuItem summoningSk = new CCheckBoxMenuItem("Summoning");
//		combatRewards.add(summoningSk);
//		
//		
//		CMenu nonCombatRewards = new CMenu("Non-Combat");
//		CCheckBoxMenuItem agilitySk = new CCheckBoxMenuItem("Agility");
//		nonCombatRewards.add(agilitySk);
//		
//		CCheckBoxMenuItem constructionSk = new CCheckBoxMenuItem("Construction");
//		nonCombatRewards.add(constructionSk);
//		
//		CCheckBoxMenuItem cookingSk = new CCheckBoxMenuItem("Cooking");
//		nonCombatRewards.add(cookingSk);
//		
//		CCheckBoxMenuItem craftingSk = new CCheckBoxMenuItem("Crafting");
//		nonCombatRewards.add(craftingSk);
//		
//		CCheckBoxMenuItem divinationSk = new CCheckBoxMenuItem("Divination");
//		nonCombatRewards.add(divinationSk);
//		
//		CCheckBoxMenuItem dungeoneeringSk = new CCheckBoxMenuItem("Dungeoneering");
//		nonCombatRewards.add(dungeoneeringSk);
//		
//		CCheckBoxMenuItem farmingSk = new CCheckBoxMenuItem("Farming");
//		nonCombatRewards.add(farmingSk);
//		
//		CCheckBoxMenuItem firemakingSk = new CCheckBoxMenuItem("Firemaking");
//		nonCombatRewards.add(firemakingSk);
//		
//		CCheckBoxMenuItem fishingSk = new CCheckBoxMenuItem("Fishing");
//		nonCombatRewards.add(fishingSk);
//		
//		CCheckBoxMenuItem fletchingSk = new CCheckBoxMenuItem("Fletching");
//		nonCombatRewards.add(fletchingSk);
//		
//		CCheckBoxMenuItem herbloreSk = new CCheckBoxMenuItem("Herblore");
//		nonCombatRewards.add(herbloreSk);
//		
//		CCheckBoxMenuItem hunterSk = new CCheckBoxMenuItem("Hunter");
//		nonCombatRewards.add(hunterSk);
//		
//		CCheckBoxMenuItem inventionSk = new CCheckBoxMenuItem("Invention");
//		nonCombatRewards.add(inventionSk);
//		
//		CCheckBoxMenuItem miningSk = new CCheckBoxMenuItem("Mining");
//		nonCombatRewards.add(miningSk);
//		
//		CCheckBoxMenuItem runecraftingSk = new CCheckBoxMenuItem("Runecrafting");
//		nonCombatRewards.add(runecraftingSk);
//		
//		CCheckBoxMenuItem smithingSk = new CCheckBoxMenuItem("Smithing");
//		nonCombatRewards.add(smithingSk);
//		
//		CCheckBoxMenuItem thievingSk = new CCheckBoxMenuItem("Thieving");
//		nonCombatRewards.add(thievingSk);
//		
//		CCheckBoxMenuItem woodcuttingSk = new CCheckBoxMenuItem("Woodcutting");
//		nonCombatRewards.add(woodcuttingSk);
//		
//		
//		menuBar.add(expRewardsMenu);
//		expRewardsMenu.add(combatRewards);
//		expRewardsMenu.add(nonCombatRewards);
//	}

}
