package multithreading.simple;

public class Worker implements Runnable {

	@Override
	public void run() {
		Thread name=Thread.currentThread();
		mytask(name);
	}

	
	
	private void mytask(Thread name) {
		try {
			for(var i=0;i<10;i++) {
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
