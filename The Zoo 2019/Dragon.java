
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon extends Pet
{

    /**
     * Constructor for objects of class Dragon
     */
    public Dragon()
    {
        super("Drogon");
        
    }

    public Dragon(String theName)
    {
        super(theName);
    }
    
    public String speak()
    {
        return "growl";
    }
    
}
