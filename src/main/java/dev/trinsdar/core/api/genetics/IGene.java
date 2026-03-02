package dev.trinsdar.core.api.genetics;

import forestry.api.core.INbtReadable;
import forestry.api.core.INbtWritable;
import forestry.api.genetics.ISpeciesType;
import forestry.api.genetics.alleles.IAllele;
import forestry.api.genetics.alleles.IChromosome;
import net.minecraft.nbt.CompoundTag;

public interface IGene extends INbtReadable, INbtWritable {
	IChromosome<?> getChromosome();

	String getName();

	ISpeciesType<?,?> getSpeciesRoot();

	IAllele getAllele();

	CompoundTag getNBTTagCompound();
}
