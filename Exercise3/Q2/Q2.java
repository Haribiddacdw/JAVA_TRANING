package Q2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q2{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        MessageProvider messageProvider= new MessageProvider ();
        String string = "[------Message------]";
        es.execute(()->{
            messageProvider.messageProvider(string,0,7);
        });
        es.execute(()->{
            messageProvider.messageProvider(string,7,14);
        });
        es.execute(()->{
            messageProvider.messageProvider(string,14,21);
        });
        es.shutdown();
    }
}
class MessageProvider {
    synchronized public void messageProvider(String string,int start,int end) {
       for(int i = start;i<end;i++){
        System.out.print(string.charAt(i)); 
       }
	}
    
}