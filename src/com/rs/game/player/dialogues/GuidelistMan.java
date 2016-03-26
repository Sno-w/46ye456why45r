package com.rs.game.player.dialogues;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Magic;
import com.rs.utils.ShopsHandler;

public class GuidelistMan extends Dialogue {

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
						"Hey, glad you came..",
						" I have something important which I shall show you." }, IS_NPC, npcId, 9827);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			sendEntityDialogue(SEND_1_TEXT_CHAT,
					new String[] { player.getDisplayName(), "Sounds good, thank you." },
					IS_PLAYER, player.getIndex(), 9827);
			stage = 1;
		} else if (stage == 1) {
			sendOptionsDialogue("What would you like to see?", "Open Command List",
					"About Entrinthy", "Open Rule Page");
			stage = 2;
		} else if (stage == 2) {
				if (componentId == OPTION_1)
					player.getInterfaceManager().sendInterface(275);
				for (int i = 0; i < 100; i++) {
			player.getPackets().sendIComponentText(275, i, "");
			}
				for(Player p5 : World.getPlayers()) {
					if(p5 == null)
					continue;
			}
				player.getPackets().sendIComponentText(275, 1, "Teleports Commands"); 
              	player.getPackets().sendIComponentText(275, 16, "...Teleports...");
player.getPackets().sendIComponentText(275, 17, "<col=ff0000>::Strykewyrms</col> ------Takes you to Strykewyrms.");
player.getPackets().sendIComponentText(275, 18, "<col=ff0000>::Jadinko</col> ------ Takes you to Jadinko Lair.");
player.getPackets().sendIComponentText(275, 19, "<col=ff0000>::Ganodermic</col> ------- Takes you to Ganodermic Dungeon.");
player.getPackets().sendIComponentText(275, 21, "<col=ff0000>::Glacors</col> ------ Takes you to Glacors Dungeon.");
player.getPackets().sendIComponentText(275, 23, "<col=ff0000>::Bandos</col> ----- Takes you to Bandos Dungeon.");
player.getPackets().sendIComponentText(275, 24, "<col=ff0000>::Armadyl</col> ------ Takes you to Armadyl Dungeon.");
player.getPackets().sendIComponentText(275, 25, "<col=ff0000>::Saradomin</col> ------ Takes you to Saradomin Dungeon.");
              	player.getPackets().sendIComponentText(275, 26, "<col=ff0000>::Zamorak</col> ------ Takes you to Zamorak Dungeon. ");
player.getPackets().sendIComponentText(275, 28, "<col=ff0000>::Daggs</col> ------ Takes you to the Dagannoth Dungeon.");
              	player.getPackets().sendIComponentText(275, 29, "<col=ff0000>::KBD</col> ------ Takes you to KBD.");
player.getPackets().sendIComponentText(275, 30, "<col=ff0000>::Skelets</col> ------ Takes you to Skeletons.");
player.getPackets().sendIComponentText(275, 40, "...Usefull Commands...");
player.getPackets().sendIComponentText(275, 42, "<col=ff0000>::Female & Male</col> ------ Change your Gender?");
player.getPackets().sendIComponentText(275, 43, "<col=ff0000>::Kdr</col> ------ Kills & Deaths?");
player.getPackets().sendIComponentText(275, 44, "<col=ff0000>::Ranks</col> ------- Look at Pk Ranks!");
player.getPackets().sendIComponentText(275, 45, "<col=ff0000>::Ticket</col> ------ Need help? (don't abuse it).");
player.getPackets().sendIComponentText(275, 46, "<col=ff0000>::Empty</col> ----- Empty Your Inventory!");
player.getPackets().sendIComponentText(275, 47, "<col=ff0000>::Changepass</col> ------ Change yout Password.");
player.getPackets().sendIComponentText(275, 48, "<col=ff0000>::Togglexp</col> ------ Toggle Your Xp!.");
player.getPackets().sendIComponentText(275, 49, "<col=ff0000>::Myslayertask</col> ------ Want to know your Slayer Task?");
              	player.getPackets().sendIComponentText(275, 49, "<col=ff0000>::Players</col> ------ Who's Online? ");
player.getPackets().sendIComponentText(275, 50, "<col=ff0000>::Home</col> ------ Teleport Home.");
player.getPackets().sendIComponentText(275, 55, "...Quick Links...");
              	player.getPackets().sendIComponentText(275, 56, "<col=ff0000>::Forums</col> ------ Register & Post! ");
player.getPackets().sendIComponentText(275, 57, "<col=ff0000>::Website</col> ------ Look at our Website!");
              	player.getPackets().sendIComponentText(275, 58, "<col=ff0000>::Vote</col> ------ Vote Now!");
player.getPackets().sendIComponentText(275, 58, "<col=ff0000>::Donate</col> ------ Keep Us Alive (Support Entrinthy)!");
			end();
		}
				if (componentId == OPTION_2)
					player.getInterfaceManager().sendInterface(275);
				for (int i = 0; i < 100; i++) {
			player.getPackets().sendIComponentText(275, i, "");
			}
				for(Player p5 : World.getPlayers()) {
					if(p5 == null)
					continue;
			}
				player.getPackets().sendIComponentText(275, 1,
	                    "Welcome to " + Settings.SERVER_NAME + ".");
	            player.getPackets().sendIComponentText(275, 11, "");
	            player.getPackets().sendIComponentText(275, 10,
	                    "Welcome to " + Settings.SERVER_NAME + " RSPS.");
	            player.getPackets().sendIComponentText(275, 12,
	                    "Entrinthy is a wonderful economy server.");
	            player.getPackets().sendIComponentText(275, 13,
	                    "Everywhere You Turn, There Are Many");
	            player.getPackets().sendIComponentText(275, 14,
	                    "opprotunities Such As Skilling, Bossing, ");
	            player.getPackets().sendIComponentText(275, 15, 
	            		"Player Killing, and Minigames!");
	            player.getPackets().sendIComponentText(275, 16,
	                    "We are Home of Amazing Content!");
	            player.getPackets().sendIComponentText(275, 17,
	                    "");
	            player.getPackets().sendIComponentText(275, 18,
	                    "If You Need Any Help, Do ::ticket. (Don't abuse it)");
	            player.getPackets().sendIComponentText(275, 19, "");
	            player.getPackets().sendIComponentText(275, 20,
	                    "Also, You Can Compare Stats With Friends.");
	            player.getPackets().sendIComponentText(275, 21, "");
	            player.getPackets().sendIComponentText(275, 22,
	                    "Oh and Yeah, Don't Forget To ::Vote and Follow Rules.");
	            player.getPackets().sendIComponentText(275, 23, "");
	            player.getPackets().sendIComponentText(275, 24,
	                    "Visit The Website: " + Settings.WEBSITE_LINK);
	            player.getPackets().sendIComponentText(275, 25, "");
	            player.getPackets().sendIComponentText(275, 26,
	                    "Enjoy your time on " + Settings.SERVER_NAME + ".");
	            player.getPackets().sendIComponentText(275, 27,
	                    "<img=1> Enth & Nilez...");
	            player.getPackets().sendIComponentText(275, 28, "");
	            player.getPackets().sendIComponentText(275, 29, "");
	            player.getPackets().sendIComponentText(275, 30, "");
	            player.getPackets().sendIComponentText(275, 31, "");
	            player.getPackets().sendIComponentText(275, 32, "");
	            player.getPackets().sendIComponentText(275, 33, "");
	            player.getPackets().sendIComponentText(275, 34, "");
	            player.getPackets().sendIComponentText(275, 35, "");
	            player.getPackets().sendIComponentText(275, 36, "");
	            player.getPackets().sendIComponentText(275, 37, "");
	            player.getPackets().sendIComponentText(275, 38, "");
	            player.getPackets().sendIComponentText(275, 39, "");
	            player.getPackets().sendIComponentText(275, 40, "");
			end();
				if (componentId == OPTION_3)
					player.getPackets().sendOpenURL(
							"http://entrinthy742.com");
			end();
	  }
	

	@Override
	public void finish() {

	}

}