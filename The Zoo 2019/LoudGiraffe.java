
/**
 * Write a description of class LoudGiraffe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudGiraffe extends Giraffe
{

    public LoudGiraffe()
    {
        // initialise instance variables
        super("Spots");
    }

    public String speak()
    {
        return (super.speak() + super.speak());
    }
}
