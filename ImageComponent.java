import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
/**
 * Draws image
 * 
 * @author Yudai Okabe
 */
public class ImageComponent extends JComponent
{
    // instance variables - replace the example below with your own
    private Image image;
    private Dimension prefSize;
    /**
     * Constructor for objects of class ImageComponent
     */
    public ImageComponent(Image image)
    {
        this.image = image;
        
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image,0,0,this);
        
    }
}
