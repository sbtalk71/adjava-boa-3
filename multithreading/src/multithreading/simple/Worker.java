package multithreading.simple;

public class Worker implements Runnable {

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		mytask(name);
	}

	
	
	private void mytask(String name) {
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
