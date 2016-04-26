import java.util.Scanner;

public class Search
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Search for Resources: ");
        String a = scan.next();
        ResourceSearcher searcher = new ResourceSearcher(a);
        
        
    }
    
}