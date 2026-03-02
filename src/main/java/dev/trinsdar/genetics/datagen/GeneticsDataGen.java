package dev.trinsdar.genetics.datagen;

import dev.trinsdar.genetics.GeneticsCE;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = GeneticsCE.ID)
public class GeneticsDataGen {

    @SubscribeEvent
    public static void onDataGatherEvent(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        gen.addProvider(true, new GeneticsItemModelProvider(gen.getPackOutput(), event.getExistingFileHelper()));
    }
}
