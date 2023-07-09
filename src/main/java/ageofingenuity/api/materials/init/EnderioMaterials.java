package ageofingenuity.api.materials.init;

import gregtech.api.GTValues;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static ageofingenuity.api.materials.aoiMaterials.*;

public class EnderioMaterials {

    public static void init() {

        // base

        PulsatingIron = new Material.Builder(22001, "pulsating_iron")
                .ingot()
                .color(0xCEFFC2).iconSet(SHINY)
                .build();

        ConductiveIron = new Material.Builder(22002, "conductive_iron")
                .ingot()
                .color(0xFFD4D4).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EnergeticAlloy = new Material.Builder(22003, "energetic_alloy")
                .ingot()
                .color(0xFF970F).iconSet(SHINY)
                // components here
                // formula here
                .build();

        VibrantAlloy = new Material.Builder(22004, "vibrant_alloy")
                .ingot()
                .color(0x8CFF6A).iconSet(SHINY)
                // components here
                // formula here
                .build();

        Soularium = new Material.Builder(22005, "soularium")
                .ingot()
                .color(0xBFBFA1).iconSet(SHINY)
                // components here
                // formula here
                .build();

        ElectricalSteel = new Material.Builder(22006, "electrical_steel")
                .ingot()
                .color(0x665E5E).iconSet(DULL)
                // components here
                // formula here
                .build();

        DarkSteel = new Material.Builder(22007, "dark_steel")
                .ingot()
                .color(0x333333).iconSet(DULL)
                // components here
                // formula here
                .build();

        RedstoneAlloy = new Material.Builder(22008, "redstone_alloy")
                .ingot()
                .color(0x6F2227).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EndSteel = new Material.Builder(22009, "end_steel")
                .ingot()
                .color(0x7A7A61).iconSet(DULL)
                // components here
                // formula here
                .build();

        // endergy

        CrystallineAlloy = new Material.Builder(22010, "crystalline_alloy")
                .ingot()
                .color(0x52EBFF).iconSet(SHINY)
                // components here
                // formula here
                .build();

        MelodicAlloy = new Material.Builder(22011, "melodic_alloy")
                .ingot()
                .color(0x8B4A8C).iconSet(SHINY)
                // components here
                // formula here
                .build();

        StellarAlloy = new Material.Builder(22012, "stellar_alloy")
                .ingot()
                .color(0xFDFFC7).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EnergeticSilver = new Material.Builder(22013, "energetic_silver")
                .ingot()
                .color(0x3072FF).iconSet(SHINY)
                // components here
                // formula here
                .build();

        VividAlloy = new Material.Builder(22014, "vivid_alloy")
                .ingot()
                .color(0x32A7CF).iconSet(SHINY)
                // components here
                // formula here
                .build();

        CrudeSteel = new Material.Builder(22015, "crude_steel")
                .ingot()
                .color(0xB3B3B3).iconSet(DULL)
                // components here
                // formula here
                .build();

        CrystallinePinkSlime = new Material.Builder(22016, "crystalline_pink_slime")
                .ingot()
                .color(0xC86BC9).iconSet(SHINY)
                // components here
                // formula here
                .build();
    }
}