
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



    public class Doggy extends Pet
    {
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Dog
     */
    public Doggy()
    {
        // initialise instance variables
      super("default dog");
    }
    public Doggy( String name)
    {
     super(name);   
        
    }

   
    public String speak()
    {
        return "Bark! Bark! Bark!";
        
    }
}
