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
    
   
    
    private BufferedImage image;
    
    private String search;
    
    private URL imageURL;
    
    public QuickImageFinder(String s)
    {
        this.searchItem = s;
        this.search = "";
        
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
            URL url = new URL("https://en.wikipedia.org/wiki/" + searchItem);
            int count = 0;
            Scanner in = new Scanner(url.openStream());
            String s = "";
            String url2 = "";
            int a, b, c; 
            while (in.hasNextLine())
            {
                s = in.nextLine();
                
                if (s.contains("<img "))
                {
                    a = s.indexOf("<img ");
                    b = s.indexOf("src=\"", a + 5);
                    c = s.indexOf("\"", b + 5);
                    url2 = s.substring(b + 5, c);
                    count++;
                    if (count == 4)
                    {
                        break;
                    }
                }
                
            }
            this.search = "http:" + url2;
            this.imageURL = new URL(this.search);
            download();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return this.image; 
    }
    
     /**
        * Method to download the found image on the webpage
        * @param String of the url of the image
    */
    public void download() throws IOException
    {
        try 
        {
            System.out.println(this.imageURL.toString());
            this.image = ImageIO.read(this.imageURL);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
}