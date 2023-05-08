
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class PissAndShitModTabs {
	public static CreativeModeTab TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS;

	public static void load() {
		TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS = FabricItemGroupBuilder.create(new ResourceLocation("piss_and_shit", "piss_and_shit_items_and_blocks")).icon(() -> new ItemStack(PissAndShitModBlocks.POOP)).build();
	}
}
