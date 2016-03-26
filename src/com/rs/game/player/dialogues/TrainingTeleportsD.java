package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class TrainingTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 2410, 3853, 0);
		end();
	    } else if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 2872, 9785, 0);
		end();
	    } else if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 3241, 9991, 0);
		end();
	    } else if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 2325, 3804, 0);
		end();
	    } else if (componentId == OPTION_5) {
		Magic.vineTeleport(player, 1157, 6505, 0);
		end();
	    }
	}
    }

    @Override
    public void start() {
	if (player.isLocked()) {
	    end();
	    return;
	}
	sendOptionsDialogue("Choose your destination", "Rock Crabs",
		"Taverley Dungeon [Black Demons]", "Armoured Zombies",
		"Yaks", "Mature grotworms");
    }

}