package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.utils.ShopsHandler;

public class DungNpc extends Dialogue {

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
						"Another person. What do you think you're doing here, my monster will crush you.",
						"So you're probably sure, that you will take this risk?" }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Yes, I will demonstrate that I am the strongest!" },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("Dungeoneering - Options", "Dungeoneering Shop",
					"Npc - The Inadequacy", "Npc - The Untouchable", "Npc - The Immortal");
			stage = 2;
		} else if (stage == 2) {
				int option;
			if (componentId == OPTION_1)
				ShopsHandler.openShop(player, 18);
			end();
			if (componentId == OPTION_2)
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(97, 5123, 0));
			end();
			if (componentId == OPTION_3)
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(81, 4994, 0));
			end();
			if (componentId == OPTION_4)
				 Magic.sendNormalTeleportSpell(player, 0, 0, new WorldTile(65, 4994, 0));
			end();
	  }
	}

	@Override
	public void finish() {

	}

}