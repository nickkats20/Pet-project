
/**
 * Write a description of class pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goat extends Pet implements Moveable
{
    // instance variables - replace the example below with your own
    
    public Goat()
    {
        super("george");
        
    }

    public String speak()
    {
        return "baaaaaaaaa";
    }
    
    public void move(double howFar)
    {
        System.out.println("The goat ran " + howFar);
    }
}
