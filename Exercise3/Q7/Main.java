package Q7;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(2);
        // Create object for Count class
        CountingThread count = new CountingThread();

        // thread to Count numbers from 1 to 100
        es.execute(() -> {
            for (CountingThread.number = 1; CountingThread.number <= 100; CountingThread.number++) {
                count.counter();
            }
        });

        // the thread to display Message after printing every 10 numbers
        es.execute(() -> {
            for (int i = 0; i < 9; i++) {
                count.message();
            }

        });
        es.shutdown();
    }
}

class CountingThread {
    static int number=1;

    // method for print numbers
    synchronized public void counter() {

        System.out.println(number + " ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (number % 10 == 0) {
            notify();
            try {
                wait();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // method for display message
    synchronized public void message() {
        System.out.println("After 10th Number");
        try {
            notify();
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
