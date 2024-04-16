package ageofingenuity.api.item.registry.register;
import ageofingenuity.api.item.ItemBase;
import ageofingenuity.api.creativetab.registry.AOICreativeTabs;

import net.minecraft.item.EnumRarity;

import static ageofingenuity.util.AOINames.*;
import static ageofingenuity.Tags.MODID;
import static ageofingenuity.api.item.registry.AOIItems.*;

public class MainItems {
    public static void init() {
        COKECLAYMIXTURE = createItem(new ItemBase(makeAOIName("cokeclaymixture"), AOICreativeTabs.TAB_AOI));
        MOTOR_STEAM = createItem(new ItemBase(makeAOIName("steammotor"), AOICreativeTabs.TAB_AOI));
        PISTON_STEAM = createItem(new ItemBase(makeAOIName("steampiston"), AOICreativeTabs.TAB_AOI));
    }
}
