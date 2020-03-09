/**
 * Write a description of class Elephant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elephant extends Pet
{
    // constructors
    public Elephant()
    {
        super("Dumbo the Flying Elephant");
    }
    public Elephant(String name)
    {
        super(name);
    }
    //methods
    public String speak()
    {
        return "trumpet";
    }
    
}
