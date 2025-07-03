package multithreading.pc;

public class SharedData {

	private int data = 0;

	volatile boolean valueSet = false;

	public synchronized void put(int data) {

		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.data = data;
		this.valueSet = true;
		System.out.println("PUT: " + this.data);
		notifyAll();
	}

	public synchronized void get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GOT : " + this.data);
		this.valueSet=false;
		notifyAll();
	}
}
