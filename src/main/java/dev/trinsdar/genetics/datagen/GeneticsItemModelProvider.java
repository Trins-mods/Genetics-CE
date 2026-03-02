package dev.trinsdar.genetics.datagen;

import dev.trinsdar.genetics.GeneticsCE;
import dev.trinsdar.genetics.init.GeneticsItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
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
        basicItem(GeneticsItems.PUNNETT_SQUARE.get());
        this.getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(GeneticsItems.SERUM.get())).toString()).parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(GeneticsCE.ID, "item/serum_glass"))
                .texture("layer1", new ResourceLocation(GeneticsCE.ID, "item/serum_cap"))
                .texture("layer2", new ResourceLocation(GeneticsCE.ID, "item/serum_edges"))
                .texture("layer3", new ResourceLocation(GeneticsCE.ID, "item/serum_dna"));
        this.getBuilder(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(GeneticsItems.SERUM_ARRAY.get())).toString()).parent(new UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(GeneticsCE.ID, "item/serum_array_glass"))
                .texture("layer1", new ResourceLocation(GeneticsCE.ID, "item/serum_array_cap"))
                .texture("layer2", new ResourceLocation(GeneticsCE.ID, "item/serum_array_edges"))
                .texture("layer3", new ResourceLocation(GeneticsCE.ID, "item/serum_array_dna"));
        basicItem(GeneticsItems.GENE_DATABASE.get());
        basicItem(GeneticsItems.REINFORCED_CASING.get());
        basicItem(GeneticsItems.DNA_DYE.get());
        basicItem(GeneticsItems.FLUORESCENT_DYE.get());
        basicItem(GeneticsItems.ENZYME.get());
        basicItem(GeneticsItems.GROWTH_MEDIUM.get());
        basicItem(GeneticsItems.BLANK_SEQUENCE.get());
        basicItem(GeneticsItems.EMPTY_SERUM_VIAL.get());
        basicItem(GeneticsItems.EMPTY_SERUM_ARRAY.get());
        basicItem(GeneticsItems.INTEGRATED_CIRCUIT_BOARD.get());
        basicItem(GeneticsItems.INTEGRATED_CPU.get());
        basicItem(GeneticsItems.INTEGRATED_CASING.get());
        basicItem(GeneticsItems.SEQUENCE.get());

    }
}
