package c.creatingThreads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// get a reference to the current thread
		Thread currentThread = Thread.currentThread();

		for (int i = 1; i <= 10; i++) {
			System.out.println(currentThread.getName() + ": " + i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				System.out.println("thread interrupted and will stop");
				break;
			}
		}

		System.out.println("thread is done");

	}
}
