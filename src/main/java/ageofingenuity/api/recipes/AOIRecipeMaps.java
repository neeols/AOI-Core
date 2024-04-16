package ageofingenuity.api.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.api.recipes.builders.PrimitiveRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
public class AOIRecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> CSTR = new RecipeMap<>("cstr",
            6, false, 2, false, 3, false, 2, false, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.ASSEMBLER)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL);

    public static final RecipeMap<SimpleRecipeBuilder> MILL = new RecipeMap<>("mill",
            2, false, 2, false, 1, false, 1, false, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.COMBUSTION)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_SLICE, ProgressWidget.MoveType.VERTICAL_DOWNWARDS);

    public static final RecipeMap<SimpleRecipeBuilder> MORTAR_GRINDER = new RecipeMap<>("mortar_grinder",
            1, false, 1, false, 1, false, 0, false, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.MACERATOR)
            .setProgressBar(GuiTextures.PROGRESS_BAR_MACERATE, ProgressWidget.MoveType.HORIZONTAL);

    public static final RecipeMap<SimpleRecipeBuilder> ROASTER = new RecipeMap<>("roaster",
            1, false, 2, false, 1, false, 0, false, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.ARC)
            .setSlotOverlay(false, false, false, GuiTextures.FURNACE_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL);
    public static final RecipeMap<SimpleRecipeBuilder> MATURATION_VAT = new RecipeMap<>("maturation_vat",
            1, false, 1, false, 1, false, 1, false, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.BATH)
            .setSlotOverlay(false, true, true, GuiTextures.BREWER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_BATH, ProgressWidget.MoveType.VERTICAL_INVERTED);

    public static final RecipeMap<PrimitiveRecipeBuilder> PRIMITIVE_ALLOY_SMELTER_RECIPES = new RecipeMap<>(
            "primitive_alloy_smelter", 4, false, 3, false, 0, false, 0, false, new PrimitiveRecipeBuilder(), false)
            .setSound(GTSoundEvents.FIRE);
}