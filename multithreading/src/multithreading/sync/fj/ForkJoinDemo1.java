package multithreading.sync.fj;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo1 {

	public static void main(String[] args) {
		ForkJoinPool fjp= new ForkJoinPool();
		
		NumberSplitAction nsa=	new NumberSplitAction(200);
		fjp.invoke(nsa);

	}

}
