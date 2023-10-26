package ageofingenuity.api.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
public class AOIRecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> CSTR = new RecipeMap<>("cstr",
            0, 6, 0, 2, 0, 3, 0, 1, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.ASSEMBLER)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL);

    public static final RecipeMap<SimpleRecipeBuilder> MILL = new RecipeMap<>("mill",
            0, 2, 0, 2, 0, 1, 0, 1, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.COMBUSTION)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_SLICE, ProgressWidget.MoveType.VERTICAL_DOWNWARDS);

    public static final RecipeMap<SimpleRecipeBuilder> MORTAR_GRINDER = new RecipeMap<>("mortar_grinder",
            0, 1, 0, 1, 0, 1, 0, 0, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.MACERATOR)
            .setProgressBar(GuiTextures.PROGRESS_BAR_MACERATE, ProgressWidget.MoveType.HORIZONTAL);

    public static final RecipeMap<SimpleRecipeBuilder> ROASTER = new RecipeMap<>("roaster",
            0, 1, 0, 2, 0, 1, 0, 0, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.ARC)
            .setSlotOverlay(false, false, false, GuiTextures.FURNACE_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL);
    public static final RecipeMap<SimpleRecipeBuilder> MATURATION_VAT = new RecipeMap<>("maturation_vat",
            0, 1, 0, 1, 0, 1, 0, 1, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.BATH)
            .setSlotOverlay(false, true, true, GuiTextures.BREWER_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_BATH, ProgressWidget.MoveType.VERTICAL_INVERTED);
}