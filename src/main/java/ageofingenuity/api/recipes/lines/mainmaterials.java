package ageofingenuity.api.recipes.lines;
import ageofingenuity.api.materials.AOIMaterials;
import gregtech.api.recipes.RecipeMaps;

import static gregtech.api.unification.material.Materials.*;
import static ageofingenuity.client.AOIClientHandler.*;
import gregtech.api.unification.OreDictUnifier;
import ageofingenuity.api.materials.AOIMaterials;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static gregtech.api.unification.ore.OrePrefix.ingot;

public class mainmaterials {
    public static void init() {
        // crude steel
        GameRegistry.addSmelting(OreDictUnifier.get(ingot, WroughtIron), OreDictUnifier.get(ingot, AOIMaterials.CrudeSteel), 0);
        RecipeMaps.FURNACE_RECIPES.recipeBuilder().EUt(8).duration(60)
                .input(ingot, WroughtIron)
                .output(ingot, AOIMaterials.CrudeSteel)
                .buildAndRegister();
        GameRegistry.addSmelting(OreDictUnifier.get(ingot, Iron), OreDictUnifier.get(ingot, WroughtIron), 0);
        RecipeMaps.FURNACE_RECIPES.recipeBuilder().EUt(8).duration(60)
                .input(ingot, Iron)
                .output(ingot, WroughtIron)
                .buildAndRegister();
    }
}
