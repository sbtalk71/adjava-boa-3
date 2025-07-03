package multithreading.executors;

import java.util.concurrent.Callable;

public class ToUpperCaseWorker implements Callable<String> {

	private String data;
	
	public ToUpperCaseWorker(String data) {
		this.data = data;
	}

	@Override
	public String call() throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()+" operating on : "+data);
		Thread.sleep(5000);
		
		return data.toUpperCase();
	}

}
