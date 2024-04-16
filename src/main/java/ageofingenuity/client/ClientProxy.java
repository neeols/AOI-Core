package ageofingenuity.client;

import ageofingenuity.api.block.registry.AOIMetaBlocks;
import ageofingenuity.api.item.registry.AOIItems;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import gregtech.api.util.LocalizationUtils;
import gregtechfoodoption.CommonProxy;
import gregtechfoodoption.GregTechFoodOption;
import gregtechfoodoption.block.GTFOMetaBlocks;
import gregtechfoodoption.entity.GTFOEntities;
import gregtechfoodoption.integration.appleskin.GTFOMetaHUDOverlay;
import gregtechfoodoption.integration.appleskin.GTFOMetaTooltipOverlay;
import gregtechfoodoption.potion.AntiSchizoPotion;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static ageofingenuity.Tags.MODID;

import javax.annotation.Nonnull;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MODID)
@SideOnly(Side.CLIENT)
@SuppressWarnings("unused")
public class ClientProxy {

    public static void earlyPreInit() {
        //LabsTextures.preInit();
    }

    public static void latePreInit() {
        //if (Loader.isModLoaded(LabsValues.BQU_MODID))
           // LabsTierHelper.preInit();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        AOIItems.registerModels();
        AOIMetaBlocks.registerModels();
    }

    //@SubscribeEvent
    //public static void registerFluidModels(TextureStitchEvent.Pre event) {
    //    LabsFluids.registerFluidModels(event);
    //}

    //@SubscribeEvent
    //public static void addTooltipNormal(ItemTooltipEvent event) {
    //    TooltipAdder.addTooltipNormal(event.getToolTip(), event.getItemStack());
    //}
}