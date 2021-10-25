package c.creatingThreads;

public class Main3Interrupting {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyRunnable(), "t1");
		t1.start();

		Thread.sleep(3000);

		t1.interrupt();
	}

}
