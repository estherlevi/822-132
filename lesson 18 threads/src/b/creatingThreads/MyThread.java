package b.creatingThreads;

public class MyThread extends Thread {

	private long sleepTime = 1500;

	public MyThread() {
	}

	public MyThread(String name, long sleepTime) {
		super(name);
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + ": " + i);
			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("=== " + this.getName() + " is done");
	}
}
