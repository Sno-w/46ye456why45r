package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.utils.ShopsHandler;

public class MandrithNpc extends Dialogue {

    private int npcId;

    @Override
    public void finish() {

    }

    @Override
    public void run(int interfaceId, int componentId) {
	if (stage == -1) {
	    sendOptionsDialogue("Mandrith", "Open Pkz Point Shop",
		    "Is it easy to kill your opponent?",
		    "How do I earn Pkz Points?");
	    stage = 2;
	} else if (stage == 2) {
	    if (componentId == OPTION_1) {
		ShopsHandler.openShop(player, 10);
		end();
	    }
	    if (componentId == OPTION_2) {
		sendNPCDialogue(npcId, 9827,
			"It depends on your level & also what kind of armor you have!");
		stage = 3;
	    }
	    if (componentId == OPTION_3) {
		sendNPCDialogue(npcId, 9827,
			"The only way you can earn Pkz Points is by killing Players!");
		stage = 3;
	    }
	} else if (stage == 3) {
	    end();
	}
    }

    @Override
    public void start() {
	npcId = (Integer) parameters[0];
	sendNPCDialogue(
		npcId,
		9827,
		"Hello "
			+ player.getDisplayName()
			+ ", I am Mandrith, the most respected Pk-Master of Entrinthy, How can I help you?");
    }
}