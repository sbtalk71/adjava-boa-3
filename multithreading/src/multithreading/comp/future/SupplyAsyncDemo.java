package multithreading.comp.future;

import java.util.concurrent.CompletableFuture;

public class SupplyAsyncDemo {

	public static void main(String[] args) throws Exception{
		CompletableFuture<String> result=CompletableFuture
				.supplyAsync(()->{ System.out.println(Thread.currentThread()); return "Hello World";});
		
		System.out.println(result.get());

	}

}
