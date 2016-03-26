package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.utils.ShopsHandler;

public class SkillcapeNpc extends Dialogue {

	public class GuidenpcMan {

	}

	private int npcId;

	@Override
	public void start() {
		if (Settings.ECONOMY) {
			player.getPackets().sendGameMessage("This Npc is in no mood to talk to you.");
			end();
			return;
		}
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello, I'm the Cape Mester, and I've currently TWO Skillcape Shops..",
						" Would you like to take a look?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Yes I would love to." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("What would you like to see?", "1. Skillcape Shop",
					"2. Skillcape Shop");
			stage = 2;
		} else if (stage == 2) {
				if (componentId == OPTION_1)
				ShopsHandler.openShop(player, 11);
			end();
			if (componentId == OPTION_2)
				ShopsHandler.openShop(player, 12);
			end();
	  }
	}

	@Override
	public void finish() {

	}

}