import java.util.Scanner;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.text.html.HTML.Tag;
import java.io.*;
import javax.swing.text.html.HTMLEditorKit.HTMLTextAction;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;

/**
 * A class to find an image and download that image
 * @author Yudai Okabe
 */
public class QuickImageFinder
{
    
    // The item that is being searched an image for
    private String searchItem;
    
    private URL url;
    
    private Image image;
    
    public QuickImageFinder(String s)
    {
        this.searchItem = s;
    }
    
     /**
        * Method to find a specifid image from the web
        * @return the found image
    */
    public Image find() throws IOException
    {
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            url = new URL("https://en.wikipedia.org/wiki/" + searchItem);
            Scanner in = new Scanner(url.openStream());
            String s = "";
            String url2 = "";
            int a, b, c; 
            while (in.hasNextLine())
            {
                s = in.nextLine();
                s = s.toUpperCase();
                if (s.contains("<IMG "))
                {
                    a = s.indexOf("<IMG ");
                    b = s.indexOf("SRC=\"", a + 5);
                    c = s.indexOf("\"", b + 5);
                    url2 = s.substring(b + 5, c);
                    break;
                }
                
            }
            url2 = "http:" + url2;
            download(url2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return image; 
    }
    
     /**
        * Method to download the found image on the webpage
        * @param String of the url of the image
    */
    public void download(String url) throws IOException
    {
        image = null;
        try 
        {
            URL url2 = new URL(url);
            image = ImageIO.read(url2);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
}