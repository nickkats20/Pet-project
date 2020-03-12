import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Vector;

public class MemoryEater
{
    private static final int MEGABYTE = (1024*1024);
    public static void runOutOfMemory() {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        for (int i=1; i <= 100; i++) {
            try {
                byte[] bytes = new byte[MEGABYTE*500];
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

  public static void main(String[] args)
  {
    runOutOfMemory();
    runOutOfMemory();
    Vector v = new Vector();
    while (true)
    {
        try {
            byte b[] = new byte[69696969];
            v.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.println( "free memory: " + rt.freeMemory() );
        } catch (Exception e) {
            byte b[] = new byte[69696969];
            v.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.println( "free memory: " + rt.freeMemory() );
        }
    }
    
  }
}
