
package net.mcreator.reminisci.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;

import net.mcreator.reminisci.procedures.QuintessentialPickaxeToolInHandTickProcedure;
import net.mcreator.reminisci.itemgroup.ReminisciItemGroup;
import net.mcreator.reminisci.ReminisciModElements;

import java.util.Map;
import java.util.HashMap;

@ReminisciModElements.ModElement.Tag
public class QuintessentialPickaxeItem extends ReminisciModElements.ModElement {
	@ObjectHolder("reminisci:quintessential_pickaxe")
	public static final Item block = null;
	public QuintessentialPickaxeItem(ReminisciModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 3.5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.5f, new Item.Properties().group(ReminisciItemGroup.tab)) {
			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					QuintessentialPickaxeToolInHandTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("quintessential_pickaxe"));
	}
}
