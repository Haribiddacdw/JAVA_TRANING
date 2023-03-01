package Q3;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	/**
	 * The main method that initializes an ExecutorService and uses it to run two
	 * instances of the InventorySystem's produce and consume methods in parallel.
	 * 
	 * @param args The command line arguments passed to the program
	 */

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		InventorySystem inventorySystem = new InventorySystem();
		es.execute(() -> {
			for (int i = 0; i < 3; i++) {
				inventorySystem.produce();
			}
		});
		es.execute(() -> {
			for (int i = 0; i < 3; i++) {
				inventorySystem.consume();
			}
		});
		es.shutdown();
	}
}

class InventorySystem {

	int inventory = 0;

	/**
	 * A synchronized method that simulates a producer producing an item and
	 * updating the inventory.
	 */
	synchronized public void produce() {
		if (inventory == 1) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Producer will Produce");
		inventory = 1;

		notify();
	}

	/**
	 * 
	 * A synchronized method that simulates a consumer consuming an item and
	 * updating the inventory.
	 */
	synchronized public void consume() {
		if (inventory == 0) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer will Consume");
		inventory = 0;

		notify();
	}
}