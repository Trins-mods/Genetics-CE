package dev.trinsdar.genetics;

import dev.trinsdar.genetics.init.ModItems;
import net.minecraftforge.fml.common.Mod;

@Mod(GeneticsCE.ID)
public class GeneticsCE {
    public static final String ID = "genetics";

    public GeneticsCE(){
        ModItems.init();
    }
}
