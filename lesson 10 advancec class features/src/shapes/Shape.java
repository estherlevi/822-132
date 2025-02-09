package shapes;

public abstract class Shape {
	
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	// abstract method
	public abstract double getArea();

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	
	

}
