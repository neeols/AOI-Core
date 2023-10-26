package ageofingenuity.api.recipes.lines;

import ageofingenuity.api.materials.AOIMaterials;
import ageofingenuity.api.recipes.AOIRecipeMaps;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import net.minecraftforge.fluids.FluidRegistry;

import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.gem;

public class wineline {
    public static void init() {
        AOIRecipeMaps.MILL.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input("sugarcane",1)
                .fluidOutputs(AOIMaterials.CaneJuice.getFluid(100))
                .output(dust, AOIMaterials.Bagasse, 1 )
                .buildAndRegister();
        RecipeMaps.FLUID_HEATER_RECIPES.recipeBuilder().EUt(128).duration(450) // 22.5 secs MV
                .fluidInputs(AOIMaterials.CaneJuice.getFluid(1000))
                .fluidOutputs(AOIMaterials.RawMolasses.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder().EUt(128).duration(350) // 17.5 secs MV
                .fluidInputs(AOIMaterials.RawMolasses.getFluid(1000))
                .fluidOutputs(AOIMaterials.Molasses.getFluid(950))
                .output(gem, Materials.Sugar, 5)
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder().EUt(32).duration(1200) // 1 min LV
                .input("cropRedgrape",20)
                .input(dust, AOIMaterials.Yeast, 10)
                .fluidInputs(AOIMaterials.Molasses.getFluid(2000), AOIMaterials.CaneJuice.getFluid(2000))
                .fluidOutputs(AOIMaterials.RedWinePreferment.getFluid(5000))
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(2400) // 2 mins LV
                .fluidInputs(AOIMaterials.RedWinePreferment.getFluid(5000))
                .fluidOutputs(AOIMaterials.YoungRedWine.getFluid(5000))
                .buildAndRegister();
        AOIRecipeMaps.MATURATION_VAT.recipeBuilder().EUt(32).duration(24000) // 10 mins LV
                .fluidInputs(AOIMaterials.YoungRedWine.getFluid(8000))
                .fluidOutputs(FluidRegistry.getFluidStack("gtfo_red_wine", 8000))
                .buildAndRegister();
    }
}