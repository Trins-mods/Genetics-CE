package dev.trinsdar.core.api.genetics;

import dev.trinsdar.core.api.gui.IPoint;
import dev.trinsdar.core.api.gui.ITexture;

import java.util.Map;

public interface IFieldKitPlugin {
	//Map<IChromosomeType, IPoint> getChromosomePickerPositions();

	ITexture getTypeTexture();
}
