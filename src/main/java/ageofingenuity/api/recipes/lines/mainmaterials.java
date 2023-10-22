package ageofingenuity.api.recipes.lines;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.common.items.MetaItems;
import ageofingenuity.api.recipes.aoiRecipeMaps;
import ageofingenuity.aoiValues;
import net.minecraft.item.ItemStack;
import static gregtech.api.unification.material.Materials.*;
import static ageofingenuity.client.aoiClientHandler.*;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import ageofingenuity.api.materials.aoiMaterials;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static gregtech.api.unification.ore.OrePrefix.ingot;

public class mainmaterials {
    public static void init() {
        // crude steel
        GameRegistry.addSmelting(OreDictUnifier.get(ingot, Materials.WroughtIron), OreDictUnifier.get(ingot, aoiMaterials.CrudeSteel), 0);
        RecipeMaps.FURNACE_RECIPES.recipeBuilder().EUt(8).duration(60)
                .input(ingot, WroughtIron)
                .output(ingot, aoiMaterials.CrudeSteel)
                .buildAndRegister();
    }
}
