/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.client.particle.PissParticle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class PissAndShitModParticleTypes {
	public static final SimpleParticleType PISS = FabricParticleTypes.simple(true);

	public static void clientLoad() {
		ParticleFactoryRegistry.getInstance().register(PISS, PissParticle::provider);
	}

	public static void load() {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("piss_and_shit", "piss"), PISS);
	}
}
