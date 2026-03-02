package dev.trinsdar.genetics.init;

import dev.trinsdar.genetics.GeneticsCE;
import forestry.core.tab.ForestryCreativeTabs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GeneticsCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GeneticsCE.ID);

    public static final RegistryObject<CreativeModeTab> GENETICS = CREATIVE_TABS.register("genetics", () -> CreativeModeTab.builder()
            .title(Component.translatable("genetics.tab.genetics"))
            .withTabsBefore(ForestryCreativeTabs.FORESTRY.getKey()).icon(() -> new ItemStack(GeneticsItems.EMPTY_SERUM_VIAL.get()))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(GeneticsItems.SERUM.get());
                output.accept(GeneticsItems.SERUM_ARRAY.get());
                output.accept(GeneticsItems.GENE_DATABASE.get());
                output.accept(GeneticsItems.REINFORCED_CASING.get());
                output.accept(GeneticsItems.DNA_DYE.get());
                output.accept(GeneticsItems.FLUORESCENT_DYE.get());
                output.accept(GeneticsItems.ENZYME.get());
                output.accept(GeneticsItems.GROWTH_MEDIUM.get());
                output.accept(GeneticsItems.BLANK_SEQUENCE.get());
                output.accept(GeneticsItems.EMPTY_SERUM_VIAL.get());
                output.accept(GeneticsItems.EMPTY_SERUM_ARRAY.get());
                output.accept(GeneticsItems.INTEGRATED_CIRCUIT_BOARD.get());
                output.accept(GeneticsItems.INTEGRATED_CPU.get());
                output.accept(GeneticsItems.INTEGRATED_CASING.get());
                output.accept(GeneticsItems.SEQUENCE.get());
            }).build());

    public static void init(){
        CREATIVE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
