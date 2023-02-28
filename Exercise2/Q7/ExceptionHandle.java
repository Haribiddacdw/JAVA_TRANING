package Q7;

import java.util.Scanner;

abstract class HandlerAbstract {
    public abstract void handle(DivideByZeroException dz);

    public abstract void handle(NonIntegerException nie);
}

class Handler extends HandlerAbstract {
    @Override
    public void handle(DivideByZeroException dz) {
        System.out.println("Division by Zero or Poor Input.");
    }

    @Override
    public void handle(NonIntegerException nie) {
        System.out.println("Number is not an Integer");
    }
}

abstract class NumberExceptions extends Exception {
    public abstract void handlerCall();
}

class DivideByZeroException extends NumberExceptions {
    String message;

    DivideByZeroException(String message) {
        this.message = message;
    }

    @Override
    public void handlerCall() {
        new Handler().handle(this);
    }

    @Override
    public String toString() {
        return message;
    }
}

class NonIntegerException extends NumberExceptions {
    String message;

    NonIntegerException(String message) {
        this.message = message;
    }

    @Override
    public void handlerCall() {
        new Handler().handle(this);
    }

    @Override
    public String toString() {
        return message;
    }
}

class Number {
    public static boolean isNumber(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

class Result {
    public void calculateResult(String numerator, String divisor) throws NumberExceptions {
        if (!Number.isNumber(numerator)) {
            throw new NonIntegerException("Input is Not a Integer");
        } else if (divisor.equals("0")) {
            throw new DivideByZeroException("Division by zero or poor Input");
        }
        System.out.println("Result = " + Integer.parseInt(numerator) / Integer.parseInt(divisor));
    }
}

public class ExceptionHandle {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String numerator, divisor;
            Result result = new Result();
            while (true) {
                try {
                    System.out.println("Enter numerator value:");
                    numerator = scan.next();
                    if (numerator.equals("q") || numerator.equals("Q")) {
                        System.exit(0);
                    }
                    System.out.println("Enter divisor value:");
                    divisor = scan.next();
                    result.calculateResult(numerator, divisor);
                } catch (NumberExceptions ne) {
                    ne.handlerCall();
                }
            }
        }
    }
}