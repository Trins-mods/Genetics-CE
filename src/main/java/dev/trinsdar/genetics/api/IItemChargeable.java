package dev.trinsdar.genetics.api;

import forestry.api.genetics.ISpeciesType;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public interface IItemChargeable {
	int getCharges(ItemStack stack);

	int getMaxCharges(ItemStack stack);

	@Nullable
    ISpeciesType<?, ?> getSpeciesRoot(ItemStack stack);
}
