package b;

public class PointApp2 {

	public static void main(String[] args) {

		Point p = new Point(0, 0);
		p.print();

		p.moveRight();
		p.moveRight();
		p.moveRight();

		p.moveDown();
		p.moveDown();

		p.print();
	}

}
