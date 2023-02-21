package Q1;

import java.io.IOException;

public class Myclass{
    
    public  void methodOne() {
        try{
            throw new IOException("An IO exception occurred!");
        }catch(IOException e){
    }
}
    public static void  main(String[] args){
        Myclass object = new Myclass();
            object.methodOne(); 
            System.out.println("This will not be printed.");
    }

}