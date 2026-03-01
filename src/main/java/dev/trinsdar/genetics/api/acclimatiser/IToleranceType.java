package dev.trinsdar.genetics.api.acclimatiser;


import net.minecraft.world.item.ItemStack;

public interface IToleranceType {
	float getEffect(final ItemStack stack);

	default boolean hasEffect(final ItemStack stack) {
		return this.getEffect(stack) != 0.0f;
	}
}
