 package com.rs.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

public class NPCSpawning {

	/**
	 * Contains the custom npc spawning
	 */

	public static void spawnNPCS() {
		World.spawnNPC(0, new WorldTile(3453, 3718, 0), -1, true);
		World.spawnNPC(8629, new WorldTile(1888, 5127, 0), -1, true);
		World.spawnNPC(6971, new WorldTile(4522, 5538, 0), 1, false);
		World.spawnNPC(0, new WorldTile(3453, 3718, 0), -1, true);
		World.spawnNPC(5532, new WorldTile(4525, 5613, 0), -1, true);
		World.spawnNPC(13929, new WorldTile(4516, 5587, 0), 0, true);
		World.spawnNPC(230, new WorldTile(2223, 3796, 2), 1, true);
		World.spawnNPC(8555, new WorldTile(4506, 5590, 0), 0, true);
		World.spawnNPC(10479, new WorldTile(3161, 4278, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4275, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4273, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4270, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4267, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4265, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4263, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4262, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3161, 4261, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3153, 4251, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3156, 4249, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3172, 4261, 0), -1, true);
		World.spawnNPC(10479, new WorldTile(3173, 4268, 0), -1, true);
		//Removing - Clan Wars Purple Portal..
		World.deleteObject(new WorldTile(2990, 9675, 0));
		World.deleteObject(new WorldTile(2990, 9674, 0));
		World.deleteObject(new WorldTile(2991, 9675, 0));
		World.deleteObject(new WorldTile(2991, 9674, 0));
		World.deleteObject(new WorldTile(2992, 9675, 0));
		World.deleteObject(new WorldTile(2992, 9674, 0));
		World.deleteObject(new WorldTile(2993, 9675, 0));
		World.deleteObject(new WorldTile(2993, 9674, 0));
		World.deleteObject(new WorldTile(2994, 9675, 0));
		World.deleteObject(new WorldTile(2994, 9674, 0));
		World.deleteObject(new WorldTile(2995, 9675, 0));
		World.deleteObject(new WorldTile(2995, 9674, 0));
		//Start Wyrmzz
		World.spawnNPC(9463, new WorldTile(2983, 9517, 1), -1, true, true);
		World.spawnNPC(9465, new WorldTile(2974, 9516, 1), -1, true, true);
		World.spawnNPC(9465, new WorldTile(2974, 9516, 1), -1, true, true);
		World.spawnNPC(9467, new WorldTile(2980, 9516, 1), -1, true, true);
		//Start DarkBeasts
		World.spawnNPC(2783, new WorldTile(3413, 3549, 2), -1, true, true);
		World.spawnNPC(2783, new WorldTile(3417, 3551, 2), -1, true, true);
		World.spawnNPC(2783, new WorldTile(3422, 3547, 2), -1, true, true);
		World.spawnNPC(2783, new WorldTile(3428, 3556, 2), -1, true, true);
		World.spawnNPC(2783, new WorldTile(3424, 3560, 2), -1, true, true);
		//Start dragons
		World.spawnNPC(51, new WorldTile(2914, 9807, 0), -1, true, true);
		World.spawnNPC(52, new WorldTile(2914, 9798, 0), -1, true, true);
		World.spawnNPC(53, new WorldTile(2910, 9801, 0), -1, true, true);
		World.spawnNPC(54, new WorldTile(2907, 9806, 0), -1, true, true);
		World.spawnNPC(55, new WorldTile(2902, 9803, 0), -1, true, true);
		//Start Dags
		World.spawnNPC(2881, new WorldTile(2423, 4697, 0), -1, true, true);
		World.spawnNPC(2882, new WorldTile(2425, 4709, 0), -1, true, true);
		World.spawnNPC(2883, new WorldTile(2422, 4721, 0), -1, true, true);
		//start of Glacors
		/* ------------ Glacors ------------*/

		World.spawnNPC(14301, new WorldTile(4194, 5716, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4190, 5708, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4182, 5708, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4714, 5722, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4192, 5720, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4203, 5716, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4176, 5721, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4171, 5715, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4184, 5717, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4212, 5710, 0), -1, true, true);
		World.spawnNPC(14301, new WorldTile(4212, 5718, 0), -1, true, true);
//daggs
		World.spawnNPC(2883, new WorldTile(2916, 4442, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2916, 4442, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2923, 4446, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2923, 4450, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2920, 4456, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2914, 4460, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2907, 4458, 0), -1, true);
		World.spawnNPC(2883, new WorldTile(2905, 4452, 0), -1, true);
//penguins donatorzone
		World.spawnNPC(131, new WorldTile(2140, 5103, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2141, 5092, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2149, 5093, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2154, 5094, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2161, 5093, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2163, 5098, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2160, 5103, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2162, 5105, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2156, 5100, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2150, 5105, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2146, 5106, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2143, 5104, 0), -1, true);
		World.spawnNPC(131, new WorldTile(2143, 5099, 0), -1, true);
//monkey guards
		World.spawnNPC(1459, new WorldTile(2793, 2783, 0), -1, true);
		World.spawnNPC(1459, new WorldTile(2801, 2781, 0), -1, true);
		World.spawnNPC(1459, new WorldTile(2802, 2789, 0), -1, true);
		World.spawnNPC(1459, new WorldTile(2799, 2791, 0), -1, true);
		World.spawnNPC(1459, new WorldTile(2791, 2791, 0), -1, true);
		//yaks
		World.spawnNPC(5529, new WorldTile(2327, 3796, 0), -1, true);
		World.spawnNPC(5529, new WorldTile(2326, 3793, 0), -1, true);
		World.spawnNPC(5529, new WorldTile(2322, 3791, 0), -1, true);
		World.spawnNPC(5529, new WorldTile(2318, 3793, 0), -1, true);
		World.spawnNPC(5529, new WorldTile(2320, 3796, 0), -1, true);


		//ganodermic beasts
		World.spawnNPC(14696, new WorldTile(4625, 5403, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4631, 5405, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4639, 5414, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4646, 5405, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4646, 5397, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4639, 5389, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4652, 5392, 0), -1, true);
		World.spawnNPC(14696, new WorldTile(4657, 5405, 0), -1, true);

		//rockcrabs
		World.spawnNPC(1265, new WorldTile(2696, 3715, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2700, 3715, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2705, 3715, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2716, 3715, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2694, 3719, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2702, 3722, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2709, 3720, 0), -1, true);
		World.spawnNPC(1265, new WorldTile(2717, 3725, 0), -1, true);
//START OF VARROCK HOME
World.spawnNPC(15605, new WorldTile(2155, 5099, 0), -1, true); //donator Shop Penguin
World.spawnNPC(14860, new WorldTile(2805, 3463, 0), -1, true); //Farming
World.spawnNPC(14860, new WorldTile(3049, 3304, 0), -1, true); //Farming
World.spawnNPC(14860, new WorldTile(2673, 3379, 0), -1, true); //Farming
World.spawnNPC(14860, new WorldTile(3601, 3532, 0), -1, true); //Farming
World.spawnNPC(9713, new WorldTile(3206, 3427, 0), -1, true); //Dungeoneering
World.spawnNPC(9085, new WorldTile(3211, 3425, 0), -1, true); //Kuradal
World.spawnNPC(7909, new WorldTile(3209, 3434, 0), -1, true); //Roddeck
World.spawnNPC(598, new WorldTile(3206, 3414, 0), -1, true); //Hairdresser
World.spawnNPC(576, new WorldTile(3229, 3425, 0), -1, true); //Harry
World.spawnNPC(455, new WorldTile(3229, 3424, 0), -1, true); //KaqemeeX
World.spawnNPC(1780, new WorldTile(3220, 3432, 0), -1, true); //Larry SkillCapes
World.spawnNPC(519, new WorldTile(3215, 3421, 0), -1, true); //Bob
World.spawnNPC(6537, new WorldTile(3215, 3434, 0), -1, true); //Mandrith
World.spawnNPC(522, new WorldTile(3231, 3440, 0), -1, true); //Weapons
World.spawnNPC(7950, new WorldTile(3203, 3423, 0), -1, true); //Armours
World.spawnNPC(1861, new WorldTile(3203, 3425, 0), -1, true); //Ranging
World.spawnNPC(546, new WorldTile(3225, 3432, 0), -1, true); //Mage
World.spawnNPC(379, new WorldTile(3219, 3424, 0), -1, true); //Potions & Flasks
World.spawnNPC(523, new WorldTile(3213, 3419, 0), -1, true); //Skilling, General Shop
// END OF VARROCK HOME

//Start Camp New HOME

//NEw HOME BANKER
World.spawnNPC(2759, new WorldTile(2982, 3294, 0), -1, true);
World.spawnNPC(553, new WorldTile(2982, 3296, 0), -1, true);
World.spawnNPC(2759, new WorldTile(2982, 3298, 0), -1, true);

World.spawnNPC(9085, new WorldTile(2986, 3300, 0), -1, true); //Kuradal
World.spawnNPC(9713, new WorldTile(2994, 3304, 0), -1, true); //Dungeoneering
World.spawnNPC(7909, new WorldTile(2997, 3287, 0), -1, true); //Roddeck
//World.spawnNPC(598, new WorldTile(3206, 3414, 0), -1, true); //Hairdresser
World.spawnNPC(576, new WorldTile(3229, 3425, 0), -1, true); //Harry wait
World.spawnNPC(455, new WorldTile(2983, 3285, 0), -1, true); //KaqemeeX
World.spawnNPC(1780, new WorldTile(3220, 3432, 0), -1, true); // Larry SkillCapes
World.spawnNPC(519, new WorldTile(2999, 3298, 0), -1, true); //Bob
World.spawnNPC(6537, new WorldTile(2992, 3294, 0), -1, true); //Mandrith
World.spawnNPC(522, new WorldTile(2999, 3290, 0), -1, true); //Weapons
World.spawnNPC(7950, new WorldTile(2984, 3279, 0), -1, true); //Armours
World.spawnNPC(1861, new WorldTile(2985, 3280, 0), -1, true); //Ranging
World.spawnNPC(546, new WorldTile(2997, 3301, 0), -1, true); //Mage DONE
World.spawnNPC(379, new WorldTile(2991, 3285, 0), -1, true); //Potions & Flasks
World.spawnNPC(523, new WorldTile(2994, 3286, 0), -1, true); //Skilling, General Shop
//End of Start Comp Home

//Start EDGEVILLE New HOME
World.spawnNPC(8032, new WorldTile(3084, 3496, 0), -1, true); //skilling teleporter wizard
World.spawnNPC(14860, new WorldTile(3084, 3494, 0), -1, true); //Farming
World.spawnNPC(522, new WorldTile(3080, 3498, 0), -1, true); //Weapons
World.spawnNPC(7950, new WorldTile(3080, 3499, 0), -1, true); //Armours
World.spawnNPC(1861, new WorldTile(3080, 3500, 0), -1, true); //Ranging
World.spawnNPC(546, new WorldTile(3080, 3501, 0), -1, true); //Mage DONE
World.spawnNPC(519, new WorldTile(3081, 3497, 0), -1, true); //Bob misscelause tcsdfcds
World.spawnNPC(379, new WorldTile(3082, 3497, 0), -1, true); //Potions & Flasks
World.spawnNPC(9085, new WorldTile(3088, 3499, 0), -1, true); //Kuradal
World.spawnNPC(9713, new WorldTile(3084, 3506, 0), -1, true); //Dungeoneering
World.spawnNPC(7909, new WorldTile(3090, 3504, 0), -1, true); //Roddeck
World.spawnNPC(598, new WorldTile(3091, 3494, 0), -1, true); //Hairdresser
World.spawnNPC(548, new WorldTile(3091, 3496, 0), -1, true); //thessilia
World.spawnNPC(523, new WorldTile(3090, 3488, 0), -1, true); //Skilling, General Shop
World.spawnNPC(7901, new WorldTile(3084, 3495, 0), -1, true); //skillernpcshop
World.spawnNPC(1780, new WorldTile(3080, 3509, 0), -1, true); // Larry SkillCapes
//End of Start EDGE Home
		// Mentios Manager
		World.spawnNPC(13768, new WorldTile(4517, 5539, 0), -1, true);
		World.spawnNPC(4247, new WorldTile(4524, 5601, 0), 2, true);
		
		World.spawnNPC(13335, new WorldTile(2182, 5669, 0), -1, true);

		World.spawnNPC(3709, new WorldTile(4514, 5595, 0), -1, true);

		World.spawnNPC(13460, new WorldTile(2704, 3642, 0), -1, true);
		World.spawnNPC(3334, new WorldTile(3135, 3739, 0), -1, true);

		World.spawnNPC(550, new WorldTile(4515, 5601, 0), 0, false);
		// Missions
		/* Spawns */
		// Khumn, mission giver
		World.spawnNPC(15867, new WorldTile(3145, 4656, 0), 0, false);
		/* More shops */
		World.spawnNPC(551, new WorldTile(4513, 5601, 0), 0, false);
		World.spawnNPC(554, new WorldTile(4509, 5607, 0), 0, false);

		/* Spell and prayer books switcher (Father Aereck) */
		World.spawnNPC(456, new WorldTile(4524, 5522, 0), 0, false);
		World.spawnNPC(15842, new WorldTile(4711, 5606, 0), -1, false);
		
		
		World.spawnNPC(15839, new WorldTile(4502, 5596, 0), 0, false);
		World.spawnNPC(15839, new WorldTile(4504, 5596, 0), 0, false);
		World.spawnNPC(15839, new WorldTile(4506, 5596, 0), 0, false);
		World.spawnNPC(15839, new WorldTile(4508, 5596, 0), 0, false);
		
		//Donator potion npc shop
		World.spawnNPC(13755, new WorldTile(2156, 5098, 0), -1, true);

//DUNGEONEERING BOSSES
//the inadequacy
World.spawnNPC(5902, new WorldTile(105, 5125, 0), -1, true);
World.spawnNPC(5902, new WorldTile(101, 5129, 0), -1, true);
//the untouchable
World.spawnNPC(5904, new WorldTile(89, 4999, 0), -1, true);
World.spawnNPC(5904, new WorldTile(87, 4994, 0), -1, true);
World.spawnNPC(5904, new WorldTile(91, 4995, 0), -1, true);
World.spawnNPC(5904, new WorldTile(92, 5000, 0), -1, true);
World.spawnNPC(5904, new WorldTile(92, 5004, 0), -1, true);
World.spawnNPC(5904, new WorldTile(88, 5005, 0), -1, true);
World.spawnNPC(5904, new WorldTile(86, 5005, 0), -1, true);
World.spawnNPC(5904, new WorldTile(84, 5003, 0), -1, true);
//LolthenKILL
World.spawnNPC(15172, new WorldTile(69, 5000, 0), -1, true);
World.spawnNPC(15172, new WorldTile(66, 5000, 0), -1, true);
World.spawnNPC(15172, new WorldTile(69, 4999, 0), -1, true);
World.spawnNPC(15172, new WorldTile(75, 5005, 0), -1, true);
World.spawnNPC(15172, new WorldTile(77, 5002, 0), -1, true);
World.spawnNPC(15172, new WorldTile(74, 5000, 0), -1, true);
World.spawnNPC(15172, new WorldTile(72, 4997, 0), -1, true);
World.spawnNPC(15172, new WorldTile(70, 4993, 0), -1, true);
World.spawnNPC(15172, new WorldTile(73, 4994, 0), -1, true);

		/* Bankers inside of the home */
		World.spawnNPC(15839, new WorldTile(4515, 5525, 0), 0, false);
		World.spawnNPC(15840, new WorldTile(4515, 5527, 0), 0, false);
		World.spawnNPC(15841, new WorldTile(4515, 5529, 0), 0, false);
		World.spawnNPC(15842, new WorldTile(4515, 5531, 0), 0, false);
		World.spawnNPC(15843, new WorldTile(4515, 5533, 0), 0, false);
		World.spawnNPC(15839, new WorldTile(4515, 5535, 0), 0, false);

		World.spawnNPC(15839, new WorldTile(4524, 5525, 0), 0, false);
		World.spawnNPC(15840, new WorldTile(4524, 5527, 0), 0, false);
		World.spawnNPC(15841, new WorldTile(4524, 5529, 0), 0, false);
		World.spawnNPC(15842, new WorldTile(4524, 5531, 0), 0, false);
		World.spawnNPC(15843, new WorldTile(4524, 5533, 0), 0, false);
		World.spawnNPC(15839, new WorldTile(4524, 5535, 0), 0, false);


		/* Start of new home */
		/**************************************************************************/
		/**************************************************************************/
		// Bankers
		World.spawnNPC(495, new WorldTile(3213, 3439, 0), -1, false, false);
		World.spawnNPC(494, new WorldTile(3212, 3439, 0), -1, false, false);
		World.spawnNPC(494, new WorldTile(3682, 2983, 0), -1, false, false);
		//OBjectsSpawns
		//Cape Stand MAX CAPE
		World.spawnObject(new WorldObject(2562, 10, 2, 3219, 3421, 0), true);
		// Thieving stalls NEW HOME
		World.spawnObject(new WorldObject(4874, 10, 1, 3218, 3426, 0), true);
		World.spawnObject(new WorldObject(4875, 10, 1, 3218, 3427, 0), true);
		World.spawnObject(new WorldObject(4876, 10, 1, 3218, 3428, 0), true);
		World.spawnObject(new WorldObject(4877, 10, 1, 3218, 3429, 0), true);
		World.spawnObject(new WorldObject(4878, 10, 1, 3218, 3430, 0), true);
		World.spawnObject(new WorldObject(2079, 10, 2, 3218, 3431, 0), true);
		World.spawnObject(new WorldObject(17010, 10, -2, 3227, 3421, 0), true);// 9-Astral
		/**************************************************************************/
		/**************************************************************************/
		/* End of new Home */

		//New Home - Edge
		//Start of the new home
		// Thieving stalls NEW HOME
		World.spawnObject(new WorldObject(4874, 10, 1, 3091, 3487, 0), true);
		World.spawnObject(new WorldObject(4875, 10, 1, 3092, 3487, 0), true);
		World.spawnObject(new WorldObject(4876, 10, 1, 3093, 3487, 0), true);
		World.spawnObject(new WorldObject(4877, 10, 1, 3094, 3487, 0), true);
		World.spawnObject(new WorldObject(4878, 10, 1, 3095, 3487, 0), true);
		World.spawnObject(new WorldObject(17010, 10, -2, 3094, 3502, 0), true);// 9-Astral
		//end of the new home
		/*Banks at marketplace */
		World.spawnObject(new WorldObject(76274, 10, 0, 4510, 5595, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4510, 5596, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4510, 5597, 0), true);

		World.spawnObject(new WorldObject(76274, 10, -3, 4509, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4508, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4507, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4506, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4505, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4504, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4503, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4502, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4501, 5597, 0), true);

		World.spawnObject(new WorldObject(76274, 10, 0, 4501, 5597, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4501, 5596, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4501, 5595, 0), true);

		/* Banks at home */
		World.spawnObject(new WorldObject(76274, 10, -3, 4525, 5524, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4524, 5524, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4523, 5524, 0), true);

		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5525, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5526, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5527, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5528, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5529, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5530, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5531, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5532, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5533, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5534, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5535, 0), true);

		World.spawnObject(new WorldObject(76274, 10, 0, 4525, 5536, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4524, 5536, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4523, 5536, 0), true);

		World.spawnObject(new WorldObject(76274, 10, -3, 4516, 5524, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4515, 5524, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4514, 5524, 0), true);

		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5525, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5526, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5527, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5528, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5529, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5530, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5531, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5532, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5533, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5534, 0), true);
		World.spawnObject(new WorldObject(76274, 10, 0, 4516, 5535, 0), true);

		World.spawnObject(new WorldObject(76274, 10, -3, 4516, 5536, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4515, 5536, 0), true);
		World.spawnObject(new WorldObject(76274, 10, -3, 4514, 5536, 0), true);
		World.spawnObject(new WorldObject(45570, 10, -3, 4517, 5524, 0), true);
		World.spawnObject(new WorldObject(45570, 10, -3, 4517, 5536, 0), true);
		World.spawnObject(new WorldObject(45570, 10, -3, 4522, 5536, 0), true);
		World.spawnObject(new WorldObject(45570, 10, -3, 4522, 5524, 0), true);

		// Tzhaar
		World.spawnNPC(2625, new WorldTile(2617, 5132, 0), -1, false);
		World.spawnNPC(2614, new WorldTile(4666, 5082, 0), -1, false);

		// Donator Zone NPCS
		//World.spawnNPC(6892, new WorldTile(1605, 4508, 0), -1, false); // Petshop
		//World.spawnNPC(1918, new WorldTile(1605, 4506, 0), -1, false); // Mandrith
		//World.spawnNPC(14854, new WorldTile(1605, 4505, 0), -1, false); // Kaqemeex
		/* Dungeoneering - Dungeon room objects */
		World.spawnObject(new WorldObject(49766, 10, 2, 89, 721, 0), true);
		World.spawnObject(new WorldObject(49768, 10, 2, 88, 721, 0), true);
		World.spawnObject(new WorldObject(49770, 10, 2, 87, 721, 0), true);
		World.spawnObject(new WorldObject(49772, 10, 2, 86, 721, 0), true);
		World.spawnObject(new WorldObject(49774, 10, 2, 85, 721, 0), true);
		// Donator Zone Objects A.k.A Banks
		World.spawnObject(new WorldObject(36786, 10, 2, 4455, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4456, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4457, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4458, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4459, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4460, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4461, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4462, 4528, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4462, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4461, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4460, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4459, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4458, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4457, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4456, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 4455, 4512, 0), true);
		World.spawnObject(new WorldObject(36786, 10, 2, 2967, 4379, 2), true);
		//Home Banks
		World.spawnObject(new WorldObject(36786, 10, 2, 3214, 3438, 0, 2), true);
	 	World.spawnObject(new WorldObject(36786, 10, 2, 3213, 3438, 0, 2), true);
	 	World.spawnObject(new WorldObject(36786, 10, 2, 3212, 3438, 0, 2), true);
	 	World.spawnObject(new WorldObject(36786, 10, 2, 3211, 3438, 0, 2), true);
		// runite ores
		World.spawnObject(new WorldObject(14860, 10, -3, 1595, 4505, 0), true);
		World.spawnObject(new WorldObject(14860, 10, -3, 1595, 4506, 0), true);
		World.spawnObject(new WorldObject(14860, 10, -3, 1595, 4507, 0), true);
		World.spawnObject(new WorldObject(14860, 10, -3, 1595, 4508, 0), true);
		World.spawnObject(new WorldObject(14860, 10, -3, 1595, 4509, 0), true);
		World.spawnObject(new WorldObject(13704, 10, -3, 4524, 5599, 0), true);
		// magic tree
		World.spawnObject(new WorldObject(1306, 10, 0, 1595, 4503, 0), true);
		World.spawnObject(new WorldObject(1306, 10, 0, 1595, 4510, 0), true);
		// Furnace and Anvil
		World.spawnObject(new WorldObject(11010, 10, -4, 1599, 4512, 0), true);
		World.spawnObject(new WorldObject(2783, 10, -4, 1603, 4512, 0), true);
		// Thieving stall
		// World.spawnObject(new WorldObject(34385, 10, 0, 4464, 4524, 0),
		// true);

		// World.spawnNPC(4874, new WorldTile(4509, 5588, 0), -1, true, true);

		// Fishing SPOT spawnings!
		World.spawnNPC(327, new WorldTile(2604, 3419, 0), -1, true, true);
		World.spawnNPC(6267, new WorldTile(2605, 3420, 0), -1, true, true);
		World.spawnNPC(312, new WorldTile(2605, 3421, 0), -1, true, true);
		World.spawnNPC(313, new WorldTile(2604, 3422, 0), -1, true, true);
		World.spawnNPC(952, new WorldTile(2603, 3422, 0), -1, true, true);
		World.spawnNPC(327, new WorldTile(2604, 3423, 0), -1, true, true);
		World.spawnNPC(6267, new WorldTile(2605, 3424, 0), -1, true, true);
		World.spawnNPC(312, new WorldTile(2605, 3425, 0), -1, true, true);
		World.spawnNPC(327, new WorldTile(2599, 3419, 0), -1, true, true);
		World.spawnNPC(6267, new WorldTile(2598, 3422, 0), -1, true, true);
		World.spawnNPC(8864, new WorldTile(2590, 3419, 0), -1, true, true);

		World.spawnObject(new WorldObject(38453, 10, -3, 4502, 5608, 0), true);// unlit
																				// beac

		// Fishing spot
		World.spawnObject(new WorldObject(36786, 10, 2, 2587, 3422, 0), true);

		// Runecrafting skill ALTARS + NPC's + Banks
		World.spawnObject(new WorldObject(2478, 10, -2, 2600, 3155, 0), true);// 1-Air
																				// altar
		World.spawnObject(new WorldObject(2479, 10, -2, 2597, 3155, 0), true);// 2-Mind
																				// altar
		World.spawnObject(new WorldObject(2480, 10, -2, 2594, 3157, 0), true);// 3-Water
																				// altar
		World.spawnObject(new WorldObject(2481, 10, -2, 2594, 3160, 0), true);// 4-Earth
																				// altar
		World.spawnObject(new WorldObject(2482, 10, -2, 2594, 3163, 0), true);// 5-Fire
																				// altar
		World.spawnObject(new WorldObject(2483, 10, -2, 2594, 3166, 0), true);// 6-Body
																				// altar
		World.spawnObject(new WorldObject(2484, 10, -2, 2603, 3157, 0), true);// 7-Cosmic
																				// altar
		World.spawnObject(new WorldObject(2487, 10, -2, 2603, 3160, 0), true);// 8-Chaos
																				// altar
		World.spawnObject(new WorldObject(17010, 10, -2, 2603, 3163, 0), true);// 9-Astral
																				// altar
		World.spawnObject(new WorldObject(2486, 10, -2, 2603, 3166, 0), true);// 10-Nature
																				// altar
		World.spawnObject(new WorldObject(2485, 10, -2, 2600, 3168, 0), true);// 11-Law
																				// altar
		World.spawnObject(new WorldObject(2488, 10, -2, 2597, 3168, 0), true);// 12-Death
																				// altar
		World.spawnObject(new WorldObject(30624, 10, -2, 2510, 3169, 0), true);// 13-Blood
																				// altar
		World.spawnObject(new WorldObject(2489, 10, -2, 2513, 3169, 0), true);// 14-Soul
																				// altar
		World.spawnObject(new WorldObject(27663, 10, -1, 2599, 3165, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -3, 2600, 3165, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -1, 2599, 3164, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -3, 2600, 3164, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -1, 2599, 3163, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -3, 2600, 3163, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -1, 2599, 3162, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -3, 2600, 3162, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -1, 2599, 3161, 0), true);// Bank
																				// chest
		World.spawnObject(new WorldObject(27663, 10, -3, 2600, 3161, 0), true);// Bank
																				// chest
		World.spawnNPC(537, new WorldTile(2598, 3162, 0), -1, true, true);// Aubury
																			// (rc
																			// shop)

		// summoning area NPC
		World.spawnNPC(6970, new WorldTile(2207, 5345, 0), -1, true, true);// Pikkupstix
																			// (summoning
																			// shops)

	}

	/**
	 * The NPC classes.
	 */
	private static final Map<Integer, Class<?>> CUSTOM_NPCS = new HashMap<Integer, Class<?>>();

	public static void npcSpawn() {
		int size = 0;
		boolean ignore = false;
		try {
			for (String string : FileUtilities
					.readFile("data/npcs/npcspawns.txt")) {
				if (string.startsWith("//") || string.equals("")) {
					continue;
				}
				if (string.contains("/*")) {
					ignore = true;
					continue;
				}
				if (ignore) {
					if (string.contains("*/")) {
						ignore = false;
					}
					continue;
				}
				String[] spawn = string.split(" ");
				@SuppressWarnings("unused")
				int id = Integer.parseInt(spawn[0]), x = Integer
						.parseInt(spawn[1]), y = Integer.parseInt(spawn[2]), z = Integer
						.parseInt(spawn[3]), faceDir = Integer
						.parseInt(spawn[4]);
				NPC npc = null;
				Class<?> npcHandler = CUSTOM_NPCS.get(id);
				if (npcHandler == null) {
					npc = new NPC(id, new WorldTile(x, y, z), -1, true, false);
				} else {
					npc = (NPC) npcHandler.getConstructor(int.class)
							.newInstance(id);
				}
				if (npc != null) {
					WorldTile spawnLoc = new WorldTile(x, y, z);
					npc.setLocation(spawnLoc);
					World.spawnNPC(npc.getId(), spawnLoc, -1, true, false);
					size++;
				}
			}
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		}
		System.err.println("Loaded " + size + " custom npc spawns!");
	}

}