public class LoudNickKat extends NickKat {
    // Constructors
    public LoudNickKat() {
        super();
    }

    // Methods
    public String speak() {
        return super.speak() + "," + super.speak();
    }

    public String walk() {
        return super.walk();
    }
}