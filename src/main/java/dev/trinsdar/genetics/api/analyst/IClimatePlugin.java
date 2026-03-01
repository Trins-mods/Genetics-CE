package dev.trinsdar.genetics.api.analyst;

import forestry.api.genetics.IIndividual;

public interface IClimatePlugin<T extends IIndividual> {
	//EnumTolerance getTemperatureTolerance(T individual);

	//EnumTolerance getHumidityTolerance(T individual);

	boolean showHumiditySection();
}
