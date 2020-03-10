public class Zoo extends NickKat{
    //fields
    private Pet[] theZoo;
    
    //constructors
    public Zoo(){
       Pet[] p1 = new Pet[10];
       for(int i = 0; i < p1.length/2; i++){
           theZoo[i] = new Pet();
       }

       for(int i = (p1.length/2) - 1; i < p1.length; i++){
            theZoo[i] = new NickKat();
       }
    }
    // System.out.println(n1.getName());


    //methods

    public void soundOff(){
        for(Pet p : theZoo){
            System.out.println(p.speak());
        }
    }


}