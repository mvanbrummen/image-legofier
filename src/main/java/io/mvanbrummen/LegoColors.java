package io.mvanbrummen;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static io.mvanbrummen.ColorUtil.hexToColor;

public class LegoColors {
    public static Map<String, Color> COLORS;

    static {
        COLORS = new HashMap<>();
        COLORS.put("Black", hexToColor("05131D"));
        COLORS.put("Blue", hexToColor("0055BF"));
        COLORS.put("Green", hexToColor("237841"));
        COLORS.put("Dark Turquoise", hexToColor("008F9B"));
        COLORS.put("Red", hexToColor("C91A09"));
        COLORS.put("Dark Pink", hexToColor("C870A0"));
        COLORS.put("Brown", hexToColor("583927"));
        COLORS.put("Light Gray", hexToColor("9BA19D"));
        COLORS.put("Dark Gray", hexToColor("6D6E5C"));
        COLORS.put("Light Blue", hexToColor("B4D2E3"));
        COLORS.put("Bright Green", hexToColor("4B9F4A"));
        COLORS.put("Light Turquoise", hexToColor("55A5AF"));
        COLORS.put("Salmon", hexToColor("F2705E"));
        COLORS.put("Pink", hexToColor("FC97AC"));
        COLORS.put("Yellow", hexToColor("F2CD37"));
        COLORS.put("White", hexToColor("FFFFFF"));
        COLORS.put("Light Green", hexToColor("C2DAB8"));
        COLORS.put("Light Yellow", hexToColor("FBE696"));
        COLORS.put("Tan", hexToColor("E4CD9E"));
        COLORS.put("Light Violet", hexToColor("C9CAE2"));
        COLORS.put("Glow In Dark Opaque", hexToColor("D4D5C9"));
        COLORS.put("Purple", hexToColor("81007B"));
        COLORS.put("Dark Blue-Violet", hexToColor("2032B0"));
        COLORS.put("Orange", hexToColor("FE8A18"));
        COLORS.put("Magenta", hexToColor("923978"));
        COLORS.put("Lime", hexToColor("BBE90B"));
        COLORS.put("Dark Tan", hexToColor("958A73"));
        COLORS.put("Bright Pink", hexToColor("E4ADC8"));
        COLORS.put("Medium Lavender", hexToColor("AC78BA"));
        COLORS.put("Lavender", hexToColor("E1D5ED"));
        COLORS.put("Trans-Black IR Lens", hexToColor("635F52"));
        COLORS.put("Trans-Dark Blue", hexToColor("0020A0"));
        COLORS.put("Trans-Green", hexToColor("84B68D"));
        COLORS.put("Trans-Bright Green", hexToColor("D9E4A7"));
        COLORS.put("Trans-Red", hexToColor("C91A09"));
        COLORS.put("Trans-Black", hexToColor("635F52"));
        COLORS.put("Trans-Light Blue", hexToColor("AEEFEC"));
        COLORS.put("Trans-Neon Green", hexToColor("F8F184"));
        COLORS.put("Trans-Very Lt Blue", hexToColor("C1DFF0"));
        COLORS.put("Trans-Dark Pink", hexToColor("DF6695"));
        COLORS.put("Trans-Yellow", hexToColor("F5CD2F"));
        COLORS.put("Trans-Clear", hexToColor("FCFCFC"));
        COLORS.put("Trans-Purple", hexToColor("A5A5CB"));
        COLORS.put("Trans-Neon Yellow", hexToColor("DAB000"));
        COLORS.put("Trans-Neon Orange", hexToColor("FF800D"));
        COLORS.put("Chrome Antique Brass", hexToColor("645A4C"));
        COLORS.put("Chrome Blue", hexToColor("6C96BF"));
        COLORS.put("Chrome Green", hexToColor("3CB371"));
        COLORS.put("Chrome Pink", hexToColor("AA4D8E"));
        COLORS.put("Chrome Black", hexToColor("1B2A34"));
        COLORS.put("Very Light Orange", hexToColor("F3CF9B"));
        COLORS.put("Light Purple", hexToColor("CD6298"));
        COLORS.put("Reddish Brown", hexToColor("582A12"));
        COLORS.put("Light Bluish Gray", hexToColor("A0A5A9"));
        COLORS.put("Dark Bluish Gray", hexToColor("6C6E68"));
        COLORS.put("Medium Blue", hexToColor("5A93DB"));
        COLORS.put("Medium Green", hexToColor("73DCA1"));
        COLORS.put("Speckle Black-Copper", hexToColor("05131D"));
        COLORS.put("Speckle DBGray-Silver", hexToColor("6C6E68"));
        COLORS.put("Light Pink", hexToColor("FECCCF"));
        COLORS.put("Light Flesh", hexToColor("F6D7B3"));
        COLORS.put("Milky White", hexToColor("FFFFFF"));
        COLORS.put("Metallic Silver", hexToColor("A5A9B4"));
        COLORS.put("Metallic Green", hexToColor("899B5F"));
        COLORS.put("Metallic Gold", hexToColor("DBAC34"));
        COLORS.put("Medium Dark Flesh", hexToColor("CC702A"));
        COLORS.put("Dark Purple", hexToColor("3F3691"));
        COLORS.put("Dark Flesh", hexToColor("7C503A"));
        COLORS.put("Royal Blue", hexToColor("4C61DB"));
        COLORS.put("Flesh", hexToColor("D09168"));
        COLORS.put("Light Salmon", hexToColor("FEBABD"));
        COLORS.put("Violet", hexToColor("4354A3"));
        COLORS.put("Blue-Violet", hexToColor("6874CA"));
        COLORS.put("Glitter Trans-Dark Pink", hexToColor("DF6695"));
        COLORS.put("Medium Lime", hexToColor("C7D23C"));
        COLORS.put("Glitter Trans-Clear", hexToColor("FFFFFF"));
        COLORS.put("Aqua", hexToColor("B3D7D1"));
        COLORS.put("Light Lime", hexToColor("D9E4A7"));
        COLORS.put("Light Orange", hexToColor("F9BA61"));
        COLORS.put("Glitter Trans-Purple", hexToColor("A5A5CB"));
        COLORS.put("Speckle Black-Silver", hexToColor("05131D"));
        COLORS.put("Speckle Black-Gold", hexToColor("05131D"));
        COLORS.put("Copper", hexToColor("AE7A59"));
        COLORS.put("Pearl Light Gray", hexToColor("9CA3A8"));
        COLORS.put("Metal Blue", hexToColor("7988A1"));
        COLORS.put("Pearl Light Gold", hexToColor("DCBC81"));
        COLORS.put("Trans-Medium Blue", hexToColor("CFE2F7"));
        COLORS.put("Pearl Dark Gray", hexToColor("575857"));
        COLORS.put("Pearl Very Light Gray", hexToColor("ABADAC"));
        COLORS.put("Very Light Bluish Gray", hexToColor("E6E3E0"));
        COLORS.put("Yellowish Green", hexToColor("DFEEA5"));
        COLORS.put("Flat Dark Gold", hexToColor("B48455"));
        COLORS.put("Flat Silver", hexToColor("898788"));
        COLORS.put("Trans-Orange", hexToColor("F08F1C"));
        COLORS.put("Pearl White", hexToColor("F2F3F2"));
        COLORS.put("Bright Light Orange", hexToColor("F8BB3D"));
        COLORS.put("Bright Light Blue", hexToColor("9FC3E9"));
        COLORS.put("Rust", hexToColor("B31004"));
        COLORS.put("Bright Light Yellow", hexToColor("FFF03A"));
        COLORS.put("Trans-Pink", hexToColor("E4ADC8"));
        COLORS.put("Sky Blue", hexToColor("7DBFDD"));
        COLORS.put("Trans-Light Purple", hexToColor("96709F"));
        COLORS.put("Dark Blue", hexToColor("0A3463"));
        COLORS.put("Dark Green", hexToColor("184632"));
        COLORS.put("Glow In Dark Trans", hexToColor("BDC6AD"));
        COLORS.put("Pearl Gold", hexToColor("AA7F2E"));
        COLORS.put("Dark Brown", hexToColor("352100"));
        COLORS.put("Maersk Blue", hexToColor("3592C3"));
        COLORS.put("Dark Red", hexToColor("720E0F"));
        COLORS.put("Dark Azure", hexToColor("078BC9"));
        COLORS.put("Medium Azure", hexToColor("36AEBF"));
        COLORS.put("Light Aqua", hexToColor("ADC3C0"));
        COLORS.put("Olive Green", hexToColor("9B9A5A"));
        COLORS.put("Chrome Gold", hexToColor("BBA53D"));
        COLORS.put("Sand Red", hexToColor("D67572"));
        COLORS.put("Medium Dark Pink", hexToColor("F785B1"));
        COLORS.put("Earth Orange", hexToColor("FA9C1C"));
        COLORS.put("Sand Purple", hexToColor("845E84"));
        COLORS.put("Sand Green", hexToColor("A0BCAC"));
        COLORS.put("Sand Blue", hexToColor("6074A1"));
        COLORS.put("Chrome Silver", hexToColor("E0E0E0"));
        COLORS.put("Fabuland Brown", hexToColor("B67B50"));
        COLORS.put("Medium Orange", hexToColor("FFA70B"));
        COLORS.put("Dark Orange", hexToColor("A95500"));
        COLORS.put("Very Light Gray", hexToColor("E6E3DA"));
        COLORS.put("Glow in Dark White", hexToColor("D9D9D9"));
        COLORS.put("Medium Violet", hexToColor("9391E4"));
        COLORS.put("Glitter Trans-Neon Green", hexToColor("C0F500"));
        COLORS.put("Glitter Trans-Light Blue", hexToColor("68BCC5"));
        COLORS.put("Trans-Flame Yellowish Orange", hexToColor("FCB76D"));
        COLORS.put("Trans-Fire Yellow", hexToColor("FBE890"));
        COLORS.put("Trans-Light Royal Blue", hexToColor("B4D4F7"));
        COLORS.put("Reddish Lilac", hexToColor("8E5597"));
        COLORS.put("Vintage Blue", hexToColor("039CBD"));
        COLORS.put("Vintage Green", hexToColor("1E601E"));
        COLORS.put("Vintage Red", hexToColor("CA1F08"));
        COLORS.put("Vintage Yellow", hexToColor("F3C305"));
        COLORS.put("Fabuland Orange", hexToColor("EF9121"));
        COLORS.put("Modulex White", hexToColor("F4F4F4"));
        COLORS.put("Modulex Light Bluish Gray", hexToColor("AfB5C7"));
        COLORS.put("Modulex Light Gray", hexToColor("9C9C9C"));
        COLORS.put("Modulex Charcoal Gray", hexToColor("595D60"));
        COLORS.put("Modulex Tile Gray", hexToColor("6B5A5A"));
        COLORS.put("Modulex Black", hexToColor("4D4C52"));
        COLORS.put("Modulex Tile Brown", hexToColor("330000"));
        COLORS.put("Modulex Terracotta", hexToColor("5C5030"));
        COLORS.put("Modulex Brown", hexToColor("907450"));
        COLORS.put("Modulex Buff", hexToColor("DEC69C"));
        COLORS.put("Modulex Red", hexToColor("B52C20"));
        COLORS.put("Modulex Pink Red", hexToColor("F45C40"));
        COLORS.put("Modulex Orange", hexToColor("F47B30"));
        COLORS.put("Modulex Light Orange", hexToColor("F7AD63"));
        COLORS.put("Modulex Light Yellow", hexToColor("FFE371"));
        COLORS.put("Modulex Ochre Yellow", hexToColor("FED557"));
        COLORS.put("Modulex Lemon", hexToColor("BDC618"));
        COLORS.put("Modulex Pastel Green", hexToColor("7DB538"));
        COLORS.put("Modulex Olive Green", hexToColor("7C9051"));
        COLORS.put("Modulex Aqua Green", hexToColor("27867E"));
        COLORS.put("Modulex Teal Blue", hexToColor("467083"));
        COLORS.put("Modulex Tile Blue", hexToColor("0057A6"));
        COLORS.put("Modulex Medium Blue", hexToColor("61AFFF"));
        COLORS.put("Modulex Pastel Blue", hexToColor("68AECE"));
        COLORS.put("Modulex Violet", hexToColor("BD7D85"));
        COLORS.put("Modulex Pink", hexToColor("F785B1"));
        COLORS.put("Modulex Clear", hexToColor("FFFFFF"));
        COLORS.put("Modulex Foil Dark Gray", hexToColor("595D60"));
        COLORS.put("Modulex Foil Light Gray", hexToColor("9C9C9C"));
        COLORS.put("Modulex Foil Dark Green", hexToColor("006400"));
        COLORS.put("Modulex Foil Light Green", hexToColor("7DB538"));
        COLORS.put("Modulex Foil Dark Blue", hexToColor("0057A6"));
        COLORS.put("Modulex Foil Light Blue", hexToColor("68AECE"));
        COLORS.put("Modulex Foil Violet", hexToColor("4B0082"));
        COLORS.put("Modulex Foil Red", hexToColor("8B0000"));
        COLORS.put("Modulex Foil Yellow", hexToColor("FED557"));
        COLORS.put("Modulex Foil Orange", hexToColor("F7AD63"));
        COLORS.put("Coral", hexToColor("FF698F"));
        COLORS.put("Pastel Blue", hexToColor("5AC4DA"));
        COLORS.put("Glitter Trans-Orange", hexToColor("F08F1C"));
        COLORS.put("Trans-Blue Opal", hexToColor("68BCC5"));
        COLORS.put("Trans-Medium Reddish Violet Opal", hexToColor("CE1D9B"));
        COLORS.put("Trans-Clear Opal", hexToColor("FCFCFC"));
        COLORS.put("Trans-Brown Opal", hexToColor("583927"));
        COLORS.put("Trans-Light Bright Green", hexToColor("C9E788"));
        COLORS.put("Trans-Light Green", hexToColor("94E5AB"));
        COLORS.put("Trans-Purple Opal", hexToColor("8320B7"));
        COLORS.put("Trans-Green Opal", hexToColor("84B68D"));
        COLORS.put("Trans-Dark Blue Opal", hexToColor("0020A0"));
        COLORS.put("Lemon", hexToColor("EBD800"));
    }
}
