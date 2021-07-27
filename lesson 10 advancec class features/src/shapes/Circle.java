package shapes;

public class Circle extends Shape {

	private int radius;

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
