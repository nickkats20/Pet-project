
/**
 * Write a description of class Dolphin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dolphin extends Pet
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Dolphin
     */
    public Dolphin()
    {
        super("Destiny");
        
    }
    
    public Dolphin(String theName)
    {
        super(theName);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String speak()
    {
         return "Eeeheeehee";
    }
}