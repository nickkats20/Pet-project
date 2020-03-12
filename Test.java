public class Test{
    public static void main(String[] args) {
        NickKat n1 = new NickKat();
        System.out.println(n1.getName());
        System.out.println(n1.speak());

        NickKat n2 = new NickKat("James");
        System.out.println(n2.getName());
        System.out.println(n2.speak());

        Zoo z1 = new Zoo();
        z1.soundOff();

        Zoo z2 = new Zoo(69);
        z2.soundOff();
    }
}