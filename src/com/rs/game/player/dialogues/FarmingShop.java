package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.utils.ShopsHandler;

public class FarmingShop extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		if (Settings.ECONOMY) {
			player.getPackets().sendGameMessage("Mr.Ex is in no mood to talk to you.");
			end();
			return;
		}
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hey, you can buy your farming Supplies from me!",
						"I have two Shops, Would you like to take a look?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Sure, why not." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Farming Shop - Supplies", "1. Shop",
					"2. Shop");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1)
				ShopsHandler.openShop(player, 20);
			else if (componentId == OPTION_2)
				ShopsHandler.openShop(player, 21);
			else if (componentId == OPTION_5) {
				stage = 3;
		}
	  }
	}

	@Override
	public void finish() {

	}

}