package dev.trinsdar.genetics.api;

import com.mojang.authlib.GameProfile;
import dev.trinsdar.core.api.genetics.IBreedingSystem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Collection;
import java.util.Set;

public interface ITreeBreedingSystem extends IBreedingSystem {
	Collection<IAlleleSpecies> getTreesThatBearFruit(ItemStack fruit, boolean master, Level world, GameProfile player);

	Collection<IAlleleSpecies> getTreesThatCanBearFruit(ItemStack fruit, boolean master, Level world, GameProfile player);

	Collection<IAlleleSpecies> getTreesThatHaveWood(ItemStack wood, boolean master, Level world, GameProfile player);

	Set<ItemStack> getAllFruits();

	Set<ItemStack> getAllWoods();
}
