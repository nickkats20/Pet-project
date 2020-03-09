
/**
*   Ticket class - start of Inheritance Hierechy 
 */
public abstract class Ticket
{
    //fields
    private int serialNumber;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();
    
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    //not a good solution for serial number but works for now
    private static int getNextSerialNumber()
    { return (int)Math.random()*100; }
}
