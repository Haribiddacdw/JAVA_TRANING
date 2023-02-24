package Q7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        CountingThread count = new CountingThread();
        es.execute(() -> {
            count.counter();
        });
        es.shutdown();
    }
}

class CountingThread {

    public void counter() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+" "); 
            if (i%10==0) {
                System.out.println("Hi number");   
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    

}

