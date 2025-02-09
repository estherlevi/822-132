package b;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("Point (" + x + ", " + y + ")");
	}

	public void moveRight() {
		x++;
	}

	public void moveLeft() {
		x--;
	}

	public void moveUp() {
		y--;
	}

	public void moveDown() {
		y++;
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
