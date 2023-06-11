package ageofingenuity.api.recipes;

import ageofingenuity.aoiValues;
import ageofingenuity.api.recipes.lines.*;
import net.minecraftforge.fml.common.Loader;

public class aoiRecipeHandler {
    public static void init() {
        beerline.init();
        epoxy.init();
        polyethylene.init();
        polyvinyl_chloride.init();
        polyepichlorohydrin.init();
        polytetrafluoroethylene.init();
        wineline.init();
    }

    public static void lowInit() {
    }

    public static void compatInit() {
    }
}