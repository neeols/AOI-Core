package ageofingenuity.api;

import ageofingenuity.util.AOINames;
import gregtech.api.gui.resources.TextureArea;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;

public class AOITextures {
    /* Overlays (Machine) */
    //public static OrientedOverlayRenderer GREENHOUSE_OVERLAY;

    /* Overlays (Casings) */
    public static SimpleOverlayRenderer REFRACTORY_CEMENT_BRICKS;


    /* Recipe Map Textures */
    //public static TextureArea PROGRESS_BAR_ROCKET;

    public static void preInit() {
        //GREENHOUSE_OVERLAY = new OrientedOverlayRenderer("nomilabs:multiblock/greenhouse");
        REFRACTORY_CEMENT_BRICKS = new SimpleOverlayRenderer("ageofingenuity:refractorycementbricks");
        //PROGRESS_BAR_ROCKET = labsFullImage("textures/gui/progress_bar/progress_bar_rocket.png");
    }

    /**
     * Like the one in TextureArea, but with Labs Registry.
     */
    public static TextureArea labsFullImage(String imageLocation) {
        return new TextureArea(AOINames.makeAOIName(imageLocation), 0.0, 0.0, 1.0, 1.0);
    }
}
