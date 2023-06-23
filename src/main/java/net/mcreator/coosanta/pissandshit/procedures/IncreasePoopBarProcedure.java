package net.mcreator.coosanta.pissandshit.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.network.chat.Component;

import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;
import java.util.HashMap;

public class IncreasePoopBarProcedure {
	public IncreasePoopBarProcedure() {
		UseItemCallback.EVENT.register((player, level, hand) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", level);
			dependencies.put("entity", player);
			dependencies.put("x", player.getX());
			dependencies.put("y", player.getY());
			dependencies.put("z", player.getZ());
			execute(dependencies);
			return InteractionResultHolder.pass(player.getItemInHand(hand));
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PissAndShitMod.LOGGER.warn("Failed to load dependency world for procedure IncreasePoopBar!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PissAndShitMod.LOGGER.warn("Failed to load dependency entity for procedure IncreasePoopBar!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double playerfoodlevelbeforeeat = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem().isEdible() || (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem().isEdible()) {
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("player_food_amount");
				if (_so == null)
					_so = _sc.addObjective("player_food_amount", ObjectiveCriteria.DUMMY, Component.literal("player_food_amount"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0);
			}
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 66) {
							if (new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("poop_amount", entity) <= 10 && new Object() {
								public int getScore(String score, Entity _ent) {
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective(score);
									if (_so != null)
										return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
									return 0;
								}
							}.getScore("player_food_amount", entity) < (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)) {
								{
									Entity _ent = entity;
									Scoreboard _sc = _ent.level().getScoreboard();
									Objective _so = _sc.getObjective("poop_amount");
									if (_so == null)
										_so = _sc.addObjective("poop_amount", ObjectiveCriteria.DUMMY, Component.literal("poop_amount"), ObjectiveCriteria.RenderType.INTEGER);
									_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) (new Object() {
										public int getScore(String score, Entity _ent) {
											Scoreboard _sc = _ent.level().getScoreboard();
											Objective _so = _sc.getObjective(score);
											if (_so != null)
												return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
											return 0;
										}
									}.getScore("player_food_amount", entity) + ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - new Object() {
										public int getScore(String score, Entity _ent) {
											Scoreboard _sc = _ent.level().getScoreboard();
											Objective _so = _sc.getObjective(score);
											if (_so != null)
												return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
											return 0;
										}
									}.getScore("player_food_amount", entity)) / 8));
								}
							}
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
