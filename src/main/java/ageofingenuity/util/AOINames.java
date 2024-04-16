package ageofingenuity.util;

import static ageofingenuity.Tags.MODID;
import net.minecraft.util.ResourceLocation;

public class AOINames {
    public static ResourceLocation makeAOIName(String name) {
        return new ResourceLocation(MODID, name);
    }
}
