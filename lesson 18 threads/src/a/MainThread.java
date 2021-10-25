package a;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		// get reference to the currently executing thread
		Thread mainThread = Thread.currentThread();
		// print the current thread name
		System.out.println(mainThread.getName());

		Thread.sleep(3000); // halting the thread for 3 seconds
		System.out.println(1);
		Thread.sleep(3000);
		System.out.println(2);
		Thread.sleep(3000);
		System.out.println(3);

	}

}
