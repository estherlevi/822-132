package d;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point(5, 5);
		Point p2 = new Point(5, 5);
		Point p3 = new Point(56, 12);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));

	}

}
