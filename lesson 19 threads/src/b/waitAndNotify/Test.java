package b.waitAndNotify;

public class Test {

	public static void main(String[] args) {

		Stack stack = new Stack();

		Producer p1 = new Producer("p1", stack, 15, 1000);
		Producer p2 = new Producer("p2", stack, 5, 2000);
		Producer p3 = new Producer("p3", stack, 7, 1500);
		p1.start();
		p2.start();
		p3.start();

		Consumer c1 = new Consumer("c1", stack, 15, 1500);
		Consumer c2 = new Consumer("c2", stack, 12, 3000);
		c1.start();
		c2.start();

	}

}
