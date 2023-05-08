package net.mcreator.coosanta.pissandshit.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.Entity;

import net.mcreator.coosanta.pissandshit.PissAndShitMod;

import java.util.Map;

public class PoopBarCondition9Procedure {

	public static boolean execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PissAndShitMod.LOGGER.warn("Failed to load dependency entity for procedure PoopBarCondition9!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("poop_amount", entity) >= 9) {
			return true;
		}
		return false;
	}
}
