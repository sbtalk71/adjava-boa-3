package multithreading.sync.fj;

import java.util.concurrent.RecursiveAction;

public class NumberSplitAction extends RecursiveAction{
	private double num;

	public NumberSplitAction(double num) {
		this.num = num;
	}

	@Override
	protected void compute() {
		System.out.println(Thread.currentThread());
		if(num<10) {
			System.out.println("Data spring  is : "+num);
		}else {
			NumberSplitAction n1=new NumberSplitAction(num/2);
			NumberSplitAction n2= new NumberSplitAction(num/2);
			n1.fork();
			n2.fork();
			
			n1.join();
			n2.join();
		}
		
	}

}
