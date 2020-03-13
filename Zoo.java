import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Arrays;

public class Zoo {
    //fields
    private Pet[] theZoo;
    private static final int MEGABYTE = (1024*1024);
    public static void runOutOfMemory() {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        for (int i=1; i <= 100; i++) {
            try {
                System.out.println(Arrays.toString(new byte[MEGABYTE*500]));
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e) {
                MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
                long maxMemory = heapUsage.getMax() / MEGABYTE;
                long usedMemory = heapUsage.getUsed() / MEGABYTE;
                System.out.println(i+ " : Memory Use :" + usedMemory + "M/" + maxMemory + "M");
            }
        }
    }
    
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
            runOutOfMemory();
        }
    }


    //methods

    public void soundOff(){
        for(Pet p : theZoo){
            System.out.println(p.speak());
        }
    }


}