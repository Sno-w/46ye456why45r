package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class PkingTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 3359, 3671, 0);
		end();
	    }
	    if (componentId == OPTION_2) {
		Magic.vineTeleport(player, 3071, 3649, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 2998, 3912, 0);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 2539, 4715, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		Magic.vineTeleport(player, 3337, 3889, 0);
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
	sendOptionsDialogue("Choose your destination", "East Dragons",
		"Forinthry dungeon", "Wilderness (Lvl 50)", "Magebank",
		"Newgates (47 Wildy)");
    }

}