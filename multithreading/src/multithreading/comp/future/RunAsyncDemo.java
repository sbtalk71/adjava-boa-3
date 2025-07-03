package multithreading.comp.future;

import java.util.concurrent.CompletableFuture;

import multithreading.simple.Worker;

public class RunAsyncDemo {

	public static void main(String[] args) throws Exception{
		
		System.out.println(Thread.currentThread());
	//CompletableFuture<Void> result=	CompletableFuture.runAsync(()->System.out.println("Completed Task"));
		
		CompletableFuture<Void> result=	CompletableFuture.runAsync(new Worker());
	
	System.out.println(result.get());

	}

}
