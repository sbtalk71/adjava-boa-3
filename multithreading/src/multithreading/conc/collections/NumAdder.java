package multithreading.conc.collections;

import java.util.Map;

public class NumAdder implements Runnable {

	private Map<String, String> myMap;

	public NumAdder(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(100);
				myMap.put(Thread.currentThread().getName() +i, i + "");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
