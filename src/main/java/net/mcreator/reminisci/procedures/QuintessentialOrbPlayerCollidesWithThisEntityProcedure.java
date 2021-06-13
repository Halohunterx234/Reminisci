package net.mcreator.reminisci.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class QuintessentialOrbPlayerCollidesWithThisEntityProcedure extends ReminisciModElements.ModElement {
	public QuintessentialOrbPlayerCollidesWithThisEntityProcedure(ReminisciModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure QuintessentialOrbPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
					.attackEntityFrom(new DamageSource("lightshield").setDamageBypassesArmor(), (float) 2);
		}
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)
			((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
					.addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 10, (int) 2));
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)
			((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
					.addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 2));
	}
}
