package ageofingenuity.api.materials;

import gregtech.api.unification.material.Material;
import ageofingenuity.api.materials.init.*;

public class AOIMaterials {

    public static void init() {
        ElementMaterials.init();
        Chemicals.init();
        EnderioMaterials.init();
        MainMaterials.initSteamAge();
        MainMaterials.initAlkahaal(); // boi is jus alkahaal
    }

    public static void materialChanges() {
        AOIMatProperties.propertyChanges();
        AOIMatProperties.flagChanges();
        AOIMatProperties.miscChanges();
        AOIMatProperties.setFormulas();
    }

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

    // boi is jus alkahaal
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

    //a

    // steam age

    public static Material Limestone;
    public static Material BurntLimestone;
    public static Material FireCement;

    // elements
    public static Material Newtonium;
    public static Material Randsonium;
    public static Material Silaxium;
    public static Material Xylogen;
    public static Material Endogen;
    public static Material Cryogen;
    public static Material Garethaium;
    public static Material Thorboxan;
    public static Material Olylum;
    public static Material Vernecium;
    public static Material Wandrem;
    public static Material Barether;
    public static Material Zonyrexium;
    public static Material Blilium;
    public static Material Narthium;
    public static Material Banothonium;
    public static Material Radicalium;
    public static Material Lyhexium;
    public static Material Necrosium;
    public static Material Dethoxium;
    public static Material Poshlayamollynium;
    public static Material Psychothium;
    public static Material Shebangium;
    public static Material Morgenshternium;
    public static Material Qillindrax;
    public static Material Somium;
    public static Material Equilinium;
    public static Material Quasarthium;
    public static Material Virelonix;
    public static Material Zygnaryon;
    public static Material Ethrilith;
    public static Material Xyverium;
    public static Material Bbnium;
    public static Material Sparthium;
    public static Material Scallynium;
    public static Material Manyullyn;
    public static Material Quasaris;
    public static Material Nadithon;
    public static Material Pissium;
    public static Material Larsonthyum;
    public static Material Billabongium;
    public static Material Betachronium;
    public static Material Alphachronium;
    public static Material Sigmachronium;
    public static Material Nyxion;
    public static Material Massachusettsium;
    public static Material Zephryx;
    public static Material Sylvanite;
    public static Material Nihilium;
    public static Material Psygenix;
    public static Material Sexium;
    public static Material Barznackium;
    public static Material Chadingium;
    public static Material Cummium;
    public static Material Blingrosium;
    public static Material Nassium;
    public static Material Airdrax;
    public static Material Waterdrax;
    public static Material Lavadrax;
    public static Material Geodrax;
    public static Material Venturius;
    public static Material Xenophorium;
    public static Material Torvalium;
    public static Material Veritium;
    public static Material Quaseralith;
    public static Material Solitum;
    public static Material Akwaibomium;
    public static Material Nebulonite;
    public static Material Massatron;
    public static Material Seraphon;
    public static Material Oxydinium;
    public static Material Quarkosium;
    public static Material Lagossium;
    public static Material Quandrius;
    public static Material Novatronium;
    public static Material Ombralex;
    public static Material Insanae;
    public static Material Sindrax;
    public static Material Fendasium;
    public static Material Galaxium;
    public static Material Copium;
    public static Material Hyperion;
}