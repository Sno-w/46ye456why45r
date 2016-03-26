


package com.rs.game.player.dialogues;

import com.rs.cache.loaders.NPCDefinitions;

public class HomeGuide extends Dialogue {

	private int npcId;
	
	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendEntityDialogue(SEND_1_TEXT_CHAT,
				new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
						"Hello adventurer, I'd like to welcome you to Verzion! If you need some help, I'm your guy." }, IS_NPC, npcId, 9827);

	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			stage = 0;
			sendOptionsDialogue(SEND_DEFAULT_OPTIONS_TITLE,
					"I'd like to have the starter information.",
					"I'm fine, thank you.");
		}else if (stage == 0) {
			if(componentId == OPTION_1) {
				stage = 1;
				sendPlayerDialogue( 9827, "I'd like to have the starter information.");
			}else {
				stage = -2;
				sendPlayerDialogue( 9827, "I'm fine, thank you." );
			}
		}else if (stage == 1) {
			stage = 2;
			sendEntityDialogue(SEND_2_TEXT_CHAT,
					new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
							"Okay. In order to start your adventure, you need to earn some money.",
							"You can thief at the stalls over there."}, IS_NPC, npcId, 9827);
		}else if (stage == 2) {
			stage = 3;
			sendEntityDialogue(SEND_2_TEXT_CHAT,
					new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
							"After you've made some money by thieving, you have to buy some",
							"items in the shops, you can find them around the Home Area."}, IS_NPC, npcId, 9827);
		}else if (stage == 3) {
			stage = 4;
			sendEntityDialogue(SEND_2_TEXT_CHAT,
					new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
							"Now it's time to get some stats. You can easily train your stats",
							"by using your Quest tab -> Monster Teleports'."}, IS_NPC, npcId, 9827);
		}else if (stage == 4) {
			stage = 5;
			sendEntityDialogue(SEND_2_TEXT_CHAT,
					new String[] { NPCDefinitions.getNPCDefinitions(npcId).name,
							"We are almost there, when you've got some stats you can teleport",
							"to the bosses by using your Quest tab."}, IS_NPC, npcId, 9827);
		}else if (stage == 5) {
			stage = -2;
			sendPlayerDialogue( 9827, "Thanks for the info, Roddeck. I'm going to start my adventure now!");
		} else 
			end();

	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub

	}

}
