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
        //GameRegistry.addSmelting(OreDictUnifier.get(ingot, WroughtIron), OreDictUnifier.get(ingot, AOIMaterials.CrudeSteel), 0);
    }
}
