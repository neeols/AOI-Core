package ageofingenuity.api.recipes.lines;

import ageofingenuity.api.materials.aoiMaterials;
import ageofingenuity.api.recipes.aoiRecipeMaps;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import net.minecraftforge.fluids.FluidRegistry;

import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;

public class wineline {
    public static void init() {
        aoiRecipeMaps.MILL.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input("sugarcane",1)
                .fluidOutputs(aoiMaterials.CaneJuice.getFluid(100))
                .output(dust, aoiMaterials.Bagasse, 1 )
                .buildAndRegister();
        RecipeMaps.FLUID_HEATER_RECIPES.recipeBuilder().EUt(128).duration(450) // 22.5 secs MV
                .fluidInputs(aoiMaterials.CaneJuice.getFluid(1000))
                .fluidOutputs(aoiMaterials.RawMolasses.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder().EUt(128).duration(350) // 17.5 secs MV
                .fluidInputs(aoiMaterials.RawMolasses.getFluid(1000))
                .fluidOutputs(aoiMaterials.Molasses.getFluid(950))
                .output(gem, Materials.Sugar, 5)
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder().EUt(32).duration(1200) // 1 min LV
                .input("cropGrape",20)
                .input(dust, aoiMaterials.Yeast, 10)
                .fluidInputs(aoiMaterials.Molasses.getFluid(2000), aoiMaterials.CaneJuice.getFluid(2000))
                .fluidOutputs(aoiMaterials.RedWinePreferment.getFluid(5000))
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(2400) // 2 mins LV
                .fluidInputs(aoiMaterials.RedWinePreferment.getFluid(5000))
                .fluidOutputs(aoiMaterials.YoungRedWine.getFluid(5000))
                .buildAndRegister();
        aoiRecipeMaps.MATURATION_VAT.recipeBuilder().EUt(32).duration(24000) // 10 mins LV
                .fluidInputs(aoiMaterials.YoungRedWine.getFluid(8000))
                .fluidOutputs(FluidRegistry.getFluidStack("gtfo_red_wine", 8000))
                .buildAndRegister();
    }
}