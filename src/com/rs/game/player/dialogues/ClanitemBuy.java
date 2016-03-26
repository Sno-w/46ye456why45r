package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.minigames.CastleWars;
import com.rs.game.player.Skills;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controlers.FightCaves;
import com.rs.game.player.controlers.FightKiln;
import com.rs.utils.ShopsHandler;

public class ClanitemBuy extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		if (Settings.ECONOMY) {
			player.getPackets().sendGameMessage("This NPC is in no mood to talk to you.");
			end();
			return;
		}
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_2_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hey there, I'm the Captain of the Guard, and,",
						" I'm sure you've come to buy my Clan cloak and Vexillum." }, IS_NPC, npcId, 9827);
	}

	private String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Haha, yes I've heard that your cloak and Vexillum are very good, I'd love to buy it." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("The Captain of The Guard", "Clan - Cloak & Vexillum");
			stage = 2;
		} else if (stage == 2) {
			if (componentId == OPTION_1)
				ShopsHandler.openShop(player, 25);
			end();
			}
		}

	private void teleportPlayer(int x, int y, int z) {
		player.setNextWorldTile(new WorldTile(x, y, z));
		player.stopAll();
		player.getControlerManager().startControler("GodWars");
	}

	@Override
	public void finish() {

	}
}
