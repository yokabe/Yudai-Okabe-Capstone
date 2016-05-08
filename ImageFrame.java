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
    public ImageFrame(Image image)
    {
        scene = new ImageComponent(image);
        add(scene);
        setSize(600, 600);
    }

    
}
