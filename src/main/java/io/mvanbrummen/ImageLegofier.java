package io.mvanbrummen;

import org.imgscalr.Scalr;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageLegofier {
    private static final double SCALE_DOWN_PROPORTION = 0.09;

    public BufferedImage legofy(final BufferedImage sourceImage) {
        var thumbnailWidth = sourceImage.getWidth() * SCALE_DOWN_PROPORTION;
        var thumbnailHeight = sourceImage.getHeight() * SCALE_DOWN_PROPORTION;
        // scale down image
        var thumbnail = Scalr.resize(sourceImage, (int) thumbnailWidth, (int) thumbnailHeight);

        // scale up image
        var img = Scalr.resize(thumbnail, sourceImage.getWidth(), sourceImage.getHeight());

        var newImage = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());

        // loop over pixels and build a new image using lego colors
        for (var y = 0; y < img.getHeight(); y++) {
            for (var x = 0; x < img.getWidth(); x++) {

                var pixel = img.getRGB(x, y);
                var color = new Color(pixel, true);

                var legoColor = getLegoColor(color);

                newImage.setRGB(x, y, legoColor.getRGB());
            }
        }

        return newImage;
    }

    Color getLegoColor(final Color color) {
        double minDistance = Double.MAX_VALUE;
        Color closestLegoColor = color;

        for (var entry : LegoColors.COLORS.entrySet()) {
            var legoColor = entry.getValue();
            var distance = ColorUtil.colorDistance(color, legoColor);

            if (distance < minDistance) {
                minDistance = distance;
                closestLegoColor = legoColor;
            }
        }

        return closestLegoColor;
    }
}
