package multithreading.sync;

public class SyncMain {

	public static void main(String[] args) throws Exception{
		TableGenerator tableGenerator=new TableGenerator();
		
		Thread t1= new Thread(new PrintWorker(6, tableGenerator));
		Thread t2= new Thread(new PrintWorker(8, tableGenerator));
		Thread t3= new Thread(new PrintWorker(10, tableGenerator));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();

	}

}
