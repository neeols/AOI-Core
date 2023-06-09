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

/* Takes up IDs 20000 - 21000 */
public class aoiMetaTileEntities {
    public static SimpleMachineMetaTileEntity[] CSTR = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] MILL = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] MORTAR_GRINDER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] ROASTER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {

        MetaTileEntities.registerSimpleMetaTileEntity(CSTR, 20000, "cstr", aoiRecipeMaps.CSTR, aoiClientHandler.CSTR_OVERLAY, true, aoiMetaTileEntities::location, GTUtility.hvCappedTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(MILL, 20015, "mill", aoiRecipeMaps.MILL, aoiClientHandler.MILL_OVERLAY, true, aoiMetaTileEntities::location, GTUtility.defaultTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(MORTAR_GRINDER, 20030, "mortar_grinder", aoiRecipeMaps.MORTAR_GRINDER, aoiClientHandler.MORTAR_GRINDER_OVERLAY, true, aoiMetaTileEntities::location, GTUtility.defaultTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(ROASTER, 20045, "roaster", aoiRecipeMaps.ROASTER, aoiClientHandler.ROASTER_OVERLAY, true, aoiMetaTileEntities::location, GTUtility.defaultTankSizeFunction);

    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(aoi.MODID, name);
    }
}