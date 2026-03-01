package dev.trinsdar.genetics.api.acclimatiser;


public interface IAcclimatiserManager {
	//void addTolerance(final IChromosomeType chromosome, final IToleranceType type);

	IToleranceType getTemperatureToleranceType();

	IToleranceType getHumidityToleranceType();
}
