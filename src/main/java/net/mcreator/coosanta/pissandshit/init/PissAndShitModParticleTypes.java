/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.client.particle.PissParticle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PissAndShitModParticleTypes {
	public static final SimpleParticleType PISS = Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation("piss_and_shit", "piss"), FabricParticleTypes.simple(true));

	public static void load() {
		ParticleFactoryRegistry.getInstance().register(PISS, PissParticle::provider);
	}
}
