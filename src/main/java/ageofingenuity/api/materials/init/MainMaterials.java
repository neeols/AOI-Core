package ageofingenuity.api.materials.init;

import gregtech.api.GTValues;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;

import static ageofingenuity.aoiValues.resLoc;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static ageofingenuity.api.materials.aoiMaterials.*;

//22017

public class MainMaterials {

    public static void init() {
        BarleyMalt = new Material.Builder(22017, resLoc("barley_malt"))
                .dust()
                .color(0xc9c789)
                .build();

        BarleyMash = new Material.Builder(22018, resLoc("barley_mash"))
                .dust()
                .color(0xb4b895)
                .build();
        ImpureWort = new Material.Builder(22019, resLoc("impure_wort"))
                .fluid()
                .color(0xa8870f)
                .build();
        BoiledImpureWort = new Material.Builder(22020, resLoc("boiled_impure_wort"))
                .fluid()
                .color(0x6b5918)
                .build();
        HotWort = new Material.Builder(22021, resLoc("hot_wort"))
                .fluid()
                .color(0x8c351c)
                .build();
        Wort = new Material.Builder(22022, resLoc("wort"))
                .fluid()
                .color(0x5c2211)
                .build();
        Trub = new Material.Builder(22023, resLoc("trub"))
                .fluid()
                .color(0x947240)
                .build();
        ImmatureBeer = new Material.Builder(22024, resLoc("immature_beer"))
                .fluid()
                .color(0x32a852)
                .build();

        Beer = new Material.Builder(22025, resLoc("beer"))
                .fluid()
                .color(0xf28e1c)
                .build();
        Yeast = new Material.Builder(22026, resLoc("yeast"))
                .dust()
                .color(0xfae1ac)
                .build();
    }
}