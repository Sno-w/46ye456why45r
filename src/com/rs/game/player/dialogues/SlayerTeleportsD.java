package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class SlayerTeleportsD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		Magic.vineTeleport(player, 1690, 5286, 1);
		end();
	    }
	    if (componentId == OPTION_2) {
		if (player.getSkills().getLevel(Skills.SLAYER) < 80) {
		    sendDialogue("You need an slayer level of 80 to use this teleport.");
		    end();
		    return;
		}
		Magic.vineTeleport(player, 3012, 9274, 0);
		end();
	    }
	    if (componentId == OPTION_3) {
		Magic.vineTeleport(player, 4625, 5457, 3);
		end();
	    }
	    if (componentId == OPTION_4) {
		Magic.vineTeleport(player, 3429, 3538, 0);
		end();
	    }
	    if (componentId == OPTION_5) {
		Magic.vineTeleport(player, 1763, 5365, 1);
		end();
	    }
	} else {
	    end();
	}
    }

    @Override
    public void start() {
	sendOptionsDialogue("Choose your destination", "Kuradal's dungeon",
		"Jadinko lair", "Polypore dungeon", "Slayer tower",
		"Ancient cavern");
    }

}