package io.mvanbrummen;

import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class ImageLegofierTest {
    private ImageLegofier imageLegofier = new ImageLegofier();

    @Test
    void shouldReturnLegoImageWhenTestImagePassed() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();

        var testImg = ImageIO.read(classLoader.getResource("test.jpg"));

        var result = imageLegofier.legofy(testImg);

        var expectedImg = ImageIO.read(classLoader.getResource("lego.jpg"));

        compareImages(result, expectedImg);
    }

    @Test
    void shouldReturnLegoColorWhenColorPassed() {
        assertThat(imageLegofier.getLegoColor(Color.CYAN)).isEqualTo(new Color(90, 196, 218));
    }

    public static boolean compareImages(BufferedImage imgA, BufferedImage imgB) {
        if (imgA.getWidth() != imgB.getWidth() || imgA.getHeight() != imgB.getHeight()) {
            return false;
        }

        int width = imgA.getWidth();
        int height = imgA.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (imgA.getRGB(x, y) != imgB.getRGB(x, y)) {
                    return false;
                }
            }
        }

        return true;
    }
}