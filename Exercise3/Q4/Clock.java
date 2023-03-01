import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.time.LocalDateTime;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */
public class Clock {

	/**
	 * The main method starts the clock by creating a DigitalClock object and
	 * executing three threads.
	 * Each thread updates the corresponding time field every second and prints the
	 * updated time to the console.
	 * 
	 * @param args an array of command-line arguments for the application
	 */
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		DigitalClock digitalClock = new DigitalClock();
		es.execute(() -> {
			while (true) {
				digitalClock.sec();
			}

		});
		es.execute(() -> {
			while (true) {
				digitalClock.min();
			}
		});
		es.execute(() -> {
			while (true) {
				digitalClock.hrs();
			}
		});
		es.shutdown();
	}

}

/**
 * The DigitalClock class represents a clock that displays hours, minutes, and
 * seconds.
 */
class DigitalClock {
	int seconds;
	int minutes;
	int hour;

	/**
	 * 
	 * Constructs a DigitalClock object with the current time.
	 */
	DigitalClock() {
		LocalDateTime now = LocalDateTime.now();
		this.hour = now.getHour();
		this.minutes = now.getMinute();
		this.seconds = now.getSecond();
	}

	/**
	 * 
	 * Updates the seconds field and prints the updated time to the console.
	 * If the seconds field reaches 60, it is reset to 0 and the minutes field is
	 * updated.
	 * If the minutes field reaches 60, it is reset to 0 and the hours field is
	 * updated.
	 */
	synchronized public void sec() {
		int i;
		if (seconds < 60) {
			for (i = seconds; i < 60; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(hour + ":" + minutes + ":" + i);
			}
			seconds = i;
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * Updates the minutes field if the seconds field reaches 60.
	 * If the minutes field reaches 60, it is reset to 0 and the hours field is
	 * updated.
	 */
	synchronized public void min() {
		if (minutes < 59 && seconds == 60) {
			seconds = 0;
			minutes++;
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * Updates the hours field if the minutes field reaches 60.
	 * If the hours field reaches 23, it is reset to 0.
	 */
	synchronized public void hrs() {
		if (minutes == 59) {
			minutes = 0;
			seconds = 0;
			if (hour == 23)
				hour = 0;
			else
				hour++;
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
