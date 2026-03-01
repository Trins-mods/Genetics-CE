package dev.trinsdar.core.api.gui;


import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface IGuiItem {
	void openGuiOnRightClick(ItemStack itemStack, Level world, Player player);
}
