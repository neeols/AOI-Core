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
                .color(0xceffc2).iconSet(SHINY)
                .build();

        ConductiveIron = new Material.Builder(22002, "conductive_iron")
                .ingot()
                .color(0xffd4d4).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EnergeticAlloy = new Material.Builder(22003, "energetic_alloy")
                .ingot()
                .color(0xff970f).iconSet(SHINY)
                // components here
                // formula here
                .build();

        VibrantAlloy = new Material.Builder(22004, "vibrant_alloy")
                .ingot()
                .color(0x8cff6a).iconSet(SHINY)
                // components here
                // formula here
                .build();

        Soularium = new Material.Builder(22005, "soularium")
                .ingot()
                .color(0xbfbfa1).iconSet(SHINY)
                // components here
                // formula here
                .build();

        ElectricalSteel = new Material.Builder(22006, "electrical_steel")
                .ingot()
                .color(0x665e5e).iconSet(DULL)
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
                .color(0x6f2227).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EndSteel = new Material.Builder(22009, "end_steel")
                .ingot()
                .color(0x7a7a61).iconSet(DULL)
                // components here
                // formula here
                .build();

        // endergy

        CrystallineAlloy = new Material.Builder(22010, "crystalline_alloy")
                .ingot()
                .color(0x52ebff).iconSet(SHINY)
                // components here
                // formula here
                .build();

        MelodicAlloy = new Material.Builder(22011, "melodic_alloy")
                .ingot()
                .color(0x8b4a8c).iconSet(SHINY)
                // components here
                // formula here
                .build();

        StellarAlloy = new Material.Builder(22012, "stellar_alloy")
                .ingot()
                .color(0xfdffc7).iconSet(SHINY)
                // components here
                // formula here
                .build();

        EnergeticSilver = new Material.Builder(22013, "energetic_silver")
                .ingot()
                .color(0xa6b2de).iconSet(SHINY)
                // components here
                // formula here
                .build();

        VividAlloy = new Material.Builder(22014, "vivid_alloy")
                .ingot()
                .color(0x32a7cf).iconSet(SHINY)
                // components here
                // formula here
                .build();

        CrudeSteel = new Material.Builder(22015, "crude_steel")
                .ingot()
                .color(0xb3b3b3).iconSet(DULL)
                // components here
                // formula here
                .build();

        CrystallinePinkSlime = new Material.Builder(22016, "crystalline_pink_slime")
                .ingot()
                .color(0xc86bc9).iconSet(SHINY)
                // components here
                // formula here
                .build();
    }
}