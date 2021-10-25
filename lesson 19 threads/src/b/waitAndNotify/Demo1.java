package b.waitAndNotify;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		Object obj = new Object();
		obj.wait();
		obj.notify();

	}

}
