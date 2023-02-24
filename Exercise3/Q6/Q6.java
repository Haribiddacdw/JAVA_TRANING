package Q6;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q6 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        CharacterContinue check = new CharacterContinue();
        try (Scanner scan = new Scanner(System.in)) {
            es.execute(() -> {
                while(true){
                    
                    check.characterContinue(scan.next().charAt(0));
                }
                
            });
        }
        es.shutdown();
    }
}

class CharacterContinue {
    public void characterContinue (Character a) {
       
           if(!Character.isAlphabetic(a)){
                    
           }
        
    }
}

