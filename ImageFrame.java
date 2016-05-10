import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Frame for displaying found Image
 * 
 * @author Yudai Okabe
 */
public class ImageFrame extends JFrame
{
    private ImageComponent scene;
    private JPanel panel, tools;
    /**
     * Constructor for objects of class ImageFrame
     */
    public ImageFrame(Image image1, Image image2)
    {
        scene = new ImageComponent(image1, image2);
//         JTextField enter = new JTextField(0);
//         JLabel searchs = new JLabel("Enter search item: ");
//         
//         panel.add(searchs);
//         panel.add(scene);
//         add(enter);
        add(scene);
        setTitle("Image Finder");
        setSize(image1.getWidth(this), image1.getHeight(this) + image2.getHeight(this));
    }

    
}