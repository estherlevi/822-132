package b.creatingThreads;

public class Main2 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("t1", 200);
		MyThread t2 = new MyThread("t2", 500);
		MyThread t3 = new MyThread("t3", 1200);

		t1.start();
		t2.start();
		t3.start();

		System.out.println("end of main");

	}

}
