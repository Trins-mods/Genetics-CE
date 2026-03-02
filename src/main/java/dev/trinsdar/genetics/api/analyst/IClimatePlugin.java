package dev.trinsdar.genetics.api.analyst;

import forestry.api.core.ToleranceType;
import forestry.api.genetics.IIndividual;

public interface IClimatePlugin<T extends IIndividual> {
	ToleranceType getTemperatureTolerance(T individual);

	ToleranceType getHumidityTolerance(T individual);

	boolean showHumiditySection();
}
