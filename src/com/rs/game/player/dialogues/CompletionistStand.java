package com.rs.game.player.dialogues;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Skills;
import com.rs.game.player.Player;

public class CompletionistStand extends Dialogue {

	private int npcId;

	@Override
	public void start() {
		npcId = (Integer) parameters[0];
			sendEntityDialogue(
				SEND_2_TEXT_CHAT,
				new String[] {
						NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello " + player.getUsername() + " this is the Completionist Cape." +
						" Only the brave deserve this cape of shine! ",
						"Let's see if you deserve this cape or not."}, IS_NPC, npcId,
				9760);
		stage = -1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendOptionsDialogue("Select a Option", "I would like to see the requirements.",
					"Nevermind, I am not interested.");
		}
		if (componentId == OPTION_1) {
			player.getInterfaceManager().sendInterface(719);
			player.getInterfaceManager().sendInterface(275);
			player.getPackets().sendIComponentText(275, 1, "Road to Completionist Cape");
			player.getPackets().sendIComponentText(275, 10, "All 99's and 120 Dungeoneering.");
			player.getPackets().sendIComponentText(275, 11, "You have burned "+ player.burntmagiclogs +" out of 2000 ores.");
			//player.getPackets().sendIComponentText(275, 12, "You have chopped "+ player.choppedmagiclogs +" out of 1000 Magic Logs..");
			player.getPackets().sendIComponentText(275, 13, "You have mined "+ player.RUNITE_ORE_MINED +" out of 2000 Runite ores.");
			player.getPackets().sendIComponentText(275, 14, "You have cooked "+ player.RAW_ROCKTAILS_COOKED +" out of 2000 Rocktails.");
			player.getPackets().sendIComponentText(275, 15, "You have done "+ player.RUNITE_ITEMS_SMITHED +" out of 2000 Rune Items.");
			player.getPackets().sendIComponentText(275, 16, "You have cutted "+ player.ONYX_GEMS_CUT +" out of 1000 Onyx.");
			player.getPackets().sendIComponentText(275, 17, "You have burried "+ player.FROST_BONES_BURIED +" out of 500 Frost Dragon Bones.");
			player.getPackets().sendIComponentText(275, 18, "You have fished "+ player.RAW_ROCKTAILS_FISHED +" out of 2000 Rocktails.");
			player.getPackets().sendIComponentText(275, 19, "You completed the minigame Fightcaves and fightkiln.");
			player.getPackets().sendIComponentText(275, 20, "You have killed Queen Black Dragon.");
			player.getPackets().sendIComponentText(275, 22, "<col=FF0000>All Players Wishing You Good Luck.</col>");
			player.getInterfaceManager().closeChatBoxInterface();
		}
		//magic logs burnt = 2000 runite ore mined = 250 raw rocktails cooked = 2000 rocktail fished. onyx gems cutted 1000 ..gems frpst dragon bones bury 500.. magic logs chopped 1000 .. runite item smithed 200.
			if (componentId == OPTION_2) {
				player.getInterfaceManager().closeChatBoxInterface();
				player.sm("You were not interested.");
			}
	}
	@Override
	public void finish() {

	}

}
