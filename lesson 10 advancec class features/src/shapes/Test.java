package shapes;

public class Test {

	public static void main(String[] args) {
		
		Shape shape; // declare a reference from the abstract type
		
		shape = new Rectangle("Red", 7, 9);
		System.out.println(shape.getArea());

		shape = new Circle("White", 4);
		System.out.println(shape.getArea());

	}

}
