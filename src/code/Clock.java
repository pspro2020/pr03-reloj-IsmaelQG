package code;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock implements Runnable{
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			System.out.println(LocalTime.now().format(format));
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}

}
