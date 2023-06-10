package ageofingenuity.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.util.GTUtility;
import gregtech.common.metatileentities.MetaTileEntities;
import ageofingenuity.aoi;
import ageofingenuity.client.aoiClientHandler;
import ageofingenuity.api.recipes.aoiRecipeMaps;
import net.minecraft.util.ResourceLocation;

import static gregtech.common.metatileentities.MetaTileEntities.*;

/* Takes up IDs 8500 - 8599 */
public class aoiMetaTileEntities {
    public static SimpleMachineMetaTileEntity[] CSTR = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];


    public static void init() {

        MetaTileEntities.registerSimpleMetaTileEntity(CSTR, 8501, "cstr", aoiRecipeMaps.CSTR, aoiClientHandler.CSTR_OVERLAY, true, aoiMetaTileEntities::location, GTUtility.hvCappedTankSizeFunction);

    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(aoi.MODID, name);
    }
}