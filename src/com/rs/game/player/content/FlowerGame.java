package com.rs.game.player.content;

import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.duel.DuelControler;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class FlowerGame {

    public static void plantFlower(final Player player) {
	final Player thisman = player;
	final double random = Utils.getRandomDouble(100);
	final WorldTile tile = new WorldTile(player);
	if (!player.isDonator()) {
	    player.getPackets().sendGameMessage(
		    "You need to be a Donator(5$+) to plant a flower.");
	    return;
	}
	if (!World.canMoveNPC(player.getPlane(), player.getX(), player.getY(),
		1)
		|| World.getRegion(player.getRegionId()).getSpawnedObject(
			player) != null
		|| player.getControlerManager().getControler() instanceof DuelArena
		|| player.getControlerManager().getControler() instanceof DuelControler) {
	    player.getPackets()
		    .sendGameMessage("You can't plant flowers here.");
	    return;
	}
	if (player.isLocked()) {
	    return;
	}
	player.lock(3);
	int flower = Utils.random(2980, 2987);
	if (random < 0.2) {
	    flower = Utils.random(2987, 2989);
	}
	if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1))
	    if (!player.addWalkSteps(player.getX() + 1, player.getY(), 1))
		if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
		    player.addWalkSteps(player.getX(), player.getY() - 1, 1);
	player.getInventory().deleteItem(299, 1);
	final WorldObject flowerObject = new WorldObject(flower, 10,
		Utils.getRandom(4), tile.getX(), tile.getY(), tile.getPlane());
	World.spawnTemporaryObject(flowerObject, 45000);
	WorldTasksManager.schedule(new WorldTask() {
	    int step;

	    @Override
	    public void run() {
		if (thisman == null || thisman.hasFinished())
		    stop();
		if (step == 1) {
		    thisman.getDialogueManager().startDialogue("FlowerPickup",
			    flowerObject);
		    thisman.setNextFaceWorldTile(tile);
		    stop();
		}
		step++;
	    }
	}, 0, 0);
    }
}