package net.mcreator.coosanta.pissandshit.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

import java.util.Map;
import java.util.HashMap;

public class SetInitPoopAmountProcedure {
	public SetInitPoopAmountProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", handler.getPlayer());
			dependencies.put("x", handler.getPlayer().getX());
			dependencies.put("y", handler.getPlayer().getY());
			dependencies.put("z", handler.getPlayer().getZ());
			dependencies.put("world", handler.getPlayer().level());
			execute(dependencies);
		});
	}

	public static boolean execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PissAndShitMod.LOGGER.warn("Failed to load dependency entity for procedure SetInitPoopAmount!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("piss_and_shit:player_joined_server_previously_poop_check"))).isDone())) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("poop_amount");
				if (_so == null)
					_so = _sc.addObjective("poop_amount", ObjectiveCriteria.DUMMY, Component.literal("poop_amount"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(0);
			}
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("piss_and_shit:player_joined_server_previously_poop_check"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			return true;
		}
		return false;
	}
}
