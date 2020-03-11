public class Zoo {
    //fields
    private Pet[] theZoo;
    
    //constructors
    public Zoo(){
       this.theZoo = new Pet[10];
       for(int i = 0; i < theZoo.length/2; i++){
           theZoo[i] = new Pet();
       }

       for(int i = (theZoo.length/2); i < theZoo.length; i++){
            theZoo[i] = new NickKat();
       }
    }


    //methods

    public void soundOff(){
        for(Pet p : theZoo){
            System.out.println(p.speak());
        }
    }


}