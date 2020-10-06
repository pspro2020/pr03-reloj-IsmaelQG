package code;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Thread thread = new Thread(new Clock());
		
		thread.start();
		TimeUnit.SECONDS.sleep(12);
		thread.interrupt();
		thread.join();
		System.out.println("El hilo secundario ya ha terminado de ejecutarse");
		
	}
}
