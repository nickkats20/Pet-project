/**
 * Parrot subclass from Pet
 *
 * @author (Jacob Harman)
 * @version (1.0)
 */
public class Parrot extends Pet
{
    public Parrot()
    {
        super("Polly");
    }
    public Parrot(String name)
    {
        super(name);
    }
    
    public String speak()
    {
        return this.getName() + " wants a cracker";
    }
}