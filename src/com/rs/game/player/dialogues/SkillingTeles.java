package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class SkillingTeles extends Dialogue {

	@Override
	public void start() {
		stage = 1;
		if (stage == 1) {
			sendOptionsDialogue("Skilling Teleports", "Fishing",
					"Mining", "Agility",
					"Woodcutting", "More Options...");
			stage = 1;
		}
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == OPTION_1) {
				sendOptionsDialogue("Fishing Teleports", "Fishing Guild",
						"Lrc Fishing");
				stage = 6;
			}
			if (componentId == OPTION_2) {
				sendOptionsDialogue("Mining Teleports", "Normal Mining",
						"Lrc Mining");
				stage = 5;
			}
			if (componentId == OPTION_3) {
				sendOptionsDialogue("Agility Teleports", "Gnome Agility",
						"Barbarian Outpost");
				stage = 3;
			}
			if (componentId == OPTION_4) {
				sendOptionsDialogue("Woodcutting Teleports", "Normal & Oaks",
						"Willows", "Yews & Ivy", "Magics");
				stage = 4;
			}
			if (componentId == OPTION_5) {
				stage = 2;
				sendOptionsDialogue("Skilling Teleports",
						"Runecrafting", "Summoning",
						"Hunter", "Farming", "Even more options...");
			}

		} else if (stage == 2) {
			if (componentId == OPTION_1) {
				sendOptionsDialogue("Runecrafting options",
						"Runespan level 1", "RuneSpan level 2",
						"Runespan level 3", "Back");
				stage = 10;
			}

			if (componentId == OPTION_2) {
				sendOptionsDialogue("Summoning options",
						"Taverly Summoning", "North of castlewars",
						 "Back");
				stage = 11;
			}
			if (componentId == OPTION_3) {
				sendOptionsDialogue("Hunter Teleports", "Jungle",
						"Puro Puro");
				stage = 7;
			}
			if (componentId == OPTION_4) {
				sendOptionsDialogue("Farming", "Catherby Patch",
						"Falador Patch", "Ardougne patch", "Port Phasmatys", "back");
				stage = 8;
			}
			if (componentId == OPTION_5) {
				stage = 9;
				sendOptionsDialogue("Skilling Teleports",
						"Construction", "Back to start");
			}
		} else if (stage == 3) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2470,
						3436, 0));
				end();
			}
			if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2552,
						3563, 0));
				end();
			}
		}
		else if (stage == 4) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3170,
						3424, 0));
				end();
			}
			if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3092,
						3236, 0));
				end();
			}
			if (componentId == OPTION_3) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3217,
						3500, 0));
				end();
			}
			if (componentId == OPTION_4) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2702,
						3397, 0));
				end();
			}
		}
		else if (stage == 5) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3300,
						3312, 0));
				end();
			}
			if (componentId == OPTION_2) {
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3652,
        				 5092, 0));
    			end();
			}
		}
		else if (stage == 6) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2599,
						3421, 0));
				end();
			}
			if (componentId == OPTION_2) {
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3648,
        				 5088, 0));
    			end();
			}
		}
				else if (stage == 7) {
			if (componentId == OPTION_1) {
						Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2526,
						2916, 0));
				end();
			}
			if (componentId == OPTION_2) {
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2591,
        				 4317, 0));
    			end();
		}
				}
			else if (stage == 8) { 
		if (componentId == OPTION_1) { //catherby
					Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2807,
					3464, 0));
			end();
		}
		if (componentId == OPTION_2) { //fally
			 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3052,
    				 3303, 0));
			end();
		}
		if (componentId == OPTION_3) { //ardy
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2674,
			3375, 0));
	        end();
		}
		if (componentId == OPTION_4) { //Port Phasmatys
			Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3606,
			3534, 0));
			end();
	     }
		if (componentId == OPTION_5) { //back to start
			sendOptionsDialogue("Skilling Teleports", "Fishing",
					"Mining", "Agility",
					"Woodcutting", "More Options...");
			stage = 1;
	     }
			} else if (stage == 9) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3320,
			3497, 0));
			}
			if (componentId == OPTION_2) {
				sendOptionsDialogue("Skilling Teleports", "Fishing",
						"Mining", "Agility",
						"Woodcutting", "More Options...");
				stage = 1;			
			}
		} else if (stage == 10) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(3996,
						6100, 1));
				end();
			}
			if (componentId == OPTION_2 && player.getSkills().getLevelForXp(Skills.RUNECRAFTING) > 50) { //50	
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4142,
						6080, 1));
				end();		
			}
			if (componentId == OPTION_2 && player.getSkills().getLevelForXp(Skills.RUNECRAFTING) < 50) { //50	
				end();
				player.sm("You need at least 50 Runecrafting to go here!");
			}
			if (componentId == OPTION_3 && player.getSkills().getLevelForXp(Skills.RUNECRAFTING) > 85) { //85
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(4294,
						6028, 1));
				end();	
			}
			if (componentId == OPTION_3 && player.getSkills().getLevelForXp(Skills.RUNECRAFTING) < 85) { //85	
				end();
				player.sm("You need at least 85 Runecrafting to go here!");
			}
			if (componentId == OPTION_4) {
				stage = 2;
				sendOptionsDialogue("Skilling Teleports",
						"Runecrafting", "Summoning",
						"Hunter", "Farming", "Even more options...");
			}
		}  else if (stage == 11) {
			if (componentId == OPTION_1) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2928,
						3448, 0));
				end();
			}
			if (componentId == OPTION_2) {
				Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(2208,
						5347, 0));
				end();			
			}
		}
		
}
	

	@Override
	public void finish() {

	}

}