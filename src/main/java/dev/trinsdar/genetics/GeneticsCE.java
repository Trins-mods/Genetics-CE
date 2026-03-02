package dev.trinsdar.genetics;

import dev.trinsdar.genetics.init.GeneticsCreativeTabs;
import dev.trinsdar.genetics.init.GeneticsItems;
import net.minecraftforge.fml.common.Mod;

@Mod(GeneticsCE.ID)
public class GeneticsCE {
    public static final String ID = "genetics";

    public GeneticsCE(){
        GeneticsItems.init();
        GeneticsCreativeTabs.init();
    }
}
