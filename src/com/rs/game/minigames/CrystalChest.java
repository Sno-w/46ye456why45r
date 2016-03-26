package com.rs.game.minigames;

import com.rs.game.player.Player;
import com.rs.game.Animation;
import com.rs.utils.Utils;

/**
 * Represents the chest on which the key is used.
 * @author 'Corey 2010 <MobbyGFX96@hotmail.co.uk>
 * @Completed by Defiled on RuneServer
 */

public class CrystalChest {
	
	private static final int[] CHEST_REWARDS = {24154, 24155, 10398, 10396, 10394, 10366, 8872, 8901, 5016, 5018, 3385, 3387, 3389, 3391, 3393, 2651,
2653, 2655, 2657, 2659, 2661, 2663, 2665, 2667, 2669, 2671, 2673, 2675, 3105, 3107, 3122, 2631, 2633, 2635, 2637, 2639, 2641, 2643, 2645, 2647, 2649, 2651, 2653, 2655, 2657, 2659, 2661, 2663, 2665, 2667, 2669, 2671, 2673, 2675, 48, 50, 52, 4131,
1434, 1377, 2581, 2579, 2583, 2585, 2587, 2589, 2615, 2617, 2619, 2621, 2633, 2635, 2637, 2639, 2641, 2643, 4153, 23680, 4587, 4675, 5016, 5018, 6137, 6139, 6141, 6143, 6145, 6147, 6149, 6151, 
6153, 6392, 6394, 6396, 6760, 6762, 6764, 6858, 6859, 6860, 6861, 6862, 6863, 
8872, 8901, 8924};
	public static final int[] KEY_HALVES = { 985, 987 };
	public static final int KEY = 989;
	public static final int Animation = 881;
	
	/**
	 * Represents the key being made.
	 * Using tooth halves.
	 */
	public static void makeKey(Player p){
		if (p.getInventory().containsItem(toothHalf(), 1) 
				&& p.getInventory().containsItem(loopHalf(), 1)){
			p.getInventory().deleteItem(toothHalf(), 1);
			p.getInventory().deleteItem(loopHalf(), 1);
			p.getInventory().addItem(KEY, 1);
			p.getDialogueManager().startDialogue("SimpleMessage", "You succesfully make a crytal key.");
		}
	}
	
	/**
	 * If the player can open the chest.
	 */
	public static boolean canOpen(Player p){
		if(p.getInventory().containsItem(KEY, 1)){
			return true;
		}else{
			p.getDialogueManager().startDialogue("SimpleMessage", "The chest is locked!");
			return false;
		}
	}
	
	/**
	 * When the player searches the chest.
	 */
	public static void searchChest(final Player p){
		if (canOpen(p)){
			p.getPackets().sendGameMessage("You unlock the chest with your crystal key.");
			p.getInventory().deleteItem(KEY, 1);
			p.setNextAnimation(new Animation(Animation));
			p.getInventory().addItem(995, Utils.random(500000));
			p.getInventory().addItem(CHEST_REWARDS[Utils.random(getLength() - 0)], 1);
			p.getDialogueManager().startDialogue("SimpleMessage", 
					"You find some treasure along with some coins in the chest!");
		}
	}
	
	public static int getLength() {
		return CHEST_REWARDS.length;
	}
	
	/**
	 * Represents the toothHalf of the key.
	 */
	public static int toothHalf(){
		return KEY_HALVES[0];
	}
	
	/**
	 * Represent the loop half of the key.
	 */
	public static int loopHalf(){
		return KEY_HALVES[1];
	}
	
}