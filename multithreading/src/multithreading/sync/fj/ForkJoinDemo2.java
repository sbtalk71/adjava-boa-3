package multithreading.sync.fj;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo2 {

	public static void main(String[] args) {

		ForkJoinPool fjp = new ForkJoinPool();

		List<Integer> numList = Arrays.asList(1, 4, 6, 7, 8);
		
		
		AdderTask task = new AdderTask(numList);
		
		System.out.println(fjp.invoke(task));
	}

}
