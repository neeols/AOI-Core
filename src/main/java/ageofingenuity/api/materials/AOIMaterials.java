package ageofingenuity.api.materials;

import gregtech.api.unification.material.Material;
import ageofingenuity.api.materials.init.*;

public class AOIMaterials {

    // enderio
    public static Material PulsatingIron;
    public static Material ConductiveIron;
    public static Material EnergeticAlloy;
    public static Material VibrantAlloy;
    public static Material Soularium;
    public static Material ElectricalSteel;
    public static Material DarkSteel;
    public static Material RedstoneAlloy;
    public static Material EndSteel;
    public static Material StellarAlloy;
    public static Material MelodicAlloy;
    public static Material CrystallineAlloy;
    public static Material CrudeSteel;
    public static Material CrystallinePinkSlime;
    public static Material EnergeticSilver;
    public static Material VividAlloy;

    // alcohol

    public static Material BarleyMalt;
    public static Material BarleyMash;
    public static Material ImpureWort;
    public static Material BoiledImpureWort;
    public static Material HotWort;
    public static Material Trub;
    public static Material Wort;
    public static Material ImmatureBeer;
    public static Material Beer;
    public static Material Yeast;
    public static Material Bagasse; // need to make it a fuel source
    public static Material CaneJuice;
    public static Material RawMolasses;
    public static Material Molasses;
    public static Material RedWinePreferment;
    public static Material YoungRedWine;

    // chemicals

    // main materials

    public static void init() {
        Chemicals.init();
        EnderioMaterials.init();
        MainMaterials.init();
    }
}