package ageofingenuity.api.materials.init;

import gregtech.api.unification.material.Material;

import static ageofingenuity.AOIValues.resLoc;
import static ageofingenuity.api.materials.AOIMaterials.*;

//22017

public class MainMaterials {

    public static void init() {
        //beer

        BarleyMalt = new Material.Builder(22017, resLoc("barley_malt"))
                .dust()
                .color(0xc9c789)
                .build();

        BarleyMash = new Material.Builder(22018, resLoc("barley_mash"))
                .dust()
                .color(0xb4b895)
                .build();
        ImpureWort = new Material.Builder(22019, resLoc("impure_wort"))
                .liquid()
                .color(0xa8870f)
                .build();
        BoiledImpureWort = new Material.Builder(22020, resLoc("boiled_impure_wort"))
                .liquid()
                .color(0x6b5918)
                .build();
        HotWort = new Material.Builder(22021, resLoc("hot_wort"))
                .liquid()
                .color(0x8c351c)
                .build();
        Wort = new Material.Builder(22022, resLoc("wort"))
                .liquid()
                .color(0x5c2211)
                .build();
        Trub = new Material.Builder(22023, resLoc("trub"))
                .liquid()
                .color(0x947240)
                .build();
        ImmatureBeer = new Material.Builder(22024, resLoc("immature_beer"))
                .liquid()
                .color(0x32a852)
                .build();

        Beer = new Material.Builder(22025, resLoc("beer"))
                .liquid()
                .color(0xf28e1c)
                .build();
        Yeast = new Material.Builder(22026, resLoc("yeast"))
                .dust()
                .color(0xfae1ac)
                .build();
        Bagasse = new Material.Builder(22027, resLoc("bagasse"))
                .dust()
                .color(0xdac586)
                .build();
        CaneJuice = new Material.Builder(22028, resLoc("canejuice"))
                .liquid()
                .color(0xaefd6c)
                .build();
        RawMolasses = new Material.Builder(22029, resLoc("raw_molasses"))
                .liquid()
                .color(0x4f2c2a)
                .build();
        Molasses = new Material.Builder(22030, resLoc("molasses"))
                .liquid()
                .color(0x574a47)
                .build();
        RedWinePreferment = new Material.Builder(22031, resLoc("red_wine_preferment"))
                .liquid()
                .color(0x641b30)
                .build();
        YoungRedWine = new Material.Builder(22032, resLoc("young_red_wine"))
                .liquid()
                .color(0x591620)
                .build();
    }
}