
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        String[] arg = {};
        
        System.out.println("Problem 4-1: Digits");
        Digits dig = new Digits();
        dig.main(arg);
        
        System.out.println("Problem 4-2: Bacteria");
        Bacteria bac = new Bacteria();
        bac.main(arg);
        
        System.out.println("Problem 4-3: Poetry Remix");
        PoetryRemix pr = new PoetryRemix();
        pr.main(arg);
    }
}
