
package net.mcreator.reminisci.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.reminisci.itemgroup.ReminisciItemGroup;
import net.mcreator.reminisci.ReminisciModElements;

@ReminisciModElements.ModElement.Tag
public class OveritePickaxeItem extends ReminisciModElements.ModElement {
	@ObjectHolder("reminisci:overite_pickaxe")
	public static final Item block = null;
	public OveritePickaxeItem(ReminisciModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1796;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 3.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ReminisciItemGroup.tab)) {
		}.setRegistryName("overite_pickaxe"));
	}
}
