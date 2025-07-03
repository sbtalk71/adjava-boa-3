package multithreading.sync;

public class PrintWorker implements Runnable {

	private int num;
	private TableGenerator tableGenerator;
	
	public PrintWorker(int num, TableGenerator tableGenerator) {
		this.num = num;
		this.tableGenerator = tableGenerator;
	}

	@Override
	public void run() {
		tableGenerator.printTable(num);

	}

}
