package ageofingenuity.api.recipes.lines;

import ageofingenuity.api.materials.AOIMaterials;
import ageofingenuity.api.materials.AOIMaterials;
import gregtech.api.recipes.RecipeMaps;
import ageofingenuity.api.recipes.AOIRecipeMaps;
import net.minecraftforge.fluids.FluidRegistry;

import static ageofingenuity.client.AOIClientHandler.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class beerline {
    public static void init() {
        // yeast
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(1000) // 50 secs LV
                .input("listAllfruit",4)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_sweetened_diluted_cane_syrup_mixture", 150))
                .output(dust, AOIMaterials.Yeast, 15)
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(800) // 30 secs LV
                .input("dustWheat", 10)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_sweetened_diluted_cane_syrup_mixture", 100))
                .output(dust, AOIMaterials.Yeast, 8)
                .buildAndRegister();
        // beer
        AOIRecipeMaps.MILL.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input("cropBarley",1)
                .output(dust, AOIMaterials.BarleyMalt, 1 )
                .buildAndRegister(); // 5 secs LV

        AOIRecipeMaps.MORTAR_GRINDER.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input(dust, AOIMaterials.BarleyMalt, 1)
                .output(dust, AOIMaterials.BarleyMash, 1 )
                .buildAndRegister();
        RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder().EUt(32).duration(200) // 10 secs LV
                .input(dust, AOIMaterials.BarleyMash, 1)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_heated_water", 1000))
                .fluidOutputs(AOIMaterials.ImpureWort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FLUID_HEATER_RECIPES.recipeBuilder().EUt(128).duration(450) // 22.5 secs MV
                .fluidInputs(AOIMaterials.ImpureWort.getFluid(10000))
                .fluidOutputs(AOIMaterials.BoiledImpureWort.getFluid(9000))
                .buildAndRegister();
        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder().EUt(128).duration(350) // 17.5 secs MV
                .fluidInputs(AOIMaterials.BoiledImpureWort.getFluid(2000))
                .fluidOutputs(AOIMaterials.HotWort.getFluid(1000), AOIMaterials.Trub.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder().EUt(128).duration(500) // 25 secs LV
                .fluidInputs(AOIMaterials.HotWort.getFluid(1000))
                .fluidOutputs(AOIMaterials.Wort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(2400) // 2 mins LV
                .input(dust, AOIMaterials.Yeast, 10)
                .fluidInputs(AOIMaterials.Wort.getFluid(1000))
                .fluidOutputs(AOIMaterials.ImmatureBeer.getFluid(1000))
                .buildAndRegister();
        AOIRecipeMaps.MATURATION_VAT.recipeBuilder().EUt(32).duration(12000) // 10 mins LV
                .fluidInputs(AOIMaterials.ImmatureBeer.getFluid(8000))
                .fluidOutputs(AOIMaterials.Beer.getFluid(8000))
                .buildAndRegister();
    }
}