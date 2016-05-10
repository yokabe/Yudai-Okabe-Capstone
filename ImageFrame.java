import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
/**
 * Frame for displaying found Image
 * 
 * @author Yudai Okabe
 */
public class ImageFrame extends JFrame
{
    private ImageComponent scene;

    /**
     * Constructor for objects of class ImageFrame
     */
    public ImageFrame(Image image1, Image image2)
    {
        scene = new ImageComponent(image1, image2);
        add(scene);
        setTitle("Image Finder");
        setSize(400, 500);
    }

    
}