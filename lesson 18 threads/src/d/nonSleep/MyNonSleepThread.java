package d.nonSleep;

public class MyNonSleepThread extends Thread {

	public MyNonSleepThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10_000; i++) {
			System.out.println(this.getName() + ": " + i);
			if (this.isInterrupted()) {
//			if (Thread.interrupted()) { // if we want to clear the interrupted status
				break;
			}
		}

		System.out.println("=== " + this.getName() + " is done");
		System.out.println(this.isInterrupted());
	}
}
