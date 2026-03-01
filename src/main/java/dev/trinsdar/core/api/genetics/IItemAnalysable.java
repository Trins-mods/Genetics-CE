package dev.trinsdar.core.api.genetics;


import net.minecraft.world.item.ItemStack;

public interface IItemAnalysable {
	boolean isAnalysed(ItemStack stack);

	ItemStack analyse(ItemStack stack);

	@Deprecated
	float getAnalyseTimeMult(ItemStack stack);
}
