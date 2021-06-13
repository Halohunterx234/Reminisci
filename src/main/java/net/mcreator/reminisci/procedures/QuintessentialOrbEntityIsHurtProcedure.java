package net.mcreator.reminisci.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class QuintessentialOrbEntityIsHurtProcedure extends ReminisciModElements.ModElement {
	public QuintessentialOrbEntityIsHurtProcedure(ReminisciModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure QuintessentialOrbEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHealth()
				: -1) > (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 2))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 3));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 30, (int) 1));
		} else if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHealth()
				: -1) < (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 3))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 30, (int) 200));
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/effect give @e[type=player,distance=..20] minecraft:slowness 2 200 true");
				}
			}
		}
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getHealth()
				: -1) < (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 5))) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/tp @e[type=player,distance=..20] ^ ^5 ^");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"/effect give @e[type=player,distance=..20] minecraft:slow_falling 5 1 true");
				}
			}
		}
	}
}
