/**
 * Write a description of class Giraffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Giraffe extends Pet
{
    /**
     * Constructor for objects of class Giraffe
     */
    public Giraffe()
    {
        super("Spots");
    }
    
    public Giraffe(String theName)
    {
        super(theName);
    }
    
    public String speak(String theNoise)
    {
        return theNoise;
    }
}
