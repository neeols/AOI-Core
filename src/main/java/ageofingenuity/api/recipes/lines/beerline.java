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
        aoiRecipeMaps.MILL.recipeBuilder().EUt(32).duration(100)
                .input("cropBarley",1)
                .output(dust, aoiMaterials.BarleyMalt, 1 )
                .buildAndRegister();
        aoiRecipeMaps.MORTAR_GRINDER.recipeBuilder().EUt(32).duration(100)
                .input(dust, aoiMaterials.BarleyMalt, 1)
                .output(dust, aoiMaterials.BarleyMash, 1 )
                .buildAndRegister();
        RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder().EUt(32).duration(200)
                .input(dust, aoiMaterials.BarleyMash, 1)
                .fluidInputs(FluidRegistry.getFluidStack("gtfo_heated_water", 1000))
                .fluidOutputs(aoiMaterials.ImpureWort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FLUID_HEATER_RECIPES.recipeBuilder().EUt(32).duration(450)
                .fluidInputs(aoiMaterials.ImpureWort.getFluid(10000))
                .fluidOutputs(aoiMaterials.BoiledImpureWort.getFluid(9000))
                .buildAndRegister();
        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder().EUt(128).duration(350)
                .fluidInputs(aoiMaterials.BoiledImpureWort.getFluid(2000))
                .fluidOutputs(aoiMaterials.HotWort.getFluid(1000), aoiMaterials.Trub.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.MIXER_RECIPES.recipeBuilder().EUt(32).duration(500)
                .fluidInputs(aoiMaterials.HotWort.getFluid(1000))
                .fluidOutputs(aoiMaterials.Wort.getFluid(1000))
                .buildAndRegister();
        RecipeMaps.FERMENTING_RECIPES.recipeBuilder().EUt(32).duration(3600)
                .input(dust, aoiMaterials.Yeast, 10)
                .fluidInputs(aoiMaterials.Wort.getFluid(1000))
                .fluidOutputs(aoiMaterials.ImmatureBeer.getFluid(1000))
                .buildAndRegister();
        aoiRecipeMaps.MATURATION_VAT.recipeBuilder().EUt(128).duration(3600)
                .fluidInputs(aoiMaterials.ImmatureBeer.getFluid(12000))
                .fluidOutputs(aoiMaterials.Beer.getFluid(10000))
                .buildAndRegister();
    }
}