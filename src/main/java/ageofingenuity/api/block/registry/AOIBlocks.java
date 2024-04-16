package ageofingenuity.api.block.registry;

import ageofingenuity.api.block.*;
import ageofingenuity.api.item.ItemBlockBase;
import ageofingenuity.api.creativetab.registry.AOICreativeTabs;
import ageofingenuity.api.item.registry.AOIItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.IRarity;
import net.minecraftforge.registries.IForgeRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static ageofingenuity.util.AOINames.makeAOIName;


@SuppressWarnings("unused")
public class AOIBlocks {
    private static final String nullTranslationKey = "tile.null";
    private static final List<Block> BLOCKS = new ArrayList<>();

    public static final Map<Block, Item> ITEMS = new HashMap<>();
    
    public static BlockBase REFRACTORY_CEMENT;
    public static BlockBase REFRACTORY_CEMENT_BRICKS;

    public static void preInit() {
        REFRACTORY_CEMENT = createBlock(new BlockBase(makeAOIName("refractorycement"), AOICreativeTabs.TAB_AOI, Material.ROCK, SoundType.STONE),
                EnumRarity.COMMON, 64);
        REFRACTORY_CEMENT_BRICKS = createBlock(new BlockBase(makeAOIName("refractorycementbricks"), AOICreativeTabs.TAB_AOI, Material.ROCK, SoundType.STONE),
                EnumRarity.COMMON, 64);
    }

    public static void register(IForgeRegistry<Block> registry) {
        /* Register All Items in BLOCKS */
        for (Block block : BLOCKS) {
            registerBlock(block, registry);
        }
    }

    public static <T extends Block> T createBlock(T block, @NotNull IRarity rarity, int stackSize) {
        return createBlockWithItem(block, registeredBlock -> new ItemBlockBase(registeredBlock, rarity, stackSize));
    }

    public static <T extends Block> T createBlockWithItem(T block, Function<T, ItemBlock> itemBlockSupplier) {
        return createBlockWithRegisteredItem(block, (registeredBlock) -> AOIItems.createItem(itemBlockSupplier.apply(block)));
    }

    public static <T extends Block> T createBlockWithRegisteredItem(T block, Function<T, ItemBlock> itemBlockSupplier) {
        BLOCKS.add(block);
        ITEMS.put(block, itemBlockSupplier.apply(block));
        return block;
    }

    public static <T extends Block> T createBlockWithoutItem(T block) {
        BLOCKS.add(block);
        return block;
    }

    private static void registerBlock(Block block, IForgeRegistry<Block> registry) {
        registry.register(block);
        if (block.getTranslationKey().equals(nullTranslationKey)) {
            ResourceLocation rl = block.getRegistryName();
            assert rl != null;
            block.setTranslationKey(rl.getNamespace() + "." + rl.getPath());
        }
    }
}
