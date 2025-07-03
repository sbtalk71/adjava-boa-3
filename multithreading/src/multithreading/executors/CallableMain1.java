package multithreading.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain1 {

	public static void main(String[] args) throws Exception {
		//ExecutorService es = Executors.newFixedThreadPool(10);
		// ExecutorService es= Executors.newCachedThreadPool();
		ExecutorService es=Executors.newVirtualThreadPerTaskExecutor();
		Future<String> future = es.submit(new ToUpperCaseWorker("test"));

		System.out.println(" task submitted..");
		while (true) {
			Thread.sleep(1000);
			if (future.isDone()) {
				System.out.println("Result : " + future.get());
				break;
			}
			System.out.println("waiting for result..");
		}

		es.shutdown();
	}

}
