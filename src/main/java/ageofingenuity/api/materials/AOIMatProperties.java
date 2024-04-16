package ageofingenuity.api.materials;

import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.FluidProperty;
import gregtech.api.unification.material.properties.GemProperty;
import gregtech.api.unification.material.properties.IngotProperty;
import gregtech.api.unification.material.properties.PropertyKey;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregicality.multiblocks.api.unification.GCYMMaterials.*;
import static ageofingenuity.api.materials.AOIMaterials.*;

public class AOIMatProperties {
    public static void propertyChanges() {
        // Rhodium Sulfate gets Dust Property from adding it as an ore byproduct of Darmstadtite in LabsMicroverse

        Lutetium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Neptunium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Curium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Berkelium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Californium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Einsteinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Graphite.setProperty(PropertyKey.INGOT, new IngotProperty());

        Neptunium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Curium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Berkelium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Californium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Einsteinium.setProperty(PropertyKey.FLUID, new FluidProperty());
        NetherStar.setProperty(PropertyKey.FLUID, new FluidProperty());

        // Cinnabar Got its Gems Removed for future Thaumcraft Compat.
        // We don't have Thaumcraft. Add it back. (Part 2)
        Cinnabar.setProperty(PropertyKey.GEM, new GemProperty());
    }

    public static void flagChanges() {
        /* GT 2.8 made Double Plates a separate flag, so some materials lost it. Add it back to needed materials. */

        // GT Materials, and their Other Needed Flag Additions
        Trinium.addFlags(GENERATE_DOUBLE_PLATE, GENERATE_DENSE);

        // GCYM Materials, and their Other Needed Flag Additions
        WatertightSteel.addFlags(GENERATE_DOUBLE_PLATE);
        IncoloyMA956.addFlags(GENERATE_DOUBLE_PLATE);

        /* Other Flag Additions */
        Topaz.addFlags(GENERATE_LENS);
        BlueTopaz.addFlags(GENERATE_LENS);
        EnderPearl.addFlags(GENERATE_LENS);
        Electrum.addFlags(GENERATE_GEAR);
        Neutronium.addFlags(GENERATE_ROUND);
        Titanium.addFlags(GENERATE_FOIL, GENERATE_FINE_WIRE);
        StainlessSteel.addFlags(GENERATE_FOIL, GENERATE_FINE_WIRE);
        NaquadahEnriched.addFlags(GENERATE_BOLT_SCREW);
        Naquadria.addFlags(GENERATE_BOLT_SCREW);
        Iridium.addFlags(GENERATE_DENSE);
        Berkelium.addFlags(GENERATE_FRAME);
        BlueSteel.addFlags(GENERATE_FRAME);
        Ultimet.addFlags(GENERATE_FRAME);
        Tritanium.addFlags(GENERATE_DENSE, GENERATE_SPRING);

        // Cinnabar Got its Gems Removed for future Thaumcraft Compat.
        // We don't have Thaumcraft. Add it back. (Part 2)
        Cinnabar.addFlags(CRYSTALLIZABLE);

        // Prevent TE Gears from showing up
        Tin.addFlags(GENERATE_GEAR);
        Copper.addFlags(GENERATE_GEAR);
        Gold.addFlags(GENERATE_GEAR);
        Lead.addFlags(GENERATE_GEAR);
        Nickel.addFlags(GENERATE_GEAR);
        Platinum.addFlags(GENERATE_GEAR);
        Silver.addFlags(GENERATE_GEAR);
        Emerald.addFlags(GENERATE_GEAR);
    }

    public static void setFormulas() {
        Limestone.setFormula("CaCO", true);
        BurntLimestone.setFormula("CaO", true);
        FireCement.setFormula("(SiO2)3(CaO)", true);
    }

    public static void miscChanges() {
        RhodiumSulfate.setMaterialIconSet(MaterialIconSet.ROUGH);
    }
}
