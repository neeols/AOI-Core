package ageofingenuity.api.recipes.lines;

import ageofingenuity.api.materials.aoiMaterials;
import ageofingenuity.api.recipes.aoiRecipeMaps;
import gregtech.api.recipes.RecipeMaps;
import net.minecraftforge.fluids.FluidRegistry;

import static gregtech.api.unification.ore.OrePrefix.dust;

public class reworks {
    public static void init() {
        // sulfuric acid
        /*aoiRecipeMaps.ROASTER.recipeBuilder().EUt(32).duration(1000) // 50 secs LV
                .input("sulfur",1)
                .fluidInputs(FluidRegistry.getFluidStack("oxygen", 1000))
                .output(dust, aoiMaterials.Yeast, 15)
                .buildAndRegister();*/
    }
}