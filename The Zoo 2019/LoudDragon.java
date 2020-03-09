
/**
 * Write a description of class LoudDragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudDragon extends Dragon
{
    public String speak()
    {
        return super.speak() + super.speak();
    }
}
