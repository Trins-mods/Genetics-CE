package dev.trinsdar.genetics.api;

import dev.trinsdar.core.api.genetics.IGene;
import dev.trinsdar.genetics.api.IItemChargeable;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public interface IItemSerum extends IItemChargeable {
	IGene[] getGenes(ItemStack stack);

	@Nullable
    IGene getGene(ItemStack stack, int chromosome);

	ItemStack addGene(ItemStack stack, IGene gene);
}
