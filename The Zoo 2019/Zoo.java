import java.util.ArrayList;

public class Zoo
{
    private ArrayList<Pet> theZoo;
    
    public Zoo()
    {
        theZoo = new ArrayList<Pet>();
        theZoo.add(new Cat("Snuggles"));
        theZoo.add(new Parrot("Polly"));
        theZoo.add(new LoudParrot("POLLY"));
        theZoo.add(new Dog("Fido"));
        theZoo.add(new LoudDog());
        theZoo.add(new Koala("Kailley"));
        theZoo.add(new Doggy("Snoopy"));
        theZoo.add(new LoudDoggy("SNOOPY"));
        theZoo.add(new Dragon("Dragoo"));
        theZoo.add(new LoudDragon("DRAGOO"));
        theZoo.add(new Giraffe("Spots"));
        theZoo.add(new LoudGiraffe());
        theZoo.add(new Hornet("Charlotte"));
        theZoo.add(new Google("Googly"));
        theZoo.add(new Doge("Dogey"));
        theZoo.add(new Dolphin("Dolphiny"));
        theZoo.add(new Elephant("Elle"));
        theZoo.add(new Alligator("Ally"));
       // theZoo.add(new Kat("Kat"));
        theZoo.add(new Fox("Fred"));
        theZoo.add(new Fish("Nemo"));
       // theZoo.add(new LoudFish("Dory"));
        theZoo.add(new Goat());
        theZoo.add(new Whale("Buluga"));
    }
    
    public void soundOff()
    {
        for(Pet p: theZoo)
        {
            System.out.println(p.speak());
        }
    }
}
