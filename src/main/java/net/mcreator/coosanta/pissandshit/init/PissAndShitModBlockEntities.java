
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.block.entity.ToiletBlockEntity;
import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class PissAndShitModBlockEntities {
	public static BlockEntityType<?> TOILET;

	public static void load() {
		TOILET = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(PissAndShitMod.MODID, "toilet"), FabricBlockEntityTypeBuilder.create(ToiletBlockEntity::new, PissAndShitModBlocks.TOILET).build(null));
	}
}
