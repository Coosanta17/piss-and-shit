
package net.mcreator.coosanta.pissandshit.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.coosanta.pissandshit.init.PissAndShitModTabs;

import java.util.List;

public class DriedShitBrickItem extends Item {
	public DriedShitBrickItem() {
		super(new Item.Properties().tab(PissAndShitModTabs.TAB_PISS_AND_SHIT_ITEMS_AND_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A brick of dried shit"));
		list.add(Component.literal("you can use it to throw at people"));
		list.add(Component.literal("used to craft block of dried shit"));
	}
}
