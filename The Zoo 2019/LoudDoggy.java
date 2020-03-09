
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



    public class LoudDoggy extends Doggy
    {
    // instance variables - replace the example below with your own
 

    /**
     * Constructor for objects of class Dog
     */
    public LoudDoggy()
    {
        // initialise instance variables
      super("default dog");
    }
    // public LoudDoggy( String name)
    // {
     // super(name);   
        
    // }
    public LoudDoggy( String name)
    {
        super(name);
    }
   
    public String speak()
    {
        return super.speak() + super.speak();
        
    }
}
