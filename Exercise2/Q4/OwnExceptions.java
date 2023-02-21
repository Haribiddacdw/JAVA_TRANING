package Q4;

public class OwnExceptions extends Exception{
    OwnExceptions(String message){
        super(message);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new OwnExceptions("custom exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     
    
}
