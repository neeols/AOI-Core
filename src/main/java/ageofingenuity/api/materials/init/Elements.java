package ageofingenuity.api.materials.init;

import com.google.common.base.CaseFormat;
import gregtech.api.unification.*;

import java.util.*;

public class Elements {

    private static final Map<String, Element> elements = new HashMap<>();

    private Elements() {
    }
    public static final Element Nwt = add(119, 200 , -1, null, "Newtonium", "Nwt", false);
    public static final Element Rsm = add(120, 202 , -1, null, "Randsonium", "Rsm", false);
    public static final Element Sx = add(121, 206 , -1, null, "Silaxium", "Sx", false);
    public static final Element Xg = add(122, 207 , -1, null, "Xylogen", "Xg", false);
    public static final Element End = add(123, 210 , -1, null, "Endogen", "End", false);
    public static final Element Cry = add(124, 209 , -1, null, "Cryogen", "Cry", false);
    public static final Element Grt = add(125, 209 , -1, null, "Garethaium", "Grt", false);
    public static final Element Tbx = add(126, 210 , -1, null, "Thorboxan", "Tbx", false);
    public static final Element Olm = add(127, 216 , -1, null, "Olylum", "Olm", false);
    public static final Element Vc = add(128, 217 , -1, null, "Vernecium", "Vc", false);
    public static final Element Wd = add(129, 221 , -1, null, "Wandrem", "Wd", false);
    public static final Element Bae = add(130, 223 , -1, null, "Barether", "Bae", false);
    public static final Element Znr = add(131, 225 , -1, null, "Zonyrexium", "Znr", false);
    public static final Element Bll = add(132, 228 , -1, null, "Blilium", "Bll", false);
    public static final Element Nar = add(133, 228 , -1, null, "Narthium", "Nar", false);
    public static final Element Ban = add(134, 232 , -1, null, "Banothonium", "Ban", false);
    public static final Element Rad = add(135, 234 , -1, null, "Radicalium", "Rad", false);
    public static final Element Lyh = add(136, 240 , -1, null, "Lyhexium", "Lyh", false);
    public static final Element Nec = add(137, 240 , -1, null, "Necrosium", "Nec", false);
    public static final Element Dth = add(138, 242 , -1, null, "Dethoxium", "Dth", false);
    public static final Element Psm = add(139, 241 , -1, null, "Poshlayamollynium", "Psm", false);
    public static final Element Pst = add(140, 239 , -1, null, "Psychothium", "Pst", false);
    public static final Element Shb = add(141, 244 , -1, null, "Shebangium", "Shb", false);
    public static final Element Mgs = add(142, 243 , -1, null, "Morgenshternium", "Mgs", false);
    public static final Element Qid = add(143, 248 , -1, null, "Qillindrax", "Qid", false);
    public static final Element Som = add(144, 251 , -1, null, "Somium", "Som", false);
    public static final Element Eql = add(145, 256 , -1, null, "Equilinium", "Eql", false);
    public static final Element Qsr = add(146, 259 , -1, null, "Quasarthium", "Qsr", false);
    public static final Element Vrx = add(147, 259 , -1, null, "Virelonix", "Vrx", false);
    public static final Element Zyg = add(148, 263 , -1, null, "Zygnaryon", "Zyg", false);
    public static final Element Eth = add(149, 268 , -1, null, "Ethrilith", "Eth", false);
    public static final Element Xvr = add(150, 272 , -1, null, "Xyverium", "Xvr", false);
    public static final Element Bbn = add(151, 277 , -1, null, "Bbnium", "Bbn", false);
    public static final Element Spt = add(152, 274 , -1, null, "Sparthium", "Spt", false);
    public static final Element Scy = add(153, 283 , -1, null, "Scallynium", "Scy", false);
    public static final Element Mny = add(154, 286 , -1, null, "Manyullyn", "Mny", false);
    public static final Element Qrs = add(155, 288 , -1, null, "Quasaris", "Qrs", false);
    public static final Element Ndn = add(156, 288 , -1, null, "Nadithon", "Ndn", false);
    public static final Element Wee = add(157, 293 , -1, null, "Pissium", "Wee", false);
    public static final Element Lrt = add(158, 295 , -1, null, "Larsonthyum", "Lrt", false);
    public static final Element Blb = add(159, 298 , -1, null, "Billabongium", "Blb", false);
    public static final Element Bch = add(160, 300 , -1, null, "Betachronium", "Bch", false);
    public static final Element Ach = add(161, 302 , -1, null, "Alphachronium", "Ach", false);
    public static final Element Sch = add(162, 302 , -1, null, "Sigmachronium", "Sch", false);
    public static final Element Nyx = add(163, 308 , -1, null, "Nyxion", "Nyx", false);
    public static final Element Msc = add(164, 314 , -1, null, "Massachusettsium", "Msc", false);
    public static final Element Zpx = add(165, 320 , -1, null, "Zephryx", "Zpx", false);
    public static final Element Syv = add(166, 322 , -1, null, "Sylvanite", "Syv", false);
    public static final Element Nih = add(167, 316 , -1, null, "Nihilium", "Nih", false);
    public static final Element Psy = add(168, 326 , -1, null, "Psygenix", "Psy", false);
    public static final Element Sex = add(169, 326 , -1, null, "Sexium", "Sex", false);
    public static final Element Bzk = add(170, 329 , -1, null, "Barznackium", "Bzk", false);
    public static final Element Chd = add(171, 331 , -1, null, "Chadingium", "Chd", false);
    public static final Element Cum = add(172, 332 , -1, null, "Cummium", "Cum", false);
    public static final Element Blr = add(173, 339 , -1, null, "Blingrosium", "Blr", false);
    public static final Element Nas = add(174, 339 , -1, null, "Nassium", "Nas", false);
    public static final Element Adx = add(175, 340 , -1, null, "Airdrax", "Adx", false); // som mommy
    public static final Element Wdx = add(176, 344 , -1, null, "Waterdrax", "Wdx", false);
    public static final Element Ldx = add(177, 346 , -1, null, "Lavadrax", "Ldx", false);
    public static final Element Gdx = add(178, 340, -1, null, "Geodrax", "Gdx", false);
    public static final Element Ven = add(179, 372 , -1, null, "Venturius", "Ven", false);
    public static final Element Xph = add(180, 346 , -1, null, "Xenophorium", "Xph", false);
    public static final Element Tvl = add(181, 331 , -1, null, "Torvalium", "Tvl", false);
    public static final Element Vrt = add(182, 358 , -1, null, "Veritium", "Vrt", false);
    public static final Element Qrl = add(183, 362 , -1, null, "Quaseralith", "Qrl", false);
    public static final Element Sol = add(184, 383 , -1, null, "Solitum", "Sol", false);
    public static final Element Akw = add(185, 386 , -1, null, "Akwaibomium", "Akw", false);
    public static final Element Nbn = add(186, 373 , -1, null, "Nebulonite", "Nbn", false);
    public static final Element Mas = add(187, 383 , -1, null, "Massatron", "Mas", false);
    public static final Element Srp = add(188, 367 , -1, null, "Seraphon", "Srp", false);
    public static final Element Oxy = add(189, 376 , -1, null, "Oxydinium", "Oxy", false);
    public static final Element Qrk = add(190, 374 , -1, null, "Quarkosium", "Qrk", false);
    public static final Element Lag = add(191, 375 , -1, null, "Lagossium", "Lag", false);
    public static final Element Qus = add(192, 377 , -1, null, "Quandrius", "Qus", false);
    public static final Element Nvt = add(193, 383 , -1, null, "Novatronium", "Nvt", false);
    public static final Element Omx = add(194, 385 , -1, null, "Ombralex", "Omx", false);
    public static final Element Ins = add(195, 385 , -1, null, "Insanae", "Ins", false);
    public static final Element Sid = add(196, 391 , -1, null, "Sindrax", "Sid", false);
    public static final Element Fes = add(197, 516 , -1, null, "Fendasium", "Fes", false);
    public static final Element Gx = add(198, 383 , -1, null, "Galaxium", "Gx", false);
    public static final Element Cop = add(199, 391 , -1, null, "Copium", "Cop", false);
    public static final Element Hy = add(200, 400 , -1, null, "Hyperion", "Hy", false);

    public static Element add(long protons, long neutrons, long halfLifeSeconds, String decayTo, String name, String symbol, boolean isIsotope) {
        Element element = new Element(protons, neutrons, halfLifeSeconds, decayTo, name, symbol, isIsotope);
        elements.put(name, element);
        return element;
    }


    public static List<Element> getAllElements() {
        return Collections.unmodifiableList(new ArrayList<>(elements.values()));
    }

    public static Element[] getAllElementsCT() {
        return elements.values().toArray(new Element[0]);
    }

    public static Element get(String name) {
        return elements.get(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name));
    }
}