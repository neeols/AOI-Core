package ageofingenuity.api.materials.init;

import gregtech.api.fluids.fluidType.FluidType;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static ageofingenuity.api.materials.AOIMaterials.*;
import static ageofingenuity.AOIValues.resLoc;
import ageofingenuity.api.materials.init.Elements;

// 23100-23200
// ALL code for elements generated at https://www.tutorialspoint.com/execute_lua_online.php
public class ElementMaterials {

    public static void init() {

        Newtonium = new Material.Builder(23101, resLoc("newtonium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nwt)
                .color(0x3300FF)
                .build();
        Randsonium = new Material.Builder(23102, resLoc("randsonium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Rsm)
                .color(0xFF6600)
                .build();
        Silaxium = new Material.Builder(23103, resLoc("silaxium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Sx)
                .color(0x33FF33)
                .build();
        Xylogen = new Material.Builder(23104, resLoc("xylogen"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Xg)
                .color(0xFF33CC)
                .build();
        Endogen = new Material.Builder(23105, resLoc("endogen"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.End)
                .color(0x438f81)
                .build();
        Cryogen = new Material.Builder(23106, resLoc("cryogen"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Cry)
                .color(0x9900CC)
                .build();
        Garethaium = new Material.Builder(23107, resLoc("garethaium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Grt)
                .color(0x0099FF)
                .build();
        Thorboxan = new Material.Builder(23108, resLoc("thorboxan"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Tbx)
                .color(0xFF9933)
                .build();
        Olylum = new Material.Builder(23109, resLoc("olylum"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Olm)
                .color(0x33CCFF)
                .build();
        Vernecium = new Material.Builder(23110, resLoc("vernecium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Vc)
                .color(0xCC33FF)
                .build();
        Wandrem = new Material.Builder(23111, resLoc("wandrem"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Wd)
                .color(0x66FF66)
                .build();
        Barether = new Material.Builder(23112, resLoc("barether"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Bae)
                .color(0xFF0066)
                .build();
        Zonyrexium = new Material.Builder(23113, resLoc("zonyrexium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Znr)
                .color(0x00FF99)
                .build();
        Blilium = new Material.Builder(23114, resLoc("blilium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Bll)
                .color(0xFF0000)
                .build();
        Narthium = new Material.Builder(23115, resLoc("narthium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nar)
                .color(0x00FF00)
                .build();
        Banothonium = new Material.Builder(23116, resLoc("banothonium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ban)
                .color(0x9933FF)
                .build();
        Radicalium = new Material.Builder(23117, resLoc("radicalium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Rad)
                .color(0xCC9900)
                .build();
        Lyhexium = new Material.Builder(23118, resLoc("lyhexium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Lyh)
                .color(0x660033)
                .build();
        Necrosium = new Material.Builder(23119, resLoc("necrosium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nec)
                .color(0x666600)
                .build();
        Dethoxium = new Material.Builder(23120, resLoc("dethoxium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Dth)
                .color(0x6600FF)
                .build();
        Poshlayamollynium = new Material.Builder(23121, resLoc("poshlayamollynium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Psm)
                .color(0xCCFF66)
                .build();
        Psychothium = new Material.Builder(23122, resLoc("psychothium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Pst)
                .color(0xFFCC00)
                .build();
        Shebangium = new Material.Builder(23123, resLoc("shebangium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Shb)
                .color(0x33FFCC)
                .build();
        Morgenshternium = new Material.Builder(23124, resLoc("morgenshternium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Mgs)
                .color(0x00FFFF)
                .build();
        Qillindrax = new Material.Builder(23125, resLoc("qillindrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qid)
                .color(0xFF99CC)
                .build();
        Somium = new Material.Builder(23126, resLoc("somium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Som)
                .color(0xCC00FF)
                .build();
        Equilinium = new Material.Builder(23127, resLoc("equilinium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Eql)
                .color(0xFF9966)
                .build();
        Quasarthium = new Material.Builder(23128, resLoc("quasarthium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qsr)
                .color(0x99FF00)
                .build();
        Virelonix = new Material.Builder(23129, resLoc("virelonix"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Vrx)
                .color(0x9966FF)
                .build();
        Zygnaryon = new Material.Builder(23130, resLoc("zygnaryon"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Zyg)
                .color(0x3366FF)
                .build();
        Ethrilith = new Material.Builder(23131, resLoc("ethrilith"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Eth)
                .color(0x33FF66)
                .build();
        Xyverium = new Material.Builder(23132, resLoc("xyverium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Xvr)
                .color(0xFF3366)
                .build();
        Bbnium = new Material.Builder(23133, resLoc("bbnium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Bbn)
                .color(0x66FF33)
                .build();
        Sparthium = new Material.Builder(23134, resLoc("sparthium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Spt)
                .color(0xFF6666)
                .build();
        Scallynium = new Material.Builder(23135, resLoc("scallynium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Scy)
                .color(0x66CCFF)
                .build();
        Manyullyn = new Material.Builder(23136, resLoc("manyullyn"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Mny)
                .color(0xCC66FF)
                .build();
        Quasaris = new Material.Builder(23137, resLoc("quasaris"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qrs)
                .color(0xCCCC00)
                .build();
        Nadithon = new Material.Builder(23138, resLoc("nadithon"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ndn)
                .color(0x00CCFF)
                .build();
        Pissium = new Material.Builder(23139, resLoc("pissium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Wee)
                .color(0xFFFF00)
                .build();
        Larsonthyum = new Material.Builder(23140, resLoc("larsonthyum"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Lrt)
                .color(0xCCFFCC)
                .build();
        Billabongium = new Material.Builder(23141, resLoc("billabongium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Blb)
                .color(0xFFCCFF)
                .build();
        Betachronium = new Material.Builder(23142, resLoc("betachronium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Bch)
                .color(0xA9A9A9)
                .build();
        Alphachronium = new Material.Builder(23143, resLoc("alphachronium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ach)
                .color(0xA9A9A9)
                .build();
        Sigmachronium = new Material.Builder(23144, resLoc("sigmachronium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Sch)
                .color(0xA9A9A9)
                .build();
        Nyxion = new Material.Builder(23145, resLoc("nyxion"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nyx)
                .color(0x9933CC)
                .build();
        Massachusettsium = new Material.Builder(23146, resLoc("massachusettsium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Msc)
                .color(0xCC9900)
                .build();
        Zephryx = new Material.Builder(23147, resLoc("zephryx"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Zpx)
                .color(0x009966)
                .build();
        Sylvanite = new Material.Builder(23148, resLoc("sylvanite"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Syv)
                .color(0x993300)
                .build();
        Nihilium = new Material.Builder(23149, resLoc("Nihilium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nih)
                .color(0x3300CC)
                .build();
        Psygenix = new Material.Builder(23150, resLoc("psygenix"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Psy)
                .color(0xCC0066)
                .build();
        Sexium = new Material.Builder(23151, resLoc("sexium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Sex)
                .color(0x33CC00)
                .build();
        Barznackium = new Material.Builder(23152, resLoc("barznackium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Bzk)
                .color(0x9900FF)
                .build();
        Chadingium = new Material.Builder(23153, resLoc("chadingium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Chd)
                .color(0x0066CC)
                .build();
        Cummium = new Material.Builder(23154, resLoc("cummium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Cum)
                .color(0xFFFFFF)
                .build();
        Blingrosium = new Material.Builder(23155, resLoc("blingrosium"))
                .fluid(FluidTypes.GAS).dust()
                .element(Elements.Blr)
                .color(0x00CCFF)
                .build();
        Nassium = new Material.Builder(23156, resLoc("nassium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nas)
                .color(0xFF6600)
                .build();
        Airdrax = new Material.Builder(23157, resLoc("airdrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Adx)
                .color(0x33FF00)
                .build();
        Waterdrax = new Material.Builder(23158, resLoc("waterdrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Wdx)
                .color(0xFFCC66)
                .build();
        Lavadrax = new Material.Builder(23159, resLoc("lavadrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ldx)
                .color(0x66CC00)
                .build();
        Geodrax = new Material.Builder(23160, resLoc("geodrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Gdx)
                .color(0xCC6600)
                .build();
        Venturius = new Material.Builder(23161, resLoc("venturius"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ven)
                .color(0xCC3300)
                .build();
        Xenophorium = new Material.Builder(23162, resLoc("xenophorium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Xph)
                .color(0x0066CC)
                .build();
        Torvalium = new Material.Builder(23163, resLoc("torvalium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Tvl)
                .color(0xCC33FF)
                .build();
        Veritium = new Material.Builder(23164, resLoc("veritium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Vrt)
                .color(0xFF00CC)
                .build();
        Quaseralith = new Material.Builder(23165, resLoc("quaseralith"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qrl).color(0x00CCFF)
                .build();
        Solitum = new Material.Builder(23166, resLoc("solitum"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Sol)
                .color(0xCC66FF)
                .build();
        Akwaibomium = new Material.Builder(23167, resLoc("akwaibomium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Akw)
                .color(0x66FFCC)
                .build();
        Nebulonite = new Material.Builder(23168, resLoc("nebulonite"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nbn)
                .color(0xFF99CC)
                .build();
        Massatron = new Material.Builder(23169, resLoc("massatron"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Mas)
                .color(0xCC0066)
                .build();
        Seraphon = new Material.Builder(23170, resLoc("seraphon"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Srp)
                .color(0x00CC99)
                .build();
        Oxydinium = new Material.Builder(23171, resLoc("oxydinium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Oxy)
                .color(0x3366CC)
                .build();
        Quarkosium = new Material.Builder(23172, resLoc("quarkosium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qrk)
                .color(0xCC3366)
                .build();
        Lagossium = new Material.Builder(23173, resLoc("lagossium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Lag)
                .color(0x66CC99)
                .build();
        Quandrius = new Material.Builder(23174, resLoc("quandrius"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Qus)
                .color(0x993366)
                .build();
        Novatronium = new Material.Builder(23175, resLoc("novatronium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Nvt)
                .color(0xCC9900)
                .build();
        Ombralex = new Material.Builder(23176, resLoc("ombralex"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Omx)
                .color(0x990066)
                .build();
        Insanae = new Material.Builder(23177, resLoc("insanae"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Ins)
                .color(0x006699)
                .build();
        Sindrax = new Material.Builder(23178, resLoc("sindrax"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Sid)
                .color(0x9900CC)
                .build();
        Fendasium = new Material.Builder(23179, resLoc("fendasium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Fes)
                .color(0x3366FF)
                .build();
        Galaxium = new Material.Builder(23180, resLoc("galaxium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Gx)
                .color(0xFF0066)
                .build();
        Copium = new Material.Builder(23181, resLoc("copium"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Cop)
                .color(0x66FF33)
                .build();
        Hyperion = new Material.Builder(23182, resLoc("hyperion"))
                .fluid(FluidTypes.GAS)
                .dust()
                .element(Elements.Hy)
                .color(0xCC0033)
                .build();
    }
}
