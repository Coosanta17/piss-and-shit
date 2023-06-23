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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.coosanta.pissandshit.network.PissAndShitModVariables;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModTabs;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModProcedures;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModParticleTypes;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModMenus;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModItems;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModBlocks;
import net.mcreator.coosanta.pissandshit.init.PissAndShitModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class PissAndShitMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "piss_and_shit";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PissAndShitMod");
		PissAndShitModParticleTypes.load();
		PissAndShitModTabs.load();

		PissAndShitModBlocks.load();
		PissAndShitModItems.load();
		PissAndShitModBlockEntities.load();

		PissAndShitModProcedures.load();

		PissAndShitModMenus.load();

		PissAndShitModVariables.SyncJoin();
		PissAndShitModVariables.SyncChangeWorld();
	}
}
