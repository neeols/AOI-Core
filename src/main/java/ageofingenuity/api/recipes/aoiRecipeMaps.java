package ageofingenuity.api.recipes;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
public class aoiRecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> CSTR = new RecipeMap<>("cstr",
            0, 6, 0, 2, 0, 3, 0, 1, new SimpleRecipeBuilder(), false)
            .setSound(GTSoundEvents.ASSEMBLER)
            .setSlotOverlay(false, false, true, GuiTextures.INT_CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL);
}