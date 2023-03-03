package Q2;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Q2 {
    /**
     * The main method that initializes an ExecutorService and uses it to run three
     * instances of the MessageProvider's messageProvider method in parallel.
     */

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        MessageProvider messageProvider = new MessageProvider();
        String string = "[------Message------]";
        es.execute(() -> {
            messageProvider.messageProvider(string, 0, 7);
        });
        es.execute(() -> {
            messageProvider.messageProvider(string, 7, 14);
        });
        es.execute(() -> {
            messageProvider.messageProvider(string, 14, 21);
        });
        es.shutdown();
    }
}

/**
 * 
 * A class that provides a method to print a part of a message.
 */
class MessageProvider {
    /**
     * A synchronized method that prints a part of a message given its starting and
     * ending indices.
     * 
     * @param string The message to be printed.
     * @param start  The index of the first character to be printed.
     * @param end    The index of the character after the last one to be printed.
     */
    synchronized public void messageProvider(String string, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(string.charAt(i));
        }
    }
}