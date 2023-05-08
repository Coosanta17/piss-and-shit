/*
*	MCreator note:
*
*	If you lock base mod element files, you can edit this file and the proxy files
*	and they won't get overwritten. If you change your mod package or modid, you
*	need to apply these changes to this file MANUALLY.
*
*
*	If you do not lock base mod element files in Workspace settings, this file
*	will be REGENERATED on each build.
*
*/
package net.mcreator.coosanta.pissandshit;

import net.mcreator.coosanta.pissandshit.init.PissAndShitModScreens;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModParticleTypes;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModBlocks;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		PissAndShitModParticleTypes.load();

		PissAndShitModBlocks.clientLoad();
		PissAndShitModScreens.load();

	}
}
