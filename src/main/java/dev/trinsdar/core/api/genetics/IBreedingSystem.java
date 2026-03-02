package dev.trinsdar.core.api.genetics;

import com.mojang.authlib.GameProfile;
import forestry.api.core.ForestryEvent;
import forestry.api.genetics.IBreedingTracker;
import forestry.api.genetics.IIndividual;
import forestry.api.genetics.IMutation;
import forestry.api.genetics.ISpeciesType;
import forestry.api.genetics.ITaxon;
import forestry.api.genetics.alleles.IAllele;
import forestry.api.genetics.alleles.IChromosome;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public interface IBreedingSystem {
	ISpeciesType<?,?> getSpeciesRoot();

	//Collection<IAlleleSpecies> getAllSpecies();

	//Collection<IAlleleSpecies> getDiscoveredSpecies(Level world, GameProfile player);

	List<ITaxon> getAllBranches();

	Collection<ITaxon> getDiscoveredBranches(Level world, GameProfile player);

	List<IMutation<?>> getDiscoveredMutations(Level world, GameProfile player);

	//List<IMutation<?>> getResultantMutations(final IAlleleSpecies species);

	//List<IMutation<?>> getFurtherMutations(final IAlleleSpecies species);

	boolean isMutationDiscovered(IMutation mutation, Level world, GameProfile name);

	//float getChance(IMutation mutation, Player player, IAlleleSpecies firstSpecies, IAlleleSpecies secondSpecies);

	String getAlleleName(final IChromosome<?> chromosome, final IAllele allele);

	String getChromosomeName(final IChromosome<?> chromo);

	String getChromosomeShortName(final IChromosome<?> chromo);

	@Nullable
	IIndividual getConversion(final ItemStack stack);

	ItemStack getConversionStack(final ItemStack stack);

	@Nullable
	IIndividual getIndividual(String uid);

	void calculateArrays();

	//void addExtraAlleles(final IChromosomeType p0, final TreeSet<IAllele> p1);

	String getDescriptor();

	String getIdent();

	ItemStack getItemStackRepresentitive();

	int getColour();

	int getDiscoveredSpeciesCount();

	int getTotalSpeciesCount();

	float getDiscoveredSpeciesPercentage();

	int getTotalSecretCount();

	int getDiscoveredSecretCount();

	float getDiscoveredBranchPercentage();

	int getTotalBranchCount();

	int getDiscoveredBranchCount();

	String getEpitome();

	String getEpitome(float discoveredPercentage);

	Collection<IMutation> getAllMutations();

	void calculateAlleles(ISpeciesType<?,?> speciesRoot);

	void calculateBranches(ISpeciesType<?,?> speciesRoot);

	void calculateMutations(ISpeciesType<?,?> speciesRoot);

	boolean isBlacklisted(IAllele allele);

	boolean isMutationDiscovered(IMutation<?> mutation, IBreedingTracker tracker);

	//boolean isSpeciesDiscovered(IAlleleSpecies species, Level world, GameProfile name);

	//boolean isSpeciesDiscovered(IAlleleSpecies species, IBreedingTracker tracker);

	//boolean isSecret(IAlleleSpecies species);

	boolean isSecret(ITaxon branch);

	Collection<ITaxon> getDiscoveredBranches(IBreedingTracker tracker);

	//Collection<IAlleleSpecies> getDiscoveredSpecies(IBreedingTracker tracker);

	@SideOnly(Side.CLIENT)
	TextureAtlasSprite getUndiscoveredIcon();

	@SideOnly(Side.CLIENT)
	TextureAtlasSprite getDiscoveredIcon();

	Class<? extends IBreedingTracker> getTrackerClass();

	@SubscribeEvent
	void onSyncBreedingTracker(ForestryEvent.SyncedBreedingTracker event);

	void syncTracker(IBreedingTracker tracker);

	void onSyncBreedingTracker(IBreedingTracker tracker);

	String getName();

	boolean isDNAManipulable(ItemStack stack);

	boolean isDNAManipulable(ISpeciesType<?, ?> type);

	IIndividual getDefaultIndividual();

	ISpeciesType<?,?> getDefaultType();

	ISpeciesType<?,?>[] getActiveTypes();

	//Collection<IChromosomeType> getActiveKaryotype();

	ItemStack getDefaultMember(String uid);

	IFieldKitPlugin getFieldKitPlugin();
}
