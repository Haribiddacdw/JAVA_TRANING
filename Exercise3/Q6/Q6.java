package Q6;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q6 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        try (Scanner scan = new Scanner(System.in)) {
            Counter counter = new Counter();
            es.execute(() -> {
                while (true) {
                    char input = scan.next().charAt(0);
                    if (!Character.isAlphabetic(input)) {
                        System.out.print("Character Count : " + counter.count);
                        try {
                            throw new WrongInputException("Input Error : Non Alphabet is entered");
                        }catch (WrongInputException ee) {
                            System.out.println(ee);
                            System.exit(0);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        counter.characterContinue();
                    }
                }
            });
        }
        es.shutdown();
    }
}

class Counter {

    int count;

    Counter() {
        count = 0;
    }

    public void characterContinue() {
        count++;
    }
}


class WrongInputException extends Exception {
    String message;

    WrongInputException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {

        return message;
    }
}
