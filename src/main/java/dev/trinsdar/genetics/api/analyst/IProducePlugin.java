package dev.trinsdar.genetics.api.analyst;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public interface IProducePlugin {
	void getFluids(ItemStack inputStack, NonNullList<FluidStack> outputFluids);

	void getFluids(FluidStack inputFluid, NonNullList<FluidStack> outputFluids);

	void getItems(ItemStack inputStack, NonNullList<ItemStack> outputItems);
}
