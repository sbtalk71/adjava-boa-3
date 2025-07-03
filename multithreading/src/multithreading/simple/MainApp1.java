package multithreading.simple;

public class MainApp1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" Starts");
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		
		
		System.out.println(Thread.currentThread().getName()+" exits");
		

	}

}
