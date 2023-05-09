
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.item.DriedShitBrickItem;
import net.mcreator.coosanta.pissandshit.PissAndShitMod;

public class PissAndShitModItems {
	public static Item TOILET;
	public static Item POOP;
	public static Item BLOCK_OF_SHIT;
	public static Item BLOCK_OF_DRIED_SHIT;
	public static Item DRIED_SHIT_BRICKS;
	public static Item DRIED_SHIT_BRICK;

	public static void load() {
		TOILET = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "toilet"), new BlockItem(PissAndShitModBlocks.TOILET, new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS)));
		POOP = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "poop"), new BlockItem(PissAndShitModBlocks.POOP, new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS)));
		BLOCK_OF_SHIT = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "block_of_shit"),
				new BlockItem(PissAndShitModBlocks.BLOCK_OF_SHIT, new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS)));
		BLOCK_OF_DRIED_SHIT = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "block_of_dried_shit"),
				new BlockItem(PissAndShitModBlocks.BLOCK_OF_DRIED_SHIT, new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS)));
		DRIED_SHIT_BRICKS = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "dried_shit_bricks"),
				new BlockItem(PissAndShitModBlocks.DRIED_SHIT_BRICKS, new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS)));
		DRIED_SHIT_BRICK = Registry.register(Registry.ITEM, new ResourceLocation(PissAndShitMod.MODID, "dried_shit_brick"), new DriedShitBrickItem());
	}
}
