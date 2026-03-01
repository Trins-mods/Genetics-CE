package dev.trinsdar.genetics.api.analyst;

import dev.trinsdar.core.api.gui.IWidget;
import forestry.api.genetics.IIndividual;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IBiologyPlugin<T extends IIndividual> {
	@OnlyIn(Dist.CLIENT)
	int addBiologyPages(T individual, IWidget parent, int y, IAnalystManager analystManager);
}
