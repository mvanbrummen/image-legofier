package io.mvanbrummen;

import java.awt.*;
import java.util.regex.Pattern;

public class ColorUtil {
    private static final Pattern pattern = Pattern.compile("[a-fA-F0-9]+");

    public static double colorDistance(final Color c1, final Color c2) {
        int red1 = c1.getRed();
        int red2 = c2.getRed();
        int rmean = (red1 + red2) >> 1;
        int r = red1 - red2;
        int g = c1.getGreen() - c2.getGreen();
        int b = c1.getBlue() - c2.getBlue();
        return Math.sqrt((((512 + rmean) * r * r) >> 8) + 4 * g * g + (((767 - rmean) * b * b) >> 8));
    }

    public static Color hexToColor(String input) {
        String hex = input;
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        var matcher = pattern.matcher(hex);
        if (matcher.matches()) {
            if (hex.length() == 1) {
                int value = Integer.parseInt(hex, 16);
                value += value * 16;
                return new Color(value, value, value);
            } else if (hex.length() == 2) {
                int value = Integer.parseInt(hex, 16);
                return new Color(value, value, value);
            } else if (hex.length() == 3) {
                int r = Integer.parseInt(hex.substring(0, 1), 16);
                int g = Integer.parseInt(hex.substring(1, 2), 16);
                int b = Integer.parseInt(hex.substring(2, 3), 16);
                r += r * 16;
                g += g * 16;
                b += b * 16;
                return new Color(r, g, b);
            } else if (hex.length() == 4) {
                int a = Integer.parseInt(hex.substring(0, 1), 16);
                int r = Integer.parseInt(hex.substring(1, 2), 16);
                int g = Integer.parseInt(hex.substring(2, 3), 16);
                int b = Integer.parseInt(hex.substring(3, 4), 16);
                a += a * 16;
                r += r * 16;
                g += g * 16;
                b += b * 16;
                return new Color(r, g, b, a);
            } else if (hex.length() == 6) {
                int r = Integer.parseInt(hex.substring(0, 2), 16);
                int g = Integer.parseInt(hex.substring(2, 4), 16);
                int b = Integer.parseInt(hex.substring(4, 6), 16);
                return new Color(r, g, b);
            } else if (hex.length() == 8) {
                int a = Integer.parseInt(hex.substring(0, 2), 16);
                int r = Integer.parseInt(hex.substring(2, 4), 16);
                int g = Integer.parseInt(hex.substring(4, 6), 16);
                int b = Integer.parseInt(hex.substring(6, 8), 16);
                return new Color(r, g, b, a);
            }
        }
        throw new NumberFormatException(String.format(
                "%s is not a valid color string", input));
    }

}
