package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
//import com.rs.game.minigames.PestControl;

public class MinigameTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 3373, 3092, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2994, 9679, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 2663, 2653, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
	    Magic.vineTeleport(player, 3355, 6110, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		stage = 1;
		sendOptionsDialogue("Choose your destination", "Fight Kiln",
			"Fight Caves", "Recipe for Diaster", "Duel Arena",
			"More Options");
	    }
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 4743, 5170, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 4613, 5129, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 1866, 5324, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 3368, 3266, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		sendOptionsDialogue("Choose your destination", "Warrior Guild",
			"Barrows", "First Page...");
		stage = 2;
	    }
	} else if (stage == 2) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 2879, 3542, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 3563, 3288, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		sendOptionsDialogue("Choose your destination",
			"Dominion Tower", "Clan Wars", "Castle Wars",
			"Crucible", "More Options");
		stage = -1;
	    }
	}
    }

    @Override
    public void start() {
	sendOptionsDialogue("Choose your destination", "Dominion Tower",
		"Clan Wars", "Pest Control", "Crucible", "More Options");
    }

}