package com.rs.game.player.dialogues;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.content.SpiritTree;


public class SpiritTreeD extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = 3636;
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { "Spirit Tree",
						"If you are a friend of the gnome people, ",
							"you are a friend of mine. Do you wish to travel?" }, IS_NPC, npcId, 9827); //SEND_NO_EMOTE
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Select an option", "Yes please.",
					"No thanks.");
			stage = 1;
		} else if (stage == 1) {
			if (componentId == OPTION_1) {
				sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Yes please." },
					IS_PLAYER, player.getIndex(), 9827);
				stage = 3;
			} else if (componentId == OPTION_2) {
				sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "No thanks." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 2;
			}
		} else if (stage == 2)
			end();
		  else if (stage == 3) {
			SpiritTree.openSpiritTree(player);
			end();
		}	
	}

	@Override
	public void finish() {

	}
}