
package net.mcreator.reminisci.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.reminisci.item.GoldenCoalItem;
import net.mcreator.reminisci.ReminisciModElements;

@ReminisciModElements.ModElement.Tag
public class GoldenCoalFuelFuel extends ReminisciModElements.ModElement {
	public GoldenCoalFuelFuel(ReminisciModElements instance) {
		super(instance, 4);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(GoldenCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(10600);
	}
}
