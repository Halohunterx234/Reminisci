package net.mcreator.reminisci.procedures;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class EndPendantItemInInventoryTickProcedure extends ReminisciModElements.ModElement {
	public EndPendantItemInInventoryTickProcedure(ReminisciModElements instance) {
		super(instance, 103);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure EndPendantItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.world.getDimensionKey()) == (World.THE_END))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 0.5));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 60, (int) 0.5));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 60, (int) 0.5));
			if ((entity.isSneaking())) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 10, (int) 0.5));
			}
		}
	}
}
