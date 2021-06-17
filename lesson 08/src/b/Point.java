package b;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		// call other ctor in the super class
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point(int x, int y)");
	}

	public Point(int val) {
		// call other ctor in this class
		this(val, val);
		System.out.println("Point(int val)");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
