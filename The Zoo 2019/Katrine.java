
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    /**
     * Constructor for objects of class Cat
     */
    public Cat()
    {
        super("Dan");
    }
    
    public Cat(String myName)
    {
        super(myName);
    }
    
    public String speak() //return type shall exactly match
    {
        return "Meow Meow Meow, I like fish!";
    }
}
