package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class SkillingTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 2599, 3421, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		sendOptionsDialogue("Choose your destination",
			"Al-kharid Mining", "Karamja Mining",
			"Living rock caverns (LRC)");
		stage = 3;
	    }
	    if (componentId == OPTION_3) {
		sendOptionsDialogue("Choose your destination", "Gnome Agility",
			"Barbarian Outpost");
		stage = 2;
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 3161, 3223, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		stage = 1;
		sendOptionsDialogue("Choose your destination", "Runecrafting",
			"Summoning", "Farming", "Hunter", "More Options...");
	    }
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 3039, 4834, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2923, 3449, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3052, 3304, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 2526, 2916, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		sendOptionsDialogue("Choose your destination",
			"Pyramid Plunder", "Firemaking", "Sawmill (Basic)",
			"Nevermind");
		stage = 4;
	    }
	} else if (stage == 2) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 2470, 3436, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2552, 3563, 0);
		end();
	    }
	} else if (stage == 3) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 3300, 3312, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2849, 3033, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3652, 5122, 0);
		end();
	    }
	} else if (stage == 4) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 3289, 2803, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 1699, 5599, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3310, 3491, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		end();
	    }
	}
    }

    @Override
    public void start() {
	sendOptionsDialogue("Choose your destination", "Fishing Guild",
		"Mining teleports", "Agility teleports", "Woodcutting",
		"More Options...");
    }

}