package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.utils.ShopsHandler;

public class SkillersShops extends Dialogue {

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
						"Welcome, I'm Ariane. I have at the moment 4 stores, would you like to take a look?",
						" I will inform you when I get more stores." }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Sure, why not." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Stores (Market)", "Open Fishing Shop",
					"Open Herblore Shop", "Open Crafting Shop", "Open Hunter Shop");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1)
				ShopsHandler.openShop(player, 13);
			end(); 
		if (componentId == OPTION_2)
				ShopsHandler.openShop(player, 14);
			end();
		if (componentId == OPTION_3)
				ShopsHandler.openShop(player, 15);
			end(); 
		if (componentId == OPTION_4)
				ShopsHandler.openShop(player, 22);
			end();
		if (componentId == OPTION_5) {
				stage = 3;
		}
		}
			}


	@Override
	public void finish() {

	}

}