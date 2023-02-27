package Q6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q6 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        try (Scanner scan = new Scanner(System.in)) {
            Counter counter = new Counter();
            es.execute(() -> {
                while (true) {
                    char input = scan.next().charAt(0);
                    if (!Character.isAlphabetic(input)) {
                        System.out.print("Character Count : " + counter.count);
                        try {
                            throw new WrongInputException("Input Error : Non Alphabet is entered");
                        } catch (Exception e) {
                            System.out.println(e);
                            System.exit(0);
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
