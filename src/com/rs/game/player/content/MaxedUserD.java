package com.rs.game.player.content;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.npc.NPC;

/**
 * 
 * @author Tyler | Fuzen Seth + Nexon
 *
 */
public class MaxedUserD {
private static final String RUNITE_ORE_MINED = null;
public static int MAXCAPE = 20767;
public static int ONE = 1;
public static int MAXHOOD = 20768;
public static int COMPLETIONISTCAPE = 20769; 
public static int COMPLETIONISTHOOD = 20770;

	public static void CheckCompletionist(Player player) {
		if (player.getSkills().getLevelForXp(Skills.ATTACK) >= 99
		&& player.getSkills().getLevelForXp(Skills.STRENGTH) >= 99
		&& player.getSkills().getLevelForXp(Skills.DEFENCE) >= 99
		&& player.getSkills().getLevelForXp(Skills.HITPOINTS) >= 99
		&& player.getSkills().getLevelForXp(Skills.RANGE) >= 99
		&& player.getSkills().getLevelForXp(Skills.MAGIC) >= 99
		&& player.getSkills().getLevelForXp(Skills.RUNECRAFTING) >= 99
		&& player.getSkills().getLevelForXp(Skills.FISHING) >= 99
		&& player.getSkills().getLevelForXp(Skills.AGILITY) >= 99
		&& player.getSkills().getLevelForXp(Skills.COOKING) >= 99
		&& player.getSkills().getLevelForXp(Skills.PRAYER) >= 99
		&& player.getSkills().getLevelForXp(Skills.THIEVING) >= 99
		&& player.getSkills().getLevelForXp(Skills.MINING) >= 99
		&& player.getSkills().getLevelForXp(Skills.SMITHING) >= 99
		&& player.getSkills().getLevelForXp(Skills.SUMMONING) >= 99
		&& player.getSkills().getLevelForXp(Skills.SLAYER) >= 99
		&& player.getSkills().getLevelForXp(Skills.CRAFTING) >= 99
		&& player.getSkills().getLevelForXp(Skills.WOODCUTTING) >= 99
		&& player.getSkills().getLevelForXp(Skills.FIREMAKING) >= 99
		&& player.getSkills().getLevelForXp(Skills.FLETCHING) >= 99
		&& player.getSkills().getLevelForXp(Skills.HERBLORE) >= 99
		&& player.getSkills().getLevelForXp(Skills.FARMING) >= 99
		&& player.getSkills().getLevelForXp(Skills.HUNTER) >= 99
		&& player.getSkills().getLevelForXp(Skills.DUNGEONEERING) >= 120) {
	}
	}
}

				//player.getPackets().sendIComponentText(275, 14, "You have done "+ RUNITE_ORE_MINED +" out of 10 Armadyl boss kills.");
		//&& player.minedore >= 1500
		//&& player.siphon >= 1000
		//&& player.cookedmeat >= 1000
		//&& player.bandos >= 10
		//&& player.boughtdung >= 3
		//&& player.saradomin >= 10
		//&& player.armadyl >= 10
		//&& player.zamorak >= 10) {
		//	player.isMaxed = 0;
		//	player.completionist = true;
			//	World.sendWorldMessage(
		//			"<col=FF0000><img=7>News: "+ player.getDisplayName() + " has just been awarded the Completionist Cape!"
		//					+ "</col> ", false);
		//	player.sm("Congrulations, you have been awarded the Completionist Cape!");
		//	player.getInventory().addItem(COMPLETIONISTCAPE, ONE);
			//	player.getInventory().addItem(COMPLETIONISTHOOD, ONE);
		//}
		//else {
		//	player.isMaxed = 0; //<-- Added this for safety reasons.
		//	player.completionist = false;
			//	player.sendMessage("You have not yet met the requirements for the Completionist Cape.");
		//}
		//	}
		//
		//public static void CheckMaxed(Player player) {
		// TODO Auto-generated method stub
		//	
		////}
	
		//}
