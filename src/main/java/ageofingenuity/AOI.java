package ageofingenuity;

import ageofingenuity.api.block.registry.AOIMetaBlocks;
import ageofingenuity.api.materials.init.RegisterOreDicts;
import ageofingenuity.common.metatileentities.AOIMetaTileEntities;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import gregtech.GTInternalTags;
import ageofingenuity.client.ClientProxy;
import ageofingenuity.common.CommonProxy;
import ageofingenuity.util.AOISide;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]",  dependencies = GTInternalTags.DEP_VERSION_STRING)
public class AOI {

    public static final String MODID = "ageofingenuity";
    public static final String NAME = "Age Of Ingenuity";
    public static final String VERSION = "@VERSION@";
    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);

        AOIMetaBlocks.preInit();
        AOIMetaTileEntities.init();

        if (AOISide.isClient())
            ClientProxy.earlyPreInit();

        CommonProxy.preInit();

        if (AOISide.isClient())
            ClientProxy.latePreInit();
    }

    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        CommonProxy.loadComplete();
    }

    @EventHandler
    public void serverStopped(FMLServerStoppedEvent event) {
//        DataFixerHandler.close();
    }

    static {
        FluidRegistry.enableUniversalBucket();
    }
}
