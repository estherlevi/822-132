package d.nonSleep;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyNonSleepThread t1 = new MyNonSleepThread("t1");
		t1.start();
		Thread.sleep(10);
		t1.interrupt();

	}

}
