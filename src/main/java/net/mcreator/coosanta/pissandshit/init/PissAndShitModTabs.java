
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class PissAndShitModTabs {
	public static ResourceKey<CreativeModeTab> TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(PissAndShitMod.MODID, "piss_and_shit_items_and_blocks"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + PissAndShitMod.MODID + ".piss_and_shit_items_and_blocks")).icon(() -> new ItemStack(PissAndShitModBlocks.POOP)).build());
	}
}
