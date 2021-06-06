package net.mcreator.reminisci.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class DwagonScytheLivingEntityIsHitWithToolProcedure extends ReminisciModElements.ModElement {
	public DwagonScytheLivingEntityIsHitWithToolProcedure(ReminisciModElements instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure DwagonScytheLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("chaos.damage").setDamageBypassesArmor(), (float) 1);
		}
	}
}
