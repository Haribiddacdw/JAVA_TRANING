package Q4;

public class OwnExceptions extends Exception {
     String msg;
    OwnExceptions(String message) {
        this.msg=message;

    }
     @Override
     public String toString() {
         
         return msg;
     }
    public static void main(String[] args) throws Exception {
        try {
            throw new OwnExceptions("custom exception :");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
