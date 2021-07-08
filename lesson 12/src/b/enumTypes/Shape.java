package b.enumTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Shape {
	
	private ShapeColor color;

	public ShapeColor getColor() {
		return color;
	}

	public void setColor(ShapeColor color) {
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.setColor(ShapeColor.WHITE);
		System.out.println(shape);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose color " + Arrays.toString(ShapeColor.values())); 
		String color = sc.nextLine();
		shape.setColor(ShapeColor.valueOf(color));
		System.out.println(shape);
		sc.close();
	}

}
