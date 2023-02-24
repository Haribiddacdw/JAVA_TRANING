package Q1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOdd{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
         EOnumbers evenOddNumbers = new EOnumbers();
        
        es.execute(()->{
            evenOddNumbers.even();
        });
        
        es.execute(()->{
            evenOddNumbers.odd();
        });
        es.shutdown();
    }
}
class EOnumbers {
    synchronized public void odd() {
		System.out.println("ODD NUMBERS FROM 1 TO 100 :");
		for(int i=1;i<=100;i++) {
            if(i%2!=0)
            System.out.print(i+" ");
        }
       
	}
    synchronized public void even() {
		System.out.println("EVEN NUMBERS FROM 1 TO 100 :");
		for(int i=1;i<=100;i++) {
            if(i%2==0)
            System.out.print(i+" ");
        }
	}
}