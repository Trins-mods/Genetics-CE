package dev.trinsdar.genetics.api.acclimatiser;


import forestry.api.genetics.alleles.IChromosome;

public interface IAcclimatiserManager {
	void addTolerance(final IChromosome<?> chromosome, final IToleranceType type);

	IToleranceType getTemperatureToleranceType();

	IToleranceType getHumidityToleranceType();
}
