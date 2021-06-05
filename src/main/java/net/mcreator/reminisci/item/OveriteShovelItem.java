
package net.mcreator.reminisci.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.reminisci.itemgroup.ReminisciItemGroup;
import net.mcreator.reminisci.ReminisciModElements;

@ReminisciModElements.ModElement.Tag
public class OveriteShovelItem extends ReminisciModElements.ModElement {
	@ObjectHolder("reminisci:overite_shovel")
	public static final Item block = null;
	public OveriteShovelItem(ReminisciModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1796;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ReminisciItemGroup.tab)) {
		}.setRegistryName("overite_shovel"));
	}
}
