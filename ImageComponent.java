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
import java.awt.TextComponent;
/**
 * Draws image
 * 
 * @author Yudai Okabe
 */
public class ImageComponent extends JComponent
{
    // instance variables - replace the example below with your own
    private Image image1;
    private Image image2;
    private Dimension prefSize;
    /**
     * Constructor for objects of class ImageComponent
     */
    public ImageComponent(Image image1, Image image2)
    {
        this.image1 = image1;
        this.image2 = image2;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
//         Toolkit.getDefaultToolkit().prepareImage(image, 50, 50, this);
        g2.drawImage(image1,0,0,this);
        g2.drawImage(image2,0,image1.getHeight(this),this);
        
    }
}
