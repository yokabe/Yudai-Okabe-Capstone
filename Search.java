import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Image; 
import java.io.IOException;

import javax.swing.JFrame;
public class Search
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Search for Resources: ");
        String a = scan.next();
        a = a.toLowerCase();
        QuickImageFinder searcher = new QuickImageFinder(a);
        
        Image foundImage = searcher.find(4);
        Image foundImage2 = searcher.find(1);
        JFrame frame = new ImageFrame(foundImage, foundImage2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}