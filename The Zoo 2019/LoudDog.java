
/**
 * Write a description of class LoudDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
  public String speak()
  {
    return super.speak() + super.speak();
}
}
