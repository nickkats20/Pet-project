
/**
 * The Hornet class - Pet Inheritance Hierarchy
 */
public class Hornet extends Pet {
    //fields    

    //constructors
    public Hornet() {
       super("default hornet"); 
    }

    public Hornet(String hornetName) {
        super(hornetName);
    }
    
    //methods
    public String speak()
    {
        return "bzzz";
    }
}
