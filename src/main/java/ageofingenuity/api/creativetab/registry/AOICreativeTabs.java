package ageofingenuity.api.creativetab.registry;

import ageofingenuity.AOIValues;
import ageofingenuity.api.creativetab.BaseCreativeTab;
import ageofingenuity.api.item.registry.AOIItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

import static ageofingenuity.Tags.MODID;

public class AOICreativeTabs {
    public static CreativeTabs TAB_AOI;

    public static void preInit() {
        TAB_AOI = new BaseCreativeTab(MODID + ".main", () -> Items.BEETROOT_SOUP, true);
    }
}
