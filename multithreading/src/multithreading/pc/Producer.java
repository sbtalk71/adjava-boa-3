package multithreading.pc;

public class Producer implements Runnable {

	private SharedData sharedData;
	private int i = 0;

	public Producer(SharedData sharedData) {
		this.sharedData = sharedData;
		
	}

	@Override
	public void run() {
		try {
			while (true) {
				sharedData.put(i++);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
