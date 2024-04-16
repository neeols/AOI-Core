package ageofingenuity.api.block.registry;

import ageofingenuity.api.block.registry.AOIBlocks;
import ageofingenuity.api.item.registry.AOIItems;
import gregtech.api.block.VariantActiveBlock;
import gregtech.api.block.VariantItemBlock;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AOIMetaBlocks extends AOIBlocks {
    private static final List<VariantActiveBlock<?>> META_BLOCKS = new ArrayList<>();

    //public static BlockUniqueCasing UNIQUE_CASING;
    public static void preInit() {
        //UNIQUE_CASING = createMetaBlock(new BlockUniqueCasing(makeLabsName("unique_casing")));
    }

    public static <T extends VariantActiveBlock<V>, V extends Enum<V> & IStringSerializable> T createMetaBlock(T block) {
        META_BLOCKS.add(block);

        return createBlockWithRegisteredItem(block, registeredBlock -> {
            var item = new VariantItemBlock<>(block);
            item.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
            return AOIItems.createItemWithoutModelHandling(item);
        });
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        for (var block : META_BLOCKS)
            block.onModelRegister();
    }
}
