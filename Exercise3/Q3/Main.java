package Q3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main
{
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		InventorySystem inventorySystem = new InventorySystem();
		es.execute(()->{
			    for(int i=0;i<3;i++){
					inventorySystem.produce();
				}
				
			
		});
		es.execute(()->{
			for(int i=0;i<3;i++){
				inventorySystem.consume();
			}
		});
		es.shutdown();
	}
}
class InventorySystem {
	int inventory = 0;
	synchronized public void produce() {
		if(inventory == 1) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Producer will Produce");
		inventory = 1;
		
		notify();
	}
	
	synchronized public void consume() {
		if(inventory == 0) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("Consumer will Consume");
		inventory = 0;
		
		notify();
	}
}