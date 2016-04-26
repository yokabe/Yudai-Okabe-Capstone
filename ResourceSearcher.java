import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;

public class ResourceSearcher
{
    private String[] links;
    
    private String searchItem;
    
    
    
    public ResourceSearcher(String s)
    {
        this.searchItem = s;
    }
    
    public static void main(String[] args) throws IOException
    {
       
        
        String address = "https://en.wikipedia.org/wiki/Cat";
        URL pageLocation = new URL(address);
        Scanner in = new Scanner(pageLocation.openStream());
        PrintWriter out = new PrintWriter("webpage.html");
        
        while (in.hasNext())
        {
            String s = in.next();
            out.print(s);
            
        }
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            Scanner scan = new Scanner(System.in);
            System.out.println("Search for Resources: ");
            String a = scan.next();
            URI url1 = new URI("https://www.google.com/?safe=active&ssui=on#q=" + a);
            URI url2 = new URI("https://en.wikipedia.org/wiki/" + a);
            desktop.browse(url1);
            desktop.browse(url2);
        }   
        catch (Exception e) {
            e.printStackTrace();
        }
        
        out.close();
        
    }
    
    public void search()
    {
        
    }
    
}