
package net.mcreator.reminisci.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.reminisci.procedures.QuintessentialBladeLivingEntityIsHitWithToolProcedure;
import net.mcreator.reminisci.procedures.QuintessentialBladeEntitySwingsItemProcedure;
import net.mcreator.reminisci.itemgroup.ReminisciItemGroup;
import net.mcreator.reminisci.ReminisciModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ReminisciModElements.ModElement.Tag
public class QuintessentialBladeItem extends ReminisciModElements.ModElement {
	@ObjectHolder("reminisci:quintessential_blade")
	public static final Item block = null;
	public QuintessentialBladeItem(ReminisciModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 5.5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ReminisciItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Harnesses the power of the earth and hell"));
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					QuintessentialBladeLivingEntityIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
				boolean retval = super.onEntitySwing(itemstack, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					QuintessentialBladeEntitySwingsItemProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("quintessential_blade"));
	}
}
