package dev.trinsdar.genetics.api.analyst;

import dev.trinsdar.core.api.gui.IArea;
import dev.trinsdar.core.api.gui.ITitledWidget;
import dev.trinsdar.core.api.gui.IWidget;
import forestry.api.genetics.IIndividual;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidStack;

import java.util.Collection;

public interface IAnalystManager {
	void registerAnalystPagePlugin(IAnalystPagePlugin<?> analystPageFactory);

	<T extends IIndividual> IAnalystPagePlugin<T> getAnalystPagePlugin(T individual);

	void registerProducePlugin(IProducePlugin producePlugin);

	Collection<IProducePlugin> getProducePlugins();

	NonNullList<ItemStack> getAllProducts(ItemStack key);

	NonNullList<FluidStack> getAllFluidsFromItems(Collection<ItemStack> itemStacks);

	NonNullList<FluidStack> getAllFluidsFromFluids(Collection<FluidStack> fluidStacks);

	Collection<ItemStack> getAllProductsAndFluids(Collection<ItemStack> collection);

	@OnlyIn(Dist.CLIENT)
	IAnalystIcons getIcons();

	@OnlyIn(Dist.CLIENT)
	<T extends IIndividual> ITitledWidget createClimatePage(IWidget parent, IArea area, T ind, IClimatePlugin<T> plugin);

	@OnlyIn(Dist.CLIENT)
	<T extends IIndividual> ITitledWidget createBiologyPage(IWidget parent, IArea area, T ind, IBiologyPlugin<T> plugin);

	@OnlyIn(Dist.CLIENT)
	<T extends IIndividual> ITitledWidget createBehaviorPage(IWidget parent, IArea area, T ind, IBehaviourPlugin<T> behaviourPlugin);

	@OnlyIn(Dist.CLIENT)
	int drawRefined(IWidget parent, String string, int y, Collection<ItemStack> products);
}
