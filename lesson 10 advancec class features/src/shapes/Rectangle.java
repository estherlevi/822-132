package shapes;

public class Rectangle extends Shape {

	private int lengh;
	private int width;

	public Rectangle(String color, int lengh, int width) {
		super(color);
		this.lengh = lengh;
		this.width = width;
	}

	@Override
	public double getArea() {
		return lengh * width;
	}

}
