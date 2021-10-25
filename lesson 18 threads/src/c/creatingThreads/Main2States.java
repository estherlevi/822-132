package c.creatingThreads;

public class Main2States {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r, "t1-r");
		System.out.println(t1.getName() + ", state: " + t1.getState());
		t1.start();
		System.out.println(t1.getName() + ", state: " + t1.getState());

		// make the main thread sleep
		Thread.currentThread().sleep(100);
		System.out.println(t1.getName() + ", state: " + t1.getState());

		t1.join(); // stops the current thread (main) until t1 is terminated
		System.out.println(t1.getName() + ", state: " + t1.getState());

	}

}
