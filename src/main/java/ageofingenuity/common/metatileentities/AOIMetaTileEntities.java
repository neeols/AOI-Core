package ageofingenuity.common.metatileentities;

import ageofingenuity.client.AOIClientHandler;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.util.GTUtility;
import gregtech.common.metatileentities.MetaTileEntities;
import ageofingenuity.AOI;
import ageofingenuity.api.recipes.AOIRecipeMaps;
import ageofingenuity.common.metatileentities.multi.MetaTileEntityPrimitiveAlloySmelter;
import net.minecraft.util.ResourceLocation;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

/* Takes up IDs 20000 - 21000 */
public class AOIMetaTileEntities {
    public static MetaTileEntityPrimitiveAlloySmelter PRIMITIVE_ALLOY_SMELTER;
    public static SimpleMachineMetaTileEntity[] CSTR = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] MILL = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] MORTAR_GRINDER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] ROASTER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] MATURATION_VAT = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    public static void init() {

        MetaTileEntities.registerSimpleMetaTileEntity(CSTR, 20000, "cstr", AOIRecipeMaps.CSTR, AOIClientHandler.CSTR_OVERLAY, true, AOIMetaTileEntities::location, GTUtility.hvCappedTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(MILL, 20015, "mill", AOIRecipeMaps.MILL, AOIClientHandler.MILL_OVERLAY, true, AOIMetaTileEntities::location, GTUtility.defaultTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(MORTAR_GRINDER, 20030, "mortar_grinder", AOIRecipeMaps.MORTAR_GRINDER, AOIClientHandler.MORTAR_GRINDER_OVERLAY, true, AOIMetaTileEntities::location, GTUtility.defaultTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(ROASTER, 20045, "roaster", AOIRecipeMaps.ROASTER, AOIClientHandler.ROASTER_OVERLAY, true, AOIMetaTileEntities::location, GTUtility.defaultTankSizeFunction);
        MetaTileEntities.registerSimpleMetaTileEntity(MATURATION_VAT, 20060, "maturation_vat", AOIRecipeMaps.MATURATION_VAT, AOIClientHandler.MATURATION_VAT_OVERLAY, false, AOIMetaTileEntities::location, GTUtility.defaultTankSizeFunction);

        //multis IDs 1500-1649
        PRIMITIVE_ALLOY_SMELTER = registerMetaTileEntity(1500, new MetaTileEntityPrimitiveAlloySmelter(gregtechId("primitive_alloy_smelter")));
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(AOI.MODID, name);
    }
}