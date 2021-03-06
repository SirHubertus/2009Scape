package plugin.shops;

import core.game.content.ItemNames;
import core.game.content.global.shop.Shop;
import core.game.node.item.Item;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ceik
 */
//if no items are listed, it uses the default GENERAL_STORE item list in Shop.java
public enum Shops{
    EDGEVILLE_GENERAL(new Shop("Edgeville General Store",true,ItemNames.COINS,false),new int[]{528,529}),
    ALKHARID_GENERAL(new Shop("Al-Kharid General Store",true,ItemNames.COINS,false),new int[]{525,524}),
    VOID_GENERAL(new Shop("Void Knight General Store",true,ItemNames.COINS,false),new int[]{3799}),
    IFABA_GENERAL(new Shop("Ifaba's General Store",true,ItemNames.COINS,false),new int[]{1436}),
    KORTAN_GENERAL(new Shop("Kortan General Store",true,ItemNames.COINS,false),new int[]{591}),
    WEST_ARD_GENERAL(new Shop("West Ardougne General Store",true,ItemNames.COINS,true),new int[]{971}),
    BURTH_SUPPLIES(new Shop("Burthorpe Supplies",true,ItemNames.COINS,false),new int[]{1083}),
    DWARVEN(new Shop("Dwarven shopping store",true,ItemNames.COINS,false),new int[]{582}),
    ARHEIN(new Shop("Arhein Store",true,ItemNames.COINS,false),new int[]{563}),
    FALADOR(new Shop("Falador General Store",true,ItemNames.COINS,false),new int[]{526,527}),
    DAL_GEN(new Shop("Dal's General Ogre Supplies",true,ItemNames.COINS,false),new int[]{873}),
    KARAMJA(new Shop("Karamja General Store",true,ItemNames.COINS,false),new int[]{532,533}),
    LUMBRIDGE_GENERAL(new Shop("Lumbridge General Store",true,ItemNames.COINS,false),new int[]{520,521}),
    GUNSLIK(new Shop("Gunslik's Assorted Items",true,ItemNames.COINS,false),new int[]{2154}),
    LIGHTHOUSE_STORE(new Shop("The Lighthouse Store",true,ItemNames.COINS,false),new int[]{1334}),
    LLETYA(new Shop("Lletya General Store",true,ItemNames.COINS,false),new int[]{2352}),
    MOON_CLAN(new Shop("Moon Clan General Store",true,ItemNames.COINS,false),new int[]{4516}),
    MISCELL(new Shop("Miscellanian General Store",true,ItemNames.COINS,false),new int[]{3922}),
    RAZMIRE(new Shop("Razmire General Store",true,ItemNames.COINS,false),new int[]{1254}),
    NARDAH(new Shop("Nardah General Store",true,ItemNames.COINS,false),new int[]{2086}),
    POLLNIV(new Shop("Pollnivneach General Store",true,ItemNames.COINS,false),new int[]{1866}),
    KHAZ(new Shop("Khazard General Store",true,ItemNames.COINS,false),new int[]{-1}),
    PHAS(new Shop("Port Phasmatys General Store",true,ItemNames.COINS,false),new int[]{1699}),
    RIMM(new Shop("Rimmington General Store",true,ItemNames.COINS,false),new int[]{530,531}),
    OBLI(new Shop("Obli's General Store",true,ItemNames.COINS,false),new int[]{516}),
    BOLKOY(new Shop("Bolkoy's Village Shop",true,ItemNames.COINS,false),new int[]{471}),
    VARROCK(new Shop("Varrock General Store",true,ItemNames.COINS,false),new int[]{522,523}),
    ZANARIS(new Shop("Zanaris General Store",true,ItemNames.COINS,false),new int[]{534}),
    JAMILA(new Shop("Jamila's Craft Stall",new Item[]{
            new Item(ItemNames.CHISEL_1755,10),
            new Item(ItemNames.RING_MOULD_1592,10),
            new Item(ItemNames.NECKLACE_MOULD_1597,10),
            new Item(ItemNames.AMULET_MOULD_1595,10),
            new Item(ItemNames.NEEDLE_1733,10),
            new Item(ItemNames.THREAD,1000),
            new Item(ItemNames.HOLY_MOULD_1599,10),
            new Item(ItemNames.SICKLE_MOULD_2976,10),
            new Item(ItemNames.TIARA_MOULD_5523,10),
            new Item(ItemNames.BOLT_MOULD_9434,10),
            new Item(ItemNames.BRACELET_MOULD_11065,10)
    },false,ItemNames.COINS,false),new int[]{5268}),
    ROMMIK(new Shop("Rommik's Crafty Supplies",new Item[]{
            new Item(ItemNames.CHISEL_1755,10),
            new Item(ItemNames.RING_MOULD_1592,10),
            new Item(ItemNames.NECKLACE_MOULD_1597,10),
            new Item(ItemNames.AMULET_MOULD_1595,10),
            new Item(ItemNames.NEEDLE_1733,10),
            new Item(ItemNames.THREAD,1000),
            new Item(ItemNames.HOLY_MOULD_1599,10),
            new Item(ItemNames.SICKLE_MOULD_2976,10),
            new Item(ItemNames.TIARA_MOULD_5523,10),
            new Item(ItemNames.BOLT_MOULD_9434,10),
            new Item(ItemNames.BRACELET_MOULD_11065,10)
    },false,ItemNames.COINS,false),new int[]{585}),
    DOMMIK(new Shop("Dommik's Crafting Store",new Item[]{
            new Item(ItemNames.CHISEL_1755,10),
            new Item(ItemNames.RING_MOULD_1592,10),
            new Item(ItemNames.NECKLACE_MOULD_1597,10),
            new Item(ItemNames.AMULET_MOULD_1595,10),
            new Item(ItemNames.NEEDLE_1733,10),
            new Item(ItemNames.THREAD,1000),
            new Item(ItemNames.HOLY_MOULD_1599,10),
            new Item(ItemNames.SICKLE_MOULD_2976,10),
            new Item(ItemNames.TIARA_MOULD_5523,10),
            new Item(ItemNames.BOLT_MOULD_9434,10),
            new Item(ItemNames.BRACELET_MOULD_11065,10)
    },false,ItemNames.COINS,false),new int[]{545}),
    FRENITA(new Shop("Frenita's Cookery Shop",new Item[]{
            new Item(ItemNames.PIE_DISH_2313,10),
            new Item(ItemNames.COOKING_APPLE_1955,0),
            new Item(ItemNames.CAKE_TIN_1887,10),
            new Item(ItemNames.BOWL_1923,10),
            new Item(ItemNames.POTATO_1942,10),
            new Item(ItemNames.TINDERBOX,10),
            new Item(ItemNames.JUG_1935,10),
            new Item(ItemNames.POT_1931,30),
            new Item(ItemNames.CHOCOLATE_BAR_1973,10),
            new Item(ItemNames.POT_OF_FLOUR,500),
            new Item(ItemNames.EMPTY_CUP_1980,10),
    },false,ItemNames.COINS,false),new int[]{593}),
    HUDO(new Shop("Grand Tree Groceries",new Item[]{
            new Item(ItemNames.GIANNE_DOUGH_2171,10),
            new Item(ItemNames.EQUA_LEAVES_2128,10),
            new Item(ItemNames.POT_OF_FLOUR,10),
            new Item(ItemNames.GNOME_SPICE_2169,10),
            new Item(ItemNames.ONION_1957,10),
            new Item(ItemNames.POTATO_1942,10),
            new Item(ItemNames.CABBAGE,10),
            new Item(ItemNames.TOMATO,10),
            new Item(ItemNames.CHEESE_1985,10),
            new Item(ItemNames.LIME_2120,10),
            new Item(ItemNames.ORANGE_2108,10),
            new Item(ItemNames.LEMON_2102,10),
            new Item(ItemNames.PINEAPPLE,10),
            new Item(ItemNames.DWELLBERRIES_2126,10),
            new Item(ItemNames.COCKTAIL_SHAKER_2025,10),
            new Item(ItemNames.SPIDER_ON_STICK_6297,10),
            new Item(ItemNames.SPIDER_ON_SHAFT_6299,10),
            new Item(ItemNames.CHOCOLATE_BAR_1973,10),
            new Item(ItemNames.CHOCOLATE_DUST_1975,10),
            new Item(ItemNames.POT_OF_CREAM_2130,10),
            new Item(ItemNames.BUCKET_OF_MILK_1927,10),
            new Item(ItemNames.KNIFE,10),
            new Item(ItemNames.GIANNES_COOK_BOOK_2167,10),
            new Item(ItemNames.BATTA_TIN_2164,10),
            new Item(ItemNames.CRUNCHY_TRAY_2165,10),
            new Item(ItemNames.GNOMEBOWL_MOULD_2166,10)
    },false,ItemNames.COINS,false),new int[]{600}),
    VERMUNDI(new Shop("Vermundis Clothes Stall",new Item[]{
            new Item(ItemNames.SKIRT_5048,10),
            new Item(ItemNames.TROUSERS_5036,10),
            new Item(ItemNames.SHORTS_5042,10),
            new Item(ItemNames.WOVEN_TOP_5024,10),
            new Item(ItemNames.SHIRT_5030,10),
            new Item(ItemNames.SILK_950,10),
    },false,ItemNames.COINS,false),new int[]{2162}),
    AGMUNDI(new Shop("Agmundi Quality Clothes",new Item[]{
            new Item(ItemNames.SKIRT_5050,10),
            new Item(ItemNames.SKIRT_5052,10),
            new Item(ItemNames.TROUSERS_5038,10),
            new Item(ItemNames.TROUSERS_5040,10),
            new Item(ItemNames.SHORTS_5044,10),
            new Item(ItemNames.SHORTS_5046,10),
            new Item(ItemNames.WOVEN_TOP_5026,10),
            new Item(ItemNames.WOVEN_TOP_5028,10),
            new Item(ItemNames.SHIRT_5032,10),
            new Item(ItemNames.SHIRT_5034,10)
    },false,ItemNames.COINS,false),new int[]{2161}),
    DODGY_MIKE(new Shop("Dodgy Mike's Second Hand Clothing",new Item[]{
            new Item(ItemNames.PIRATE_BOOTS_7114,15),
            new Item(ItemNames.STRIPY_PIRATE_SHIRT_7110,10),
            new Item(ItemNames.PIRATE_BANDANA_7112,20),
            new Item(ItemNames.PIRATE_LEGGINGS_7116,10),
            new Item(ItemNames.STRIPY_PIRATE_SHIRT_7122,10),
            new Item(ItemNames.PIRATE_BANDANA_7124,20),
            new Item(ItemNames.PIRATE_LEGGINGS_7126,10),
            new Item(ItemNames.STRIPY_PIRATE_SHIRT_7128,10),
            new Item(ItemNames.PIRATE_BANDANA_7130,20),
            new Item(ItemNames.PIRATE_LEGGINGS_7132,10),
            new Item(ItemNames.STRIPY_PIRATE_SHIRT_7134,10),
            new Item(ItemNames.PIRATE_BANDANA_7136,20),
            new Item(ItemNames.PIRATE_LEGGINGS_7138,10)
    },false,ItemNames.COINS,false),new int[]{3166}),
    LLETYA_SEAMSTRESS(new Shop("Lletya Seamstress",new Item[]{
            new Item(ItemNames.THREAD,8),
            new Item(ItemNames.NEEDLE_1733,3),
            new Item(ItemNames.BALL_OF_WOOL_1759,5),
            new Item(ItemNames.RED_DYE_1763,10),
            new Item(ItemNames.YELLOW_DYE_1765,10),
            new Item(ItemNames.BLUE_DYE_1767,10),
            new Item(ItemNames.ORANGE_DYE_1769,10),
            new Item(ItemNames.GREEN_DYE_1771,10),
            new Item(ItemNames.PURPLE_DYE_1773,10)
    },false,ItemNames.COINS,false),new int[]{2353}),
    BARKER_HABER(new Shop("Barker's Haberdashery",new Item[]{
            new Item(ItemNames.GREY_BOOTS_2894,5),
            new Item(ItemNames.GREY_ROBE_TOP_2896,5),
            new Item(ItemNames.GREY_ROBE_BOTTOMS_2898,5),
            new Item(ItemNames.GREY_HAT_2900,5),
            new Item(ItemNames.GREY_GLOVES_2902,5),
            new Item(ItemNames.RED_BOOTS_2904,5),
            new Item(ItemNames.RED_ROBE_TOP_2906,5),
            new Item(ItemNames.RED_ROBE_BOTTOMS_2908,5),
            new Item(ItemNames.RED_HAT_2910,5),
            new Item(ItemNames.RED_GLOVES_2912,5),
            new Item(ItemNames.YELLOW_BOOTS_2914,5),
            new Item(ItemNames.YELLOW_ROBE_TOP_2916,5),
            new Item(ItemNames.YELLOW_ROBE_BOTTOMS_2918,5),
            new Item(ItemNames.YELLOW_HAT_2920,5),
            new Item(ItemNames.YELLOW_GLOVES_2922,5),
            new Item(ItemNames.TEAL_BOOTS_2924,5),
            new Item(ItemNames.TEAL_ROBE_TOP_2926,5),
            new Item(ItemNames.TEAL_ROBE_BOTTOMS_2928,5),
            new Item(ItemNames.TEAL_HAT_2930,5),
            new Item(ItemNames.TEAL_GLOVES_2932,5),
            new Item(ItemNames.PURPLE_BOOTS_2934,5),
            new Item(ItemNames.PURPLE_ROBE_TOP_2936,5),
            new Item(ItemNames.PURPLE_ROBE_BOTTOMS_2938,5),
            new Item(ItemNames.PURPLE_HAT_2940,5),
            new Item(ItemNames.PURPLE_GLOVES_2942,5),
            new Item(ItemNames.RED_CAPE,5),
            new Item(ItemNames.BLACK_CAPE,5),
            new Item(ItemNames.BLUE_CAPE,5),
            new Item(ItemNames.YELLOW_CAPE,5),
            new Item(ItemNames.GREEN_CAPE_1027,5)
    },false,ItemNames.COINS,false),new int[]{1039}),
    ACCOUTREMENTS(new Shop("Yrsa's Accoutrements",new Item[]{
            new Item(ItemNames.FREMENNIK_BLUE_SHIRT_3775,5),
            new Item(ItemNames.FREMENNIK_RED_SHIRT_3773,5),
            new Item(ItemNames.FREMENNIK_BROWN_SHIRT_3767,5),
            new Item(ItemNames.FREMENNIK_GREY_SHIRT_3769,5),
            new Item(ItemNames.FREMENNIK_BEIGE_SHIRT_3771,5),
            new Item(ItemNames.FREMENNIK_ROBE_3793,5),
            new Item(ItemNames.FREMENNIK_SKIRT_3795,5),
            new Item(ItemNames.FREMENNIK_HAT_3797,5),
            new Item(ItemNames.FREMENNIK_BOOTS_3791,5),
            new Item(ItemNames.FREMENNIK_GLOVES_3799,5),
            new Item(ItemNames.FREMENNIK_GREEN_CLOAK_3765,5),
            new Item(ItemNames.FREMENNIK_BLUE_CLOAK_3763,5),
            new Item(ItemNames.FREMENNIK_BROWN_CLOAK_3761,5),
            new Item(ItemNames.FREMENNIK_CYAN_CLOAK_3759,5),
            new Item(ItemNames.FREMENNIK_RED_CLOAK_3777,5),
            new Item(ItemNames.FREMENNIK_GREY_CLOAK_3779,5),
            new Item(ItemNames.FREMENNIK_YELLOW_CLOAK_3781,5),
            new Item(ItemNames.FREMENNIK_TEAL_CLOAK_3783,5),
            new Item(ItemNames.FREMENNIK_PURPLE_CLOAK_3785,5),
            new Item(ItemNames.FREMENNIK_PINK_CLOAK_3787),
            new Item(ItemNames.FREMENNIK_BLACK_CLOAK_3789,5)
    },false,ItemNames.COINS,false),new int[]{1301}),
    FINE_FASHIONS(new Shop("Fine Fashions",new Item[]{
            new Item(ItemNames.PINK_HAT_656,5),
            new Item(ItemNames.GREEN_HAT_658,5),
            new Item(ItemNames.BLUE_HAT_660,5),
            new Item(ItemNames.CREAM_HAT_662,5),
            new Item(ItemNames.TURQUOISE_HAT_664,5),
            new Item(ItemNames.PINK_ROBE_TOP_636,5),
            new Item(ItemNames.GREEN_ROBE_TOP_638,5),
            new Item(ItemNames.BLUE_ROBE_TOP_640,5),
            new Item(ItemNames.CREAM_ROBE_TOP_642,5),
            new Item(ItemNames.TURQUOISE_ROBE_TOP_644,5),
            new Item(ItemNames.PINK_ROBE_BOTTOMS_646,5),
            new Item(ItemNames.GREEN_ROBE_BOTTOMS_648,5),
            new Item(ItemNames.BLUE_ROBE_BOTTOMS_650,5),
            new Item(ItemNames.CREAM_ROBE_BOTTOMS_652,5),
            new Item(ItemNames.TURQUOISE_ROBE_BOTTOMS_654,5),
            new Item(ItemNames.PINK_BOOTS_626,5),
            new Item(ItemNames.GREEN_BOOTS_628,5),
            new Item(ItemNames.BLUE_BOOTS_630,5),
            new Item(ItemNames.CREAM_BOOTS_632,5),
            new Item(ItemNames.TURQUOISE_BOOTS_634,5)
    },false,ItemNames.COINS,false),new int[]{601}),
    THESSALIA(new Shop("Thessalia's Fine Clothes",new Item[]{
            new Item(ItemNames.WHITE_APRON,3),
            new Item(ItemNames.LEATHER_BODY,12),
            new Item(ItemNames.LEATHER_GLOVES,10),
            new Item(ItemNames.LEATHER_BOOTS,10),
            new Item(ItemNames.BROWN_APRON_1757,1),
            new Item(ItemNames.PINK_SKIRT,5),
            new Item(ItemNames.BLACK_SKIRT,3),
            new Item(ItemNames.BLUE_SKIRT,2),
            new Item(ItemNames.RED_CAPE,4),
            new Item(ItemNames.SILK_950,5),
            new Item(ItemNames.PRIEST_GOWN_428,3),
            new Item(ItemNames.PRIEST_GOWN_426,3)
    },false,ItemNames.COINS,false),new int[]{548}),
    FANCY_CLOTHES(new Shop("Fancy Clothes Store",new Item[]{
            new Item(ItemNames.CHEFS_HAT,0),
            new Item(ItemNames.BLUE_WIZARD_HAT,3),
            new Item(ItemNames.YELLOW_CAPE,1),
            new Item(ItemNames.GREY_WOLF_FUR_958,3),
            new Item(ItemNames.BEAR_FUR_948,3),
            new Item(ItemNames.NEEDLE_1733,3),
            new Item(ItemNames.THREAD,100),
            new Item(ItemNames.LEATHER_GLOVES,10),
            new Item(ItemNames.LEATHER_BOOTS,10),
            new Item(ItemNames.PRIEST_GOWN_426,3),
            new Item(ItemNames.PRIEST_GOWN_428,3),
            new Item(ItemNames.BROWN_APRON_1757,1),
            new Item(ItemNames.PINK_SKIRT,5),
            new Item(ItemNames.BLACK_SKIRT,3),
            new Item(ItemNames.BLUE_SKIRT,2),
            new Item(ItemNames.RED_CAPE,4),
            new Item(ItemNames.RIGHT_EYE_PATCH_1025,3),
            new Item(ItemNames.RED_FEATHER_10088,0),
            new Item(ItemNames.YELLOW_FEATHER_10090,0),
            new Item(ItemNames.BLUE_FEATHER_10089,0),
            new Item(ItemNames.STRIPY_FEATHER_10087,0)
    },false,ItemNames.COINS,false),new int[]{554}),
    CHAIN(new Shop("Chainmail Shop",new Item[]{
            new Item(ItemNames.BRONZE_CHAINBODY,3),
            new Item(ItemNames.IRON_CHAINBODY,2),
            new Item(ItemNames.STEEL_CHAINBODY,1),
            new Item(ItemNames.BLACK_CHAINBODY,1),
            new Item(ItemNames.MITHRIL_CHAINBODY,1),
            new Item(ItemNames.ADAMANT_CHAINBODY,1)
    },false,ItemNames.COINS,false),new int[]{}),
    CANDLE(new Shop("Candle Shop",new Item[]{
            new Item(ItemNames.CANDLE_36,10)
    },false,ItemNames.COINS,false),new int[]{562}),
    BRIAN(new Shop("Brian's Battleaxe Bazaar",new Item[]{
            new Item(ItemNames.BRONZE_BATTLEAXE,4),
            new Item(ItemNames.IRON_BATTLEAXE,3),
            new Item(ItemNames.STEEL_BATTLEAXE,2),
            new Item(ItemNames.BLACK_BATTLEAXE,1),
            new Item(ItemNames.MITHRIL_BATTLEAXE,1),
            new Item(ItemNames.ADAMANT_BATTLEAXE,1)
    },false,ItemNames.COINS,false),new int[]{559}),
    BOB(new Shop("Bob's Brilliant Axes",new Item[]{
            new Item(ItemNames.BRONZE_PICKAXE,5),
            new Item(ItemNames.BRONZE_AXE,10),
            new Item(ItemNames.IRON_AXE,5),
            new Item(ItemNames.STEEL_AXE,3),
            new Item(ItemNames.IRON_BATTLEAXE,5),
            new Item(ItemNames.STEEL_BATTLEAXE,2),
            new Item(ItemNames.MITHRIL_BATTLEAXE,1)
    },false,ItemNames.COINS,false),new int[]{519}),
    CROSSBOW(new Shop("Crossbow Shop",new Item[]{
            new Item(ItemNames.WOODEN_STOCK_9440,5),
            new Item(ItemNames.OAK_STOCK_9442,5),
            new Item(ItemNames.WILLOW_STOCK_9444,5),
            new Item(ItemNames.TEAK_STOCK_9446,5),
            new Item(ItemNames.MAPLE_STOCK_9448,5),
            new Item(ItemNames.MAHOGANY_STOCK_9450,5),
            new Item(ItemNames.YEW_STOCK_9452,0),
            new Item(ItemNames.BRONZE_LIMBS_9420,5),
            new Item(ItemNames.IRON_LIMBS_9423,5),
            new Item(ItemNames.STEEL_LIMBS_9425,5),
            new Item(ItemNames.MITHRIL_LIMBS_9427,5),
            new Item(ItemNames.ADAMANTITE_LIMBS_9429,5),
            new Item(ItemNames.RUNITE_LIMBS,0),
            new Item(ItemNames.BRONZE_CROSSBOW_9174,0),
            new Item(ItemNames.IRON_CROSSBOW_9177,0),
            new Item(ItemNames.STEEL_CROSSBOW_9179,0),
            new Item(ItemNames.MITH_CROSSBOW_9181,0),
            new Item(ItemNames.ADAMANT_CROSSBOW_9183,0),
            new Item(ItemNames.RUNE_CROSSBOW_9185,0)
    },false,ItemNames.COINS,false),new int[]{4563,4558,4559}),
    AARON(new Shop("Aaron's Archery Apppendages",new Item[]{
            new Item(ItemNames.LEATHER_BODY,10),
            new Item(ItemNames.HARDLEATHER_BODY,10),
            new Item(ItemNames.STUDDED_BODY,10),
            new Item(ItemNames.LEATHER_CHAPS,20),
            new Item(ItemNames.STUDDED_CHAPS,15),
            new Item(ItemNames.COIF_1169,10),
            new Item(ItemNames.LEATHER_COWL_1167,10),
            new Item(ItemNames.LEATHER_VAMBRACES,10)
    },false,ItemNames.COINS,false),new int[]{682}),
    DARGAUDS(new Shop("Dargaud's Bows and Arrows",new Item[]{
            new Item(ItemNames.ARROW_SHAFT_52,1000),
            new Item(ItemNames.BRONZE_ARROWTIPS_39,500),
            new Item(ItemNames.IRON_ARROWTIPS_40,400),
            new Item(ItemNames.STEEL_ARROWTIPS_41,300),
            new Item(ItemNames.MITHRIL_ARROWTIPS_42,200),
            new Item(ItemNames.ADAMANT_ARROWTIPS_43,200),
            new Item(ItemNames.RUNE_ARROWTIPS_44,150),
            new Item(ItemNames.BRONZE_ARROW,1000),
            new Item(ItemNames.IRON_ARROW,500),
            new Item(ItemNames.STEEL_ARROW,500),
            new Item(ItemNames.MITHRIL_ARROW,500),
            new Item(ItemNames.ADAMANT_ARROW,450),
            new Item(ItemNames.RUNE_ARROW,400),
            new Item(ItemNames.SHORTBOW_841,20),
            new Item(ItemNames.OAK_SHORTBOW_843,20),
            new Item(ItemNames.WILLOW_SHORTBOW_849,20),
            new Item(ItemNames.LONGBOW_839,20),
            new Item(ItemNames.OAK_LONGBOW_845,20),
            new Item(ItemNames.COMP_OGRE_BOW_4827,0),
            new Item(ItemNames.WILLOW_LONGBOW_847,10)
    },false,ItemNames.COINS,false),new int[]{683}),
    HICKTON_ARCHERY(new Shop("Hickton's Archery Emporium",new Item[]{
            new Item(ItemNames.BRONZE_BOLTS,200),
            new Item(ItemNames.BRONZE_ARROW,1000),
            new Item(ItemNames.IRON_ARROW,800),
            new Item(ItemNames.STEEL_ARROW,0),
            new Item(ItemNames.MITHRIL_ARROW,0),
            new Item(ItemNames.ADAMANT_ARROW,0),
            new Item(ItemNames.RUNE_ARROW,0),
            new Item(ItemNames.BRONZE_ARROWTIPS_39,1000),
            new Item(ItemNames.IRON_ARROWTIPS_40,800),
            new Item(ItemNames.STEEL_ARROWTIPS_41,600),
            new Item(ItemNames.MITHRIL_ARROWTIPS_42,400),
            new Item(ItemNames.ADAMANT_ARROWTIPS_43,200),
            new Item(ItemNames.RUNE_ARROWTIPS_44,100),
            new Item(ItemNames.SHORTBOW_841,4),
            new Item(ItemNames.LONGBOW_839,2),
            new Item(ItemNames.CROSSBOW_837,2),
            new Item(ItemNames.OAK_SHORTBOW_843,4),
            new Item(ItemNames.OAK_LONGBOW_845,4),
            new Item(ItemNames.COMP_OGRE_BOW_4827,0),
            new Item(ItemNames.STUDDED_BODY,2),
            new Item(ItemNames.STUDDED_CHAPS,2)
    },true,ItemNames.COINS,false),new int[]{575}),
    LOWE_ARCHERY(new Shop("Lowe's Archery Emporium",new Item[]{
            new Item(ItemNames.BRONZE_ARROW,2000),
            new Item(ItemNames.IRON_ARROW,1500),
            new Item(ItemNames.STEEL_ARROW,1000),
            new Item(ItemNames.MITHRIL_ARROW,800),
            new Item(ItemNames.ADAMANT_ARROW,600),
            new Item(ItemNames.BRONZE_BOLTS,1500),
            new Item(ItemNames.SHORTBOW_841,4),
            new Item(ItemNames.LONGBOW_839,4),
            new Item(ItemNames.OAK_SHORTBOW_843,3),
            new Item(ItemNames.OAK_LONGBOW_845,3),
            new Item(ItemNames.WILLOW_SHORTBOW_849,2),
            new Item(ItemNames.WILLOW_LONGBOW_847,2),
            new Item(ItemNames.MAPLE_SHORTBOW_853,1),
            new Item(ItemNames.MAPLE_LONGBOW_851,1),
            new Item(ItemNames.CROSSBOW_837,1)
    },false,ItemNames.COINS,false),new int[]{550}),
    BRIAN_ARCHERY(new Shop("Brian's Archery Supplies",new Item[]{
            new Item(ItemNames.STEEL_ARROW,1500),
            new Item(ItemNames.MITHRIL_ARROW,1000),
            new Item(ItemNames.ADAMANT_ARROW,800),
            new Item(ItemNames.OAK_SHORTBOW_843,4),
            new Item(ItemNames.OAK_LONGBOW_845,4),
            new Item(ItemNames.WILLOW_SHORTBOW_849,3),
            new Item(ItemNames.WILLOW_LONGBOW_847,3),
            new Item(ItemNames.MAPLE_SHORTBOW_853,2),
            new Item(ItemNames.MAPLE_LONGBOW_851,2)
    },false,ItemNames.COINS,false),new int[]{1860}),
    VOID_ARCHERY(new Shop("Void Knight Archery Store",new Item[]{
            new Item(ItemNames.BRONZE_JAVELIN,10),
            new Item(ItemNames.IRON_JAVELIN,10),
            new Item(ItemNames.STEEL_JAVELIN,10),
            new Item(ItemNames.MITHRIL_JAVELIN,5),
            new Item(ItemNames.ADAMANT_JAVELIN,5),
            new Item(ItemNames.RUNE_JAVELIN,5),
            new Item(ItemNames.BRONZE_ARROWTIPS_39,10),
            new Item(ItemNames.IRON_ARROWTIPS_40,10),
            new Item(ItemNames.STEEL_ARROWTIPS_41,10),
            new Item(ItemNames.MITHRIL_ARROWTIPS_42,5),
            new Item(ItemNames.ADAMANT_ARROWTIPS_43,5),
            new Item(ItemNames.RUNE_ARROWTIPS_44,5)
    },false,ItemNames.COINS,false),new int[]{3796}),
    LLETYA_ARCHERY(new Shop("Lletya Archery Shop",new Item[]{
            new Item(ItemNames.IRON_ARROW,2000),
            new Item(ItemNames.STEEL_ARROW,500),
            new Item(ItemNames.MITHRIL_ARROW,500),
            new Item(ItemNames.ADAMANT_ARROW,450),
            new Item(ItemNames.RUNE_ARROW,400),
            new Item(ItemNames.BRONZE_BOLTS,1500),
            new Item(ItemNames.OAK_SHORTBOW_843,5),
            new Item(ItemNames.OAK_LONGBOW_845,5),
            new Item(ItemNames.CROSSBOW_837,5),
            new Item(ItemNames.WILLOW_SHORTBOW_849,5),
            new Item(ItemNames.WILLOW_LONGBOW_847,5)
    },false,ItemNames.COINS,false),new int[]{2356}),
    DAVON(new Shop("Davon's Amulet Store",new Item[]{
            new Item(ItemNames.HOLY_SYMBOL_1718,0),
            new Item(ItemNames.AMULET_OF_MAGIC_1727,0),
            new Item(ItemNames.AMULET_OF_DEFENCE_1729,0),
            new Item(ItemNames.AMULET_OF_STRENGTH_1725,0),
            new Item(ItemNames.AMULET_OF_POWER,0)
    },false,ItemNames.COINS,false),new int[]{588}),
    STAN(new Shop("Trader Stan's Trading Post",new Item[]{
            new Item(ItemNames.POT_1931,5),
            new Item(ItemNames.JUG_1935,2),
            new Item(ItemNames.SHEARS_1735,2),
            new Item(ItemNames.BUCKET_1925,3),
            new Item(ItemNames.BOWL_1923,2),
            new Item(ItemNames.CAKE_TIN_1887,2),
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.CHISEL_1755,2),
            new Item(ItemNames.HAMMER,5),
            new Item(ItemNames.NEWCOMER_MAP_550,5),
            new Item(ItemNames.SECURITY_BOOK_9003,5),
            new Item(ItemNames.ROPE_954,2),
            new Item(ItemNames.KNIFE,2),
            new Item(ItemNames.PINEAPPLE,15),
            new Item(ItemNames.BANANA,15),
            new Item(ItemNames.ORANGE_2108,10),
            new Item(ItemNames.BUCKET_OF_SLIME_4286,10),
            new Item(ItemNames.GLASSBLOWING_PIPE_1785,15),
            new Item(ItemNames.BUCKET_OF_SAND_1783,10),
            new Item(ItemNames.SEAWEED,20),
            new Item(ItemNames.SODA_ASH_1781,10),
            new Item(ItemNames.LOBSTER_POT_301,20),
            new Item(ItemNames.FISHING_ROD_307,20),
            new Item(ItemNames.SWAMP_PASTE_1941,30),
            new Item(ItemNames.TYRAS_HELM_9629,25),
            new Item(ItemNames.RAW_RABBIT_3226,20),
            new Item(ItemNames.RIGHT_EYE_PATCH_1025,5)
    },false,ItemNames.COINS,false),new int[]{4651,4652,4653,4654,4655,4656,4650}),
    QUARTERMASTER(new Shop("Quartermaster's Stores",new Item[]{
            new Item(ItemNames.POT_1931,5),
            new Item(ItemNames.JUG_1935,2),
            new Item(ItemNames.SHEARS_1735,3),
            new Item(ItemNames.TINDERBOX,3),
            new Item(ItemNames.BREAD,10),
            new Item(ItemNames.BRONZE_HALBERD_3190,10),
            new Item(ItemNames.IRON_HALBERD_3192,10),
            new Item(ItemNames.STEEL_HALBERD_3194,10),
            new Item(ItemNames.BLACK_HALBERD_3196,10),
            new Item(ItemNames.MITHRIL_HALBERD_3198,7),
            new Item(ItemNames.ADAMANT_HALBERD_3200,7),
            new Item(ItemNames.RUNE_HALBERD_3202,7),
            new Item(ItemNames.DRAGON_HALBERD_3204,5)
    },true,ItemNames.COINS,false),new int[]{1208}),
    JIMINUA(new Shop("Jiminua's Jungle Store",new Item[]{
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.CANDLE_36,10),
            new Item(ItemNames.UNLIT_TORCH_596,10),
            new Item(ItemNames.POT_1931,3),
            new Item(ItemNames.ROPE_954,10),
            new Item(ItemNames.LEATHER_BODY,12),
            new Item(ItemNames.LEATHER_GLOVES,10),
            new Item(ItemNames.LEATHER_BOOTS,10),
            new Item(ItemNames.COOKED_MEAT,2),
            new Item(ItemNames.BREAD,10),
            new Item(ItemNames.VIAL,10),
            new Item(ItemNames.VIAL_OF_WATER,50),
            new Item(ItemNames.PESTLE_AND_MORTAR,3),
            new Item(ItemNames.ANTIPOISON3_175,10),
            new Item(ItemNames.PAPYRUS_970,50),
            new Item(ItemNames.CHARCOAL_973,50),
            new Item(ItemNames.KNIFE,2),
            new Item(ItemNames.HAMMER,10),
            new Item(ItemNames.MACHETE_975,50),
            new Item(ItemNames.CHISEL_1755,10),
            new Item(ItemNames.SPADE_952,10),
            new Item(ItemNames.BRONZE_AXE,2),
            new Item(ItemNames.BRONZE_PICKAXE,2),
            new Item(ItemNames.IRON_AXE,5),
            new Item(ItemNames.BRONZE_BAR,10),
            new Item(ItemNames.PURE_ESSENCE_7936,0)
    },false,ItemNames.COINS,false),new int[]{560}),
    SHANTAY(new Shop("Shantay Pass Shop",new Item[]{
            new Item(ItemNames.WATERSKIN4_1823,100),
            new Item(ItemNames.WATERSKIN0_1831,100),
            new Item(ItemNames.JUG_OF_WATER_1937,10),
            new Item(ItemNames.BOWL_OF_WATER_1921,10),
            new Item(ItemNames.BUCKET_OF_WATER_1929,10),
            new Item(ItemNames.KNIFE,10),
            new Item(ItemNames.DESERT_SHIRT_1833,10),
            new Item(ItemNames.DESERT_ROBE_1835,10),
            new Item(ItemNames.DESERT_BOOTS_1837,10),
            new Item(ItemNames.BRONZE_BAR,10),
            new Item(ItemNames.FEATHER,500),
            new Item(ItemNames.HAMMER,10),
            new Item(ItemNames.BUCKET_1925,0),
            new Item(ItemNames.BOWL_1923,0),
            new Item(ItemNames.JUG_1935,0),
            new Item(ItemNames.SHANTAY_PASS_1854,500),
            new Item(ItemNames.ROPE_954,20)
    },false,ItemNames.COINS,false),new int[]{836}),
    ARNOLD(new Shop("Arnold's Eclectic Supplies",new Item[]{
            new Item(ItemNames.SMALL_FISHING_NET_303,2),
            new Item(ItemNames.HARPOON_311,2),
            new Item(ItemNames.RAW_MONKFISH_7944,1),
            new Item(ItemNames.MONKFISH_7946,0),
            new Item(ItemNames.BREAD,1),
            new Item(ItemNames.POT_1931,4),
            new Item(ItemNames.BUCKET_OF_MILK_1927,1),
            new Item(ItemNames.NEEDLE_1733,3),
            new Item(ItemNames.THREAD,15),
            new Item(ItemNames.BEER,10),
            new Item(ItemNames.GLASSBLOWING_PIPE_1785,2),
            new Item(ItemNames.KNIFE,1)
    },false,ItemNames.COINS,false),new int[]{3824}),
    SVENS_BLACK_MARKET(new Shop("Trader Sven's Black Market Goods",new Item[]{
            new Item(ItemNames.CITIZEN_TOP_9640,10),
            new Item(ItemNames.CITIZEN_TROUSERS_9642,10),
            new Item(ItemNames.CITIZEN_SHOES_9644,10),
            new Item(ItemNames.VYREWATCH_TOP_9634,10),
            new Item(ItemNames.VYREWATCH_LEGS_9636,10),
            new Item(ItemNames.VYREWATCH_SHOES_9638,10)
    },false,ItemNames.COINS,false),new int[]{4716}),
    KARAMJA_WINES(new Shop("Karamja Wines, Spirits, and Beers",new Item[]{
            new Item(ItemNames.BEER,3),
            new Item(ItemNames.KARAMJAN_RUM_431,3),
            new Item(ItemNames.JUG_OF_WINE,1)
    },false,ItemNames.COINS,false),new int[]{568}),
    DORGESH(new Shop("Dorgersh-Kaan General Supplies",new Item[]{
            new Item(ItemNames.UNLIT_TORCH_596,5),
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.POT_1931,5),
            new Item(ItemNames.JUG_1935,2),
            new Item(ItemNames.BOWL_1923,2),
            new Item(ItemNames.CAKE_TIN_1887,2),
            new Item(ItemNames.ROPE_954,3),
            new Item(ItemNames.GLASSBLOWING_PIPE_1785,1)
    },true,ItemNames.COINS,false), new int[]{5798}),
    CANIFIS_GENERAL(new Shop("General Store",new Item[]{
            new Item(ItemNames.NEEDLE_1733,2),
            new Item(ItemNames.THREAD,50),
            new Item(ItemNames.POT_1931,3),
            new Item(ItemNames.BUCKET_1925,2),
            new Item(ItemNames.JUG_1935,2),
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.CHISEL_1755,2),
            new Item(ItemNames.HAMMER,5),
            new Item(ItemNames.SAMPLE_BOTTLE_3377,10),
            new Item(ItemNames.KNIFE,2)
            },true,ItemNames.COINS,false),new int[]{1040}),
    AUREL(new Shop("Aurel's Supplies",new Item[]{
            new Item(ItemNames.BRONZE_AXE,10),
            new Item(ItemNames.TINDERBOX,10),
            new Item(ItemNames.THIN_SNAIL_3363,10),
            new Item(ItemNames.RAW_MACKEREL_353,10)
    },false,ItemNames.COINS,false),new int[]{3541,7396}),
    AVAS(new Shop("Ava's Odds and Ends",new Item[]{
            new Item(ItemNames.FEATHER,1000),
            new Item(ItemNames.IRON_ARROW,40),
            new Item(ItemNames.STEEL_ARROW,10),
            new Item(ItemNames.IRON_ARROWTIPS_40,30),
            new Item(ItemNames.STEEL_ARROWTIPS_41,20)
    },false,ItemNames.COINS,false), new int[]{5198,5199}),
   BANDIT_BARGAINS(new Shop("Bandit Bargains",new Item[]{
            new Item(ItemNames.WATERSKIN4_1823,5),
            new Item(ItemNames.WATERSKIN0_1831,5),
            new Item(ItemNames.JUG_OF_WATER_1937,5),
            new Item(ItemNames.BOWL_OF_WATER_1921,5),
            new Item(ItemNames.BUCKET_OF_WATER_1929,5),
            new Item(ItemNames.JUG_1935,5),
            new Item(ItemNames.BOWL_1923,5),
            new Item(ItemNames.BUCKET_1925,5),
            new Item(ItemNames.DESERT_BOOTS_1837,5),
            new Item(ItemNames.DESERT_SHIRT_1833,5),
            new Item(ItemNames.DESERT_ROBE_1835,5),
            new Item(ItemNames.KNIFE,5)
    },false,ItemNames.COINS,false),new int[]{1917}),
    BANDIT_DUTY_FREE(new Shop("Bandit Duty Free",new Item[]{
            new Item(ItemNames.POT_1931,5),
            new Item(ItemNames.JUG_1935,2),
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.CHISEL_1755,2),
            new Item(ItemNames.HAMMER,5),
            new Item(ItemNames.BRONZE_PICKAXE,5),
            new Item(ItemNames.BRONZE_AXE,10)
    },true,ItemNames.COINS,true),new int[]{597}),
    AEMAD(new Shop("Aemad's Adventuring Supplies Store",new Item[]{
            new Item(ItemNames.VIAL_OF_WATER,500),
            new Item(ItemNames.BRONZE_PICKAXE,2),
            new Item(ItemNames.IRON_AXE,2),
            new Item(ItemNames.COOKED_MEAT,2),
            new Item(ItemNames.TINDERBOX,2),
            new Item(ItemNames.BALL_OF_WOOL_1759,30),
            new Item(ItemNames.BRONZE_ARROW,500),
            new Item(ItemNames.ROPE_954,20),
            new Item(ItemNames.PAPYRUS_970,50),
            new Item(ItemNames.KNIFE,2)
    },true,ItemNames.COINS,false),new int[]{590});


    public static HashMap<Integer,Shop> shopMap = new HashMap<>();

    static {
        Arrays.stream(Shops.values()).forEach(entry -> Arrays.stream(entry.npcs).forEach(id -> shopMap.putIfAbsent(id,entry.shop)));
    }

    private Shop shop;
    private int[] npcs;
    Shops(Shop shop, int[] npcs){
        this.shop = shop;
        this.npcs = npcs;
    }

    public static Shop forId(int id){
        return shopMap.get(id);
    }
}
