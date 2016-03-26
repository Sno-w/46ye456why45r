package com.rs.game.player.dialogues;

import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;

public class SpiritTreesD extends Dialogue {

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    if (componentId == OPTION_1) {
		end();
		player.getDialogueManager().startDialogue("MinigameTeleportsD");
	    }
	    if (componentId == OPTION_2) {
		end();
		player.getDialogueManager().startDialogue("SkillingTeleportsD");
	    }
	    if (componentId == OPTION_3) {
		end();
		player.getDialogueManager().startDialogue("TrainingTeleportsD");
	    }
	    if (componentId == OPTION_4) {
		sendOptionsDialogue("Where would you go?",
			"Pking Teleports", "Slayer Teleports",
			"Boss Teleports", "First Page");
		stage = 1;
	    }
	} else if (stage == 1) {
	    if (componentId == OPTION_1) {
		end();
		player.getDialogueManager().startDialogue("PkingTeleportsD");
	    } else if (componentId == OPTION_2) {
		end();
		player.getDialogueManager().startDialogue("SlayerTeleportsD");
	    } else if (componentId == OPTION_3) {
		end();
		player.getDialogueManager().startDialogue("BossTeleportsD");
	    } else if (componentId == OPTION_4) {
		stage = -1;
		sendOptionsDialogue("Where would you go?",
			"Minigame Teleports", "Skilling Teleports",
			"Training Teleports", "More Options");
	    }
	}
    }

    @Override
    public void start() {
	sendOptionsDialogue("Choose your destination", "Minigame Teleports",
		"Skilling Teleports", "Training Teleports", "More Options");
    }

}