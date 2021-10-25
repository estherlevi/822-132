package f.daemons;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main started");
		MyDaemonThreadTimer d = new MyDaemonThreadTimer();
		d.start();
		// setDaemon Throws:IllegalThreadStateException - if the thread is alive
		// d.setDaemon(false);

		System.out.println("main sleep for 5 seconds");
		Thread.sleep(5000);

		System.out.println("End of Main");

	}

}
