import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.FileOutputStream;

public class QuickImageFinder
{
    
    // The item that is being searched an image for
    private String searchItem;
    
    private URL url;
    
    public QuickImageFinder(String s)
    {
        this.searchItem = s;
    }
    
    public Image find() throws IOException
    {
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            url = new URL("https://en.wikipedia.org/wiki/" + searchItem);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return download(url);
    }
    
    public Image download(URL url) throws IOException
    {
        Image i = null;
        
        try
        {
            i = ImageIO.read(url);
            ImageIO.write(i, "jpg", new File("/tmp/picture.jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return i;
    }
    
}