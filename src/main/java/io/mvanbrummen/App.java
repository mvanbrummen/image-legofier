package io.mvanbrummen;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        var file= new File("/Users/mvanbrummen/workspace/image-legofier/test.jpg");
        var img = ImageIO.read(file);

        var legofier = new ImageLegofier();

        var legoImage = legofier.legofy(img);

        var outputfile = new File("/Users/mvanbrummen/workspace/image-legofier/out.jpg");
        ImageIO.write(legoImage, "jpg", outputfile);
    }
}
