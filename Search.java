import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Image; 
import java.io.IOException;
public class Search
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Search for Resources: ");
        String a = scan.next();
        QuickImageFinder searcher = new QuickImageFinder(a);
        
        searcher.find();
        
        
    }
    
}