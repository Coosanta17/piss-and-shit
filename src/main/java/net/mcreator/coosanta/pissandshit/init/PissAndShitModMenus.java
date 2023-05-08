
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coosanta.pissandshit.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.coosanta.pissandshit.world.inventory.PoopBar0Menu;
import net.mcreator.coosanta.pissandshit.client.gui.PoopBar0Screen;
import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class PissAndShitModMenus {
	public static MenuType<PoopBar0Menu> POOP_BAR;

	public static void load() {
		POOP_BAR = Registry.register(Registry.MENU, new ResourceLocation(PissAndShitMod.MODID, "poop_bar"), new ExtendedScreenHandlerType<>(PoopBar0Menu::new));
		PoopBar0Screen.screenInit();
	}
}
