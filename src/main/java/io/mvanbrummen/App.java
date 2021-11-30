package io.mvanbrummen;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
           printUsage();
           System.exit(0);
        }

        var imagePath = args[0];

        var file= new File(imagePath);
        var img = ImageIO.read(file);

        var legofier = new ImageLegofier();

        var legoImage = legofier.legofy(img);

        var outputfile = new File("out.jpg");
        ImageIO.write(legoImage, "jpg", outputfile);
    }

    private static void printUsage() {
        System.out.println("Usage: legofy <path-to-image>");
    }
}
