package ageofingenuity.client;

import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import ageofingenuity.aoi;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class aoiClientHandler {
    public static OrientedOverlayRenderer CSTR_OVERLAY = new OrientedOverlayRenderer("ageofingenuity:machines/cstr");
    public static OrientedOverlayRenderer MILL_OVERLAY = new OrientedOverlayRenderer("ageofingenuity:machines/mill");
    public static OrientedOverlayRenderer MORTAR_GRINDER_OVERLAY = new OrientedOverlayRenderer("ageofingenuity:machines/mortar_grinder");
    public static OrientedOverlayRenderer ROASTER_OVERLAY = new OrientedOverlayRenderer("ageofingenuity:machines/roaster");

    private static SoundEvent registerSound(String soundNameIn) {
        ResourceLocation location = new ResourceLocation(aoi.MODID, soundNameIn);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}