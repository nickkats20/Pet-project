
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Catrine extends Pet
{
    /**
     * Constructor for objects of class Cat
     */
    public Catrine()
    {
        super("Dan");
    }
    
    public Catrine(String myName)
    {
        super(myName);
    }
    
    public String speak() //return type shall exactly match
    {
        return "Meow Meow Meow, I like fish!";
    }
}
