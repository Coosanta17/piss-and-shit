
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.item.DriedShitBrickItem;
import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class PissAndShitModItems {
	public static Item TOILET;
	public static Item POOP;
	public static Item BLOCK_OF_SHIT;
	public static Item BLOCK_OF_DRIED_SHIT;
	public static Item DRIED_SHIT_BRICKS;
	public static Item DRIED_SHIT_BRICK;

	public static void load() {
		TOILET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "toilet"), new BlockItem(PissAndShitModBlocks.TOILET, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).register(content -> content.accept(TOILET));
		POOP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "poop"), new BlockItem(PissAndShitModBlocks.POOP, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).register(content -> content.accept(POOP));
		BLOCK_OF_SHIT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "block_of_shit"), new BlockItem(PissAndShitModBlocks.BLOCK_OF_SHIT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).register(content -> content.accept(BLOCK_OF_SHIT));
		BLOCK_OF_DRIED_SHIT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "block_of_dried_shit"), new BlockItem(PissAndShitModBlocks.BLOCK_OF_DRIED_SHIT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).register(content -> content.accept(BLOCK_OF_DRIED_SHIT));
		DRIED_SHIT_BRICKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "dried_shit_bricks"), new BlockItem(PissAndShitModBlocks.DRIED_SHIT_BRICKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).register(content -> content.accept(DRIED_SHIT_BRICKS));
		DRIED_SHIT_BRICK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PissAndShitMod.MODID, "dried_shit_brick"), new DriedShitBrickItem());
	}
}
