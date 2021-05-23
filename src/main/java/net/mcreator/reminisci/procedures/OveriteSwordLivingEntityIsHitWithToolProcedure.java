package net.mcreator.reminisci.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;

import net.mcreator.reminisci.ReminisciModElements;
import net.mcreator.reminisci.ReminisciMod;

import java.util.Map;

@ReminisciModElements.ModElement.Tag
public class OveriteSwordLivingEntityIsHitWithToolProcedure extends ReminisciModElements.ModElement {
	public OveriteSwordLivingEntityIsHitWithToolProcedure(ReminisciModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
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
	}
}
