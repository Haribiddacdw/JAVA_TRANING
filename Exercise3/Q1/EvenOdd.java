package Q1;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class EvenOdd {
    /**
     *
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        /**
         * The EvenOdd class is the entry point of the program, which creates an
         * ExecutorService with a fixed thread pool size of 2 and executes the even and
         * odd methods of EvenOddNumbers class.
         */
        ExecutorService es = Executors.newFixedThreadPool(2);
        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
        
        es.execute(() -> {
            evenOddNumbers.even();
        });

        es.execute(() -> {
            evenOddNumbers.odd();
        });
        es.shutdown();
    }
}

class EvenOddNumbers {
    /**
     * The odd method prints all the odd numbers from 1 to 100.
     */
    synchronized public void odd() {
        System.out.println("ODD NUMBERS FROM 1 TO 100 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }

    /**
     * The even method prints all the even numbers from 1 to 100.
     */
    synchronized public void even() {
        System.out.println("EVEN NUMBERS FROM 1 TO 100 :");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

}