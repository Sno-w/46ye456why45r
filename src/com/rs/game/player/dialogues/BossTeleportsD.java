package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class BossTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		stage = 3;
		sendOptionsDialogue("Choose your destination", "Bandos",
			"Armadyl", "Saradomin", "Zamorak", "Nex");
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2966, 4383, 2);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3479, 9488, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 1195, 6499, 0);
		end();
	    } 
	    if (componentId == OPTION_5) {
		stage = 2;
		sendOptionsDialogue("Choose your destination",
			"Tormented demons", "Bork", "Barrelchest",
			"Dagannoth kings", "Back...");
	    }
	} else if (stage == 2) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 2569, 5737, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 3114, 5528, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3803, 2844, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 2900, 4449, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		stage = -1;
		sendOptionsDialogue("Choose your destination",
			"Godwars bosses", "Corporeal Beast", "Kalphite Queen",
			"Queen Black Dragon", "More Options...");
	    }
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
	    	teleportPlayer(2870, 5363, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
	    	teleportPlayer(2838, 5297, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
	    	teleportPlayer(2923, 5247, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
	    	teleportPlayer(2925, 5330, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
	    	teleportPlayer(2904, 5203, 0);
		end();
	    }
	}
    }
    @Override
    public void start() {
	sendOptionsDialogue("Choose your destination", "Godwars bosses",
		"Corporeal Beast", "Kalphite Queen", "Queen Black Dragon",
		"More Options...");
    }

    private void teleportPlayer(int placeX, int placeY, int placePlane) {
	Magic.vineTeleport(player, placeX, placeY, placePlane);
	player.stopAll();
	player.getControlerManager().startControler("GodWars");
    }

}