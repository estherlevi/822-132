package a;

public class A {

	private int x;
	private final int y;

	public A(int y) {
		super();
		this.y = y;
		// final variables - cannot reassigned
//		this.y = 500;
	}

	public void method1() {
		System.out.println("method");
	}

	// final method cannot be overriden
	public final void method2() {
		System.out.println("method");
	}

}
