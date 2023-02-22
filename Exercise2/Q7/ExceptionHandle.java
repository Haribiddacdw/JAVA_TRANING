package Q7;

import Q7.PoorInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                try {
                    System.out.println("Enter the Numerator");
                    int numerator = scanner.nextInt();
                    if (numerator == 'q' || numerator == 'Q')
                        System.exit(0);
                    System.out.println("Enter the divisor");
                    int divisor = scanner.nextInt();
                    System.out.println("Result :" + numerator / divisor);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                } catch (InputMismatchException ime) {
                    return;
                }

            }
        }
    }

}
