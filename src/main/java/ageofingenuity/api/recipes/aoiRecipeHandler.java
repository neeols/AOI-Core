package ageofingenuity.api.recipes;

import ageofingenuity.api.recipes.lines.*;

public class aoiRecipeHandler {
    public static void init() {
        beerline.init();
        epoxy.init();
        polyethylene.init();
        polyvinyl_chloride.init();
        polyepichlorohydrin.init();
        polytetrafluoroethylene.init();
        wineline.init();
        reworks.init();
        mainmaterials.init();
    }

    public static void lowInit() {
    }

    public static void compatInit() {
    }
}