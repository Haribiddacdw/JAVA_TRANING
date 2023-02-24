import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.time.LocalDateTime;
public class Clock {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		DigitalClock digitalClock = new DigitalClock();
		es.execute(() -> {
			while (true) {
				digitalClock .sec();
			}

		});
		es.execute(() -> {
			while (true) {
				digitalClock .min();
			}
		});
		es.execute(() -> {
			while (true) {
				digitalClock .hrs();
			}
		});
		es.shutdown();
	}

}
class DigitalClock {
	int seconds;
	int minutes;
	int hour;

	DigitalClock() {
		LocalDateTime now = LocalDateTime.now();
		this.hour = now.getHour();
		this.minutes = now.getMinute();
		this.seconds = now.getSecond();
	}
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
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized public void min() {
		if (minutes < 59 && seconds == 60) {
			seconds = 0;
			minutes++;
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized public void hrs() {
		if (minutes == 59) {
			minutes = 0;
			seconds = 0;
			if (hour == 23)
				hour = 0;
			else
				hour++;
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}