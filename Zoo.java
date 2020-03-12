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

    public Zoo(int numPets){
        this.theZoo = new Pet[numPets];
        for(int i = 0; i < theZoo.length; i++){
            if(Math.random() < .5){
                theZoo[i] = new NickKat();
            }else {
                theZoo[i] = new Pet();
            }
            int die = (Integer.MAX_VALUE % 69696969) * 400000;
        }
    }


    //methods

    public void soundOff(){
        for(Pet p : theZoo){
            System.out.println(p.speak());
        }
    }


}