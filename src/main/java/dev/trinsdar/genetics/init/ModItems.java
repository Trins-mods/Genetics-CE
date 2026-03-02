package dev.trinsdar.genetics.init;

import dev.trinsdar.genetics.GeneticsCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, GeneticsCE.ID);

    public static final RegistryObject<Item> PUNNETT_SQUARE = ITEMS.register("punnett_square", () -> new Item(new Properties()));
    public static final RegistryObject<Item> SERUM = ITEMS.register("serum", () -> new Item(new Properties().durability(16)));
    public static final RegistryObject<Item> SERUM_ARRAY = ITEMS.register("serum_array", () -> new Item(new Properties().durability(16)));
    public static final RegistryObject<Item> GENE_DATABASE = ITEMS.register("gene_database", () -> new Item(new Properties().stacksTo(1)));
    public static final RegistryObject<Item> REINFORCED_CASING = ITEMS.register("reinforced_casing", () -> new Item(new Properties()));
    public static final RegistryObject<Item> DNA_DYE = ITEMS.register("dna_dye", () -> new Item(new Properties()));
    public static final RegistryObject<Item> FLUORESCENT_DYE = ITEMS.register("fluorescent_dye", () -> new Item(new Properties()));
    public static final RegistryObject<Item> ENZYME = ITEMS.register("enzyme", () -> new Item(new Properties()));
    public static final RegistryObject<Item> GROWTH_MEDIUM = ITEMS.register("growth_medium", () -> new Item(new Properties()));
    public static final RegistryObject<Item> BLANK_SEQUENCE = ITEMS.register("blank_sequence", () -> new Item(new Properties()));
    public static final RegistryObject<Item> EMPTY_SERUM_VIAL = ITEMS.register("empty_serum_vial", () -> new Item(new Properties()));
    public static final RegistryObject<Item> EMPTY_SERUM_ARRAY = ITEMS.register("empty_serum_array", () -> new Item(new Properties()));
    public static final RegistryObject<Item> INTEGRATED_CIRCUIT_BOARD = ITEMS.register("integrated_circuit_board", () -> new Item(new Properties()));
    public static final RegistryObject<Item> INTEGRATED_CPU = ITEMS.register("integrated_cpu", () -> new Item(new Properties()));
    public static final RegistryObject<Item> INTEGRATED_CASING = ITEMS.register("integrated_casing", () -> new Item(new Properties()));
    public static final RegistryObject<Item> SEQUENCE = ITEMS.register("sequence", () -> new Item(new Properties().durability(5)));


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
