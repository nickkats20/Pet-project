
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
  
    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
      super("Fido");
    }
    
    public Dog(String name)
    {
        super(name);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String makeNoise()
    {
       return "Woof";
    }
}
