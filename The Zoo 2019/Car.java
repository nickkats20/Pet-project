/**
 * This class is meant to represent a very simple passenger Car.
 * @author (Tim Barron) 
 * @version (1.0)
 */

public class Car implements Moveable
{
    // fields
    private String make;				//manufacturer of the Car i.e. Ford
    private String model;
    private String color;
    private double mileage;

    //constructors
    public Car()
    {
        make = "Ford";
        model = "Mustang";
        color = "black";
        mileage = 0.0;
    }
    

    public Car(String theMake, String theModel, String theColor, double miles)
    {
        make = theMake;
        model = theModel;
        color = theColor;
        mileage = miles;
    }

    //methods
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public double getMileage()
    {
        return mileage;
    }
       
    public void move(double numMiles)
    {
        mileage = mileage + numMiles;
    }
    
    public void printReport()
    {
        System.out.println("This car is a " + color + " " + make + " " + model +" with current mileage of "+ mileage +" miles.");
    }

}	//end of class

