package ageofingenuity;

import gregtech.api.unification.material.MarkerMaterials.*;
import gregtech.api.unification.material.Material;
import net.minecraft.util.ResourceLocation;
import static ageofingenuity.Tags.MODID;

public class AOIValues {
    public static Material[] TierMaterials = new Material[] { Tier.ULV, Tier.LV, Tier.MV, Tier.HV, Tier.EV, Tier.IV, Tier.LuV, Tier.ZPM, Tier.UV, Tier.UHV, Tier.UEV, Tier.UIV, Tier.UXV, Tier.OpV, Tier.MAX };
    public static ResourceLocation resLoc(String name) {
        return new ResourceLocation(MODID, name);
    }
}