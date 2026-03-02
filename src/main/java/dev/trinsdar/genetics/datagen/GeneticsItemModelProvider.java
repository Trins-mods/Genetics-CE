package dev.trinsdar.genetics.datagen;

import dev.trinsdar.genetics.GeneticsCE;
import dev.trinsdar.genetics.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class GeneticsItemModelProvider extends ItemModelProvider {
    public GeneticsItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GeneticsCE.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.PUNNETT_SQUARE.get());
        this.getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(ModItems.SERUM.get())).toString()).parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(GeneticsCE.ID, "item/serum_glass"))
                .texture("layer1", new ResourceLocation(GeneticsCE.ID, "item/serum_cap"))
                .texture("layer2", new ResourceLocation(GeneticsCE.ID, "item/serum_edges"))
                .texture("layer3", new ResourceLocation(GeneticsCE.ID, "item/serum_dna"));
        this.getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(ModItems.SERUM_ARRAY.get())).toString()).parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(GeneticsCE.ID, "item/serum_array_glass"))
                .texture("layer1", new ResourceLocation(GeneticsCE.ID, "item/serum_array_cap"))
                .texture("layer2", new ResourceLocation(GeneticsCE.ID, "item/serum_array_edges"))
                .texture("layer3", new ResourceLocation(GeneticsCE.ID, "item/serum_array_dna"));
        basicItem(ModItems.GENE_DATABASE.get());
        basicItem(ModItems.REINFORCED_CASING.get());
        basicItem(ModItems.DNA_DYE.get());
        basicItem(ModItems.FLUORESCENT_DYE.get());
        basicItem(ModItems.ENZYME.get());
        basicItem(ModItems.GROWTH_MEDIUM.get());
        basicItem(ModItems.BLANK_SEQUENCE.get());
        basicItem(ModItems.EMPTY_SERUM_VIAL.get());
        basicItem(ModItems.EMPTY_SERUM_ARRAY.get());
        basicItem(ModItems.INTEGRATED_CIRCUIT_BOARD.get());
        basicItem(ModItems.INTEGRATED_CPU.get());
        basicItem(ModItems.INTEGRATED_CASING.get());
        basicItem(ModItems.SEQUENCE.get());

    }
}
