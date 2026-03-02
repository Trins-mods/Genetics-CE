package dev.trinsdar.core.api.genetics;

import dev.trinsdar.core.api.gui.IPoint;
import dev.trinsdar.core.api.gui.ITexture;
import forestry.api.genetics.alleles.IChromosome;

import java.util.Map;

public interface IFieldKitPlugin {
	Map<IChromosome<?>, IPoint> getChromosomePickerPositions();

	ITexture getTypeTexture();
}
