package ageofingenuity.api.recipes.lines;

import ageofingenuity.api.materials.aoiMaterials;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.common.items.MetaItems;
import ageofingenuity.api.recipes.aoiRecipeMaps;
import ageofingenuity.aoiValues;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import static gregtech.api.unification.material.Materials.*;
import static ageofingenuity.client.aoiClientHandler.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class beerline {
    public static void init() {
        // yeast
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(1000) // 50 secs LV
                .input("listAllfruit",4)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_sweetened_diluted_cane_syrup_mixture", 150))
                .output(dust, aoiMaterials.Yeast, 15)
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(800) // 30 secs LV
                .input("dustWheat", 10)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_sweetened_diluted_cane_syrup_mixture", 100))
                .output(dust, aoiMaterials.Yeast, 8)
                .buildAndRegister();
        // beer
        aoiRecipeMaps.MILL.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input("cropBarley",1)
                .output(dust, aoiMaterials.BarleyMalt, 1 )
                .buildAndRegister(); // 5 secs LV

        aoiRecipeMaps.MORTAR_GRINDER.recipeBuilder().EUt(32).duration(100) // 5 secs LV
                .input(dust, aoiMaterials.BarleyMalt, 1)
                .output(dust, aoiMaterials.BarleyMash, 1 )
                .buildAndRegister();
        RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder().EUt(32).duration(200) // 10 secs LV
                .input(dust, aoiMaterials.BarleyMash, 1)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_heated_water", 1000))
                .fluidOutputs(aoiMaterials.ImpureWort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FLUID_HEATER_RECIPES.recipeBuilder().EUt(128).duration(450) // 22.5 secs MV
                .fluidInputs(aoiMaterials.ImpureWort.getFluid(10000))
                .fluidOutputs(aoiMaterials.BoiledImpureWort.getFluid(9000))
                .buildAndRegister();
        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder().EUt(128).duration(350) // 17.5 secs MV
                .fluidInputs(aoiMaterials.BoiledImpureWort.getFluid(2000))
                .fluidOutputs(aoiMaterials.HotWort.getFluid(1000), aoiMaterials.Trub.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder().EUt(128).duration(500) // 25 secs LV
                .fluidInputs(aoiMaterials.HotWort.getFluid(1000))
                .fluidOutputs(aoiMaterials.Wort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(2400) // 2 mins LV
                .input(dust, aoiMaterials.Yeast, 10)
                .fluidInputs(aoiMaterials.Wort.getFluid(1000))
                .fluidOutputs(aoiMaterials.ImmatureBeer.getFluid(1000))
                .buildAndRegister();
        aoiRecipeMaps.MATURATION_VAT.recipeBuilder().EUt(32).duration(12000) // 10 mins LV
                .fluidInputs(aoiMaterials.ImmatureBeer.getFluid(8000))
                .fluidOutputs(aoiMaterials.Beer.getFluid(8000))
                .buildAndRegister();
    }
}