package net.mcreator.coosanta.pissandshit.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;
import java.util.HashMap;

public class PenaltyForTooMuchPoopProcedure {
	public PenaltyForTooMuchPoopProcedure() {
		ServerTickEvents.END_WORLD_TICK.register((level) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", level);
			execute(dependencies);
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PissAndShitMod.LOGGER.warn("Failed to load dependency world for procedure PenaltyForTooMuchPoop!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"execute if entity @a[scores={poop_amount=10..}] run effect give @a[scores={poop_amount=10..}] minecraft:slowness 5 3 false");
	}
}
