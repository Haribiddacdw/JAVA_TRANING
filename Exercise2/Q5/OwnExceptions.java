package Q5;

public class OwnExceptions extends Exception {

    OwnExceptions(String message) {
        super(message);
    }

    public void myMethod(){
        try {
            throw new OwnExceptions("Exception thrown from myMethod()");
        } catch (OwnExceptions e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){

        OwnExceptions objectRef = new OwnExceptions("hi");
        objectRef.myMethod();

    }
}

// we'll get a runtime error indicating that the exception was thrown but not
// caught.
// This is because we didn't include a try-catch block to handle the exception