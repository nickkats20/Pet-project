/**
 * Parrot subclass from Pet
 *
 * @author (Jacob Harman)
 * @version (1.0)
 */
public class LoudParrot extends Pet
{
    public LoudParrot()
    {
        super("Polly");
    }
    public LoudParrot(String name)
    {
        super(name);
    }
    
    public String speak()
    {
        return this.getName() + " wants a cracker " + this.getName() + " wants a cracker";
    }
}