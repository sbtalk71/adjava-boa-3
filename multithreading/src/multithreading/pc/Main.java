package multithreading.pc;

public class Main {

	public static void main(String[] args) throws Exception{
		SharedData sharedData= new SharedData();
		Thread producer=new Thread(new Producer(sharedData));
		Thread consumer= new Thread(new Consumer(sharedData));
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();

	}

}
