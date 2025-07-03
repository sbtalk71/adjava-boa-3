package multithreading.pc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PCWithExecutorService {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		SharedData sharedData = new SharedData();
		es.submit(new Consumer(sharedData));
		es.submit(new Producer(sharedData));
		
		es.shutdown();

	}

}
