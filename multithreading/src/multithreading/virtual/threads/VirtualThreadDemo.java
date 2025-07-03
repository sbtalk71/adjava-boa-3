package multithreading.virtual.threads;

import java.util.ArrayList;
import java.util.List;

import multithreading.simple.Worker;

public class VirtualThreadDemo {

	public static void doWork() {
		try {
			System.out.println("starts "+Thread.currentThread());
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("exits "+Thread.currentThread());
	}

	public static void main(String[] args) throws Exception {
		final int threadCount = 20000;
		List<Thread> threads = new ArrayList<Thread>();
		long start=System.currentTimeMillis();
		for (int i = 0; i < threadCount; i++) {
			Thread vt = Thread.ofPlatform().start(() -> doWork());
			threads.add(vt);
		}

		System.out.println("Total time : "+(System.currentTimeMillis()-start));
		for (Thread t : threads) {
			t.join();
		}

	}

}
