
package net.mcreator.reminisci.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.reminisci.itemgroup.ReminisciItemGroup;
import net.mcreator.reminisci.ReminisciModElements;

@ReminisciModElements.ModElement.Tag
public class OveriteHoeItem extends ReminisciModElements.ModElement {
	@ObjectHolder("reminisci:overite_hoe")
	public static final Item block = null;
	public OveriteHoeItem(ReminisciModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1796;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
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
		}, 0, -3f, new Item.Properties().group(ReminisciItemGroup.tab)) {
		}.setRegistryName("overite_hoe"));
	}
}
