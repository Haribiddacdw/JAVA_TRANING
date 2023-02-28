package Q7;
import java.util.Scanner;

public class ExceptionHandle1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String numerator, divisor;
            while (true) {
                try {
                    System.out.println("Enter numerator value:");
                    numerator = scan.next();
                    if (numerator.equals("q") || numerator.equals("Q")) {
                        System.exit(0);
                    }
                    System.out.println("Enter divisor value:");
                    divisor = scan.next();
                    System.out.println("Result = " + Integer.parseInt(numerator) / Integer.parseInt(divisor));
                } catch (ArithmeticException e) {
                    System.out.println("Input is Not a Integer");
                } catch (NumberFormatException e) {
                    System.out.println("Division by zero or poor Input");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}























