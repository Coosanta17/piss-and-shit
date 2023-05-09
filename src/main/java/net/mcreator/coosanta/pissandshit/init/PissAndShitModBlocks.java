
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.block.ToiletBlock;
import net.mcreator.coosanta.pissandshit.block.PoopBlock;
import net.mcreator.coosanta.pissandshit.block.DriedShitBricksBlock;
import net.mcreator.coosanta.pissandshit.block.BlockOfShitBlock;
import net.mcreator.coosanta.pissandshit.block.BlockOfDriedShitBlock;
import net.mcreator.coosanta.pissandshit.PissAndShitMod;

public class PissAndShitModBlocks {
	public static Block TOILET;
	public static Block POOP;
	public static Block BLOCK_OF_SHIT;
	public static Block BLOCK_OF_DRIED_SHIT;
	public static Block DRIED_SHIT_BRICKS;

	public static void load() {
		TOILET = Registry.register(Registry.BLOCK, new ResourceLocation(PissAndShitMod.MODID, "toilet"), new ToiletBlock());
		POOP = Registry.register(Registry.BLOCK, new ResourceLocation(PissAndShitMod.MODID, "poop"), new PoopBlock());
		BLOCK_OF_SHIT = Registry.register(Registry.BLOCK, new ResourceLocation(PissAndShitMod.MODID, "block_of_shit"), new BlockOfShitBlock());
		BLOCK_OF_DRIED_SHIT = Registry.register(Registry.BLOCK, new ResourceLocation(PissAndShitMod.MODID, "block_of_dried_shit"), new BlockOfDriedShitBlock());
		DRIED_SHIT_BRICKS = Registry.register(Registry.BLOCK, new ResourceLocation(PissAndShitMod.MODID, "dried_shit_bricks"), new DriedShitBricksBlock());
	}

	public static void clientLoad() {
		ToiletBlock.clientInit();
		PoopBlock.clientInit();
		BlockOfShitBlock.clientInit();
		BlockOfDriedShitBlock.clientInit();
		DriedShitBricksBlock.clientInit();
	}
}
