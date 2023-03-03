package Q5;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
public class Q5 {
    /**
     * The main method that creates and runs a new instance of the Start thread.
     */

    public static void main(String args[]) {
        Start t1 = new Start();
        // this will call run() method
        t1.run();
        // t1.start(); //java.lang.IllegalThreadStateException , we cannot start the
        // same threads again
    }

}

class Start extends Thread {
    @Override
    /**
     * The run method that defines the behavior of the new thread.
     */
    public void run() {
        System.out.println("Thread is running...");
    }
}
