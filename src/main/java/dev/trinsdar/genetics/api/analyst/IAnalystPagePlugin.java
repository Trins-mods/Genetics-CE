package dev.trinsdar.genetics.api.analyst;

import dev.trinsdar.core.api.gui.IArea;
import dev.trinsdar.core.api.gui.ITitledWidget;
import dev.trinsdar.core.api.gui.IWidget;
import forestry.api.genetics.IIndividual;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public interface IAnalystPagePlugin<T extends IIndividual> {
	boolean handles(IIndividual individual);

	@OnlyIn(Dist.CLIENT)
	void addAnalystPages(T individual, IWidget parent, IArea pageSize, List<ITitledWidget> analystPages, IAnalystManager analystManager);
}
