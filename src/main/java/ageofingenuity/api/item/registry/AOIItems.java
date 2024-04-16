package ageofingenuity.api.item.registry;

import ageofingenuity.api.item.ItemBase;
import ageofingenuity.api.item.ItemBlockBase;
import ageofingenuity.api.item.registry.register.MainItems;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;

@SuppressWarnings("unused")
public class AOIItems {
    private static final String nullTranslationKey = "item.null";

    private static final List<Item> ITEMS = new ArrayList<>();

    private static final Set<Item> NO_MODEL_HANDLING_ITEMS = new HashSet<>();
    public static ItemBase COKECLAYMIXTURE;
    public static ItemBase MOTOR_STEAM;
    public static ItemBase PISTON_STEAM;

    public static void preInit() {
        /* Coins */
        MainItems.init();
    }

    /* HELPER FUNCTIONS */
    public static void register(IForgeRegistry<Item> registry) {
        for (Item item : ITEMS) {
            registerItem(item, registry);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        for (Item item : ITEMS) {
            if (NO_MODEL_HANDLING_ITEMS.contains(item)) continue; // Skip Model Handling for these items
            registerModel(item);
        }

        registerCustomModels();
    }

    private static void registerCustomModels() {
        /* Add an Animated Version of Blaze Powder. Used in quest icons, so it fits in with the other Thermal Quests.*/

        // Need to set a custom model resource location for meta 0, otherwise that appears as null.
        var mrlBlaze0 = new ModelResourceLocation("blaze_powder", "inventory");
        ModelLoader.setCustomModelResourceLocation(Items.BLAZE_POWDER, 0, mrlBlaze0);

        // Add Animated Model
        var mrlBlaze1 = new ModelResourceLocation("blaze_powder_animated", "inventory");
        ModelLoader.setCustomModelResourceLocation(Items.BLAZE_POWDER, 1, mrlBlaze1);
    }

    public static <T extends Item> T createItem(T item) {
        ITEMS.add(item);
        return item;
    }

    public static <T extends Item> T createItemWithoutModelHandling(T item) {
        NO_MODEL_HANDLING_ITEMS.add(item);
        return createItem(item);
    }

    private static void registerItem(Item item, IForgeRegistry<Item> registry) {
        registry.register(item);
        if (item.getTranslationKey().equals(nullTranslationKey)) {
            ResourceLocation rl = item.getRegistryName();
            assert rl != null;
            item.setTranslationKey(rl.getNamespace() + "." + rl.getPath());
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item) {
        ResourceLocation rl = item.getRegistryName();
        assert rl != null;
        ModelBakery.registerItemVariants(item, rl);
        ModelResourceLocation mrl;

        // Block model registering
        if (item instanceof ItemBlock itemBlock) {
            Block block = itemBlock.getBlock();
            for (IBlockState state : block.getBlockState().getValidStates()) {
                mrl = new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()),
                        MetaBlocks.statePropertiesToString(state.getProperties()));
                ModelLoader.setCustomModelResourceLocation(item, block.getMetaFromState(state), mrl);
            }
            return;
        }

        mrl = new ModelResourceLocation(rl, "inventory");
        assert item.getCreativeTab() != null;

        // Item does not have subtypes
        if (!item.getHasSubtypes()) {
            ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
            return;
        }

        // Register each sub item's model
        NonNullList<ItemStack> subItems = NonNullList.create();
        item.getSubItems(item.getCreativeTab(), subItems);

        for (ItemStack stack : subItems)
            ModelLoader.setCustomModelResourceLocation(stack.getItem(), stack.getMetadata(), mrl);
    }
}
