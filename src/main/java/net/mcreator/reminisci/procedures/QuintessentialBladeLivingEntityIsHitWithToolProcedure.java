package net.mcreator.reminisci.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class QuintessentialBladeLivingEntityIsHitWithToolProcedure extends ReminisciModElements.ModElement {
	public QuintessentialBladeLivingEntityIsHitWithToolProcedure(ReminisciModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure QuintessentialBladeLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 2);
	}
}
