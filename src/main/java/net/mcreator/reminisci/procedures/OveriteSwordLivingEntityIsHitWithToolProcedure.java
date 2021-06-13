package net.mcreator.reminisci.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class OveriteSwordLivingEntityIsHitWithToolProcedure extends ReminisciModElements.ModElement {
	public OveriteSwordLivingEntityIsHitWithToolProcedure(ReminisciModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ReminisciMod.LOGGER.warn("Failed to load dependency entity for procedure OveriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ReminisciMod.LOGGER.warn("Failed to load dependency x for procedure OveriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ReminisciMod.LOGGER.warn("Failed to load dependency y for procedure OveriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ReminisciMod.LOGGER.warn("Failed to load dependency z for procedure OveriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ReminisciMod.LOGGER.warn("Failed to load dependency world for procedure OveriteSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World) {
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z)) || BoneMealItem
					.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) z), (Direction) null)) {
				if (!world.isRemote())
					((World) world).playEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
			}
		}
		if (world instanceof World) {
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) (x + 1), (int) y, (int) z))
					|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) (x + 1), (int) y, (int) z),
							(Direction) null)) {
				if (!world.isRemote())
					((World) world).playEvent(2005, new BlockPos((int) (x + 1), (int) y, (int) z), 0);
			}
		}
		if (world instanceof World) {
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) (x + (-1)), (int) y, (int) z))
					|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) (x + (-1)), (int) y, (int) z),
							(Direction) null)) {
				if (!world.isRemote())
					((World) world).playEvent(2005, new BlockPos((int) (x + (-1)), (int) y, (int) z), 0);
			}
		}
		if (world instanceof World) {
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) (z + (-1))))
					|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) (z + (-1))),
							(Direction) null)) {
				if (!world.isRemote())
					((World) world).playEvent(2005, new BlockPos((int) x, (int) y, (int) (z + (-1))), 0);
			}
		}
		if (world instanceof World) {
			if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) (z + 1)))
					|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos((int) x, (int) y, (int) (z + 1)),
							(Direction) null)) {
				if (!world.isRemote())
					((World) world).playEvent(2005, new BlockPos((int) x, (int) y, (int) (z + 1)), 0);
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"effect give @e[distance=..20,type=!player] minecraft:weakness 5 1 true");
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 100, (int) 0.5));
	}
}
