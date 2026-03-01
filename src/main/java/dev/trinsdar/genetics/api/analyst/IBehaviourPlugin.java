package dev.trinsdar.genetics.api.analyst;

import dev.trinsdar.core.api.gui.IWidget;
import forestry.api.genetics.IIndividual;

public interface IBehaviourPlugin<T extends IIndividual> {
	int addBehaviourPages(T individual, IWidget parent, int y);
}
