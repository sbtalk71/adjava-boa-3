package multithreading.sync;

public class TableGenerator {

	public synchronized void printTable(int num) {
		try {
			for (int i = 1; i < 11; i++) {
				System.out.println(num + " X " + i + " = " + (i * num));
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
