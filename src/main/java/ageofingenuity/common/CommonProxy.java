package ageofingenuity.common;

import ageofingenuity.api.recipes.AOIRecipeHandler;
import com.cleanroommc.groovyscript.event.GsHandEvent;
import ageofingenuity.AOIValues;
import ageofingenuity.api.block.registry.AOIBlocks;
import ageofingenuity.api.creativetab.registry.AOICreativeTabs;
import ageofingenuity.api.block.registry.AOIMetaBlocks;
import ageofingenuity.api.materials.AOIMaterials;
import ageofingenuity.common.metatileentities.AOIMetaTileEntities;
import ageofingenuity.api.recipes.AOIRecipeMaps;
import ageofingenuity.api.item.registry.AOIItems;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import gregtech.api.unification.material.event.PostMaterialEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.MissingMappings;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.registries.IForgeRegistry;
import static ageofingenuity.Tags.MODID;

@Mod.EventBusSubscriber(modid = MODID)
@SuppressWarnings("unused")
public class CommonProxy {
    public static void preInit() {
        AOICreativeTabs.preInit();

        AOIItems.preInit();
        AOIBlocks.preInit();
        AOIMetaBlocks.preInit();

        AOIMetaTileEntities.init();
    }

    public static void loadComplete() {
//        FluidRegistryMixinHelper.loadComplete();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        AOIItems.register(registry);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        AOIBlocks.register(registry);
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(MaterialEvent event) {

    }

    @SubscribeEvent
    public static void materialChanges(PostMaterialEvent event) {
        AOIMaterials.materialChanges();
    }

    @SubscribeEvent
    public static void createMaterialRegistry(MaterialRegistryEvent event) {
        GregTechAPI.materialManager.createRegistry(MODID);
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        AOIRecipeHandler.init();
    }

    @SubscribeEvent
    public static void onEquipmentChangeEvent(LivingEquipmentChangeEvent event) {
//        ItemExcitationCoil.onEquipmentChange(event);
    }

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(MODID))
            ConfigManager.sync(MODID, Config.Type.INSTANCE);
    }

    @SubscribeEvent
    public static void missingItemMappings(MissingMappings<Item> event) {
//        LabsRemappers.remapAndIgnoreEntries(event, Remapper.RemapTypes.ITEM);
    }

    @SubscribeEvent
    public static void missingBlockMappings(MissingMappings<Block> event) {
//        LabsRemappers.remapAndIgnoreEntries(event, Remapper.RemapTypes.BLOCK);
    }

    @SubscribeEvent
    public static void missingEntityMappings(MissingMappings<EntityEntry> event) {
//        LabsRemappers.remapAndIgnoreEntries(event, Remapper.RemapTypes.ENTITY);
    }

    @SubscribeEvent
    public static void missingBiomeMappings(MissingMappings<Biome> event) {
//       LabsRemappers.remapAndIgnoreEntries(event, Remapper.RemapTypes.BIOME);
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void gsHandAdditions(GsHandEvent event) {
//        GroovyScriptHandManager.addToHand(event);
    }
}