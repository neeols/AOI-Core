package ageofingenuity.api.materials.init;

import com.pam.harvestcraft.blocks.growables.PamCropGrowable;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.items.ItemPamFood;
import gregtech.api.items.metaitem.MetaItem;
import gregtechfoodoption.block.GTFOCrop;
import gregtechfoodoption.block.GTFOCrops;
import gregtechfoodoption.item.GTFOMetaItem;
import gregtechfoodoption.item.GTFOMetaItems;
import gregtechfoodoption.item.GTFOOredictItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import scala.tools.cmd.Meta;

public class RegisterOreDicts {
    public static void AddOreDicts() {
        GTFOMetaItem.GRAPES.addOreDict("cropRedgrape");
    }
}
