
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doge extends Pet
{
    /**
     * Constructor for objects of class Dog
     */
    public Doge()
    {
        super();
    }
    
    public Doge(String dogName) {
        super(dogName);
    }
    
    @Override
    public String speak()
    {
        return "Meow!";
    }
}
