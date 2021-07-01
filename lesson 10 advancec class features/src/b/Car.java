package b;

public class Car {

	// class variables - static - belongs to the class
	private static String factoryAddress = "Tel Aviv";
	private static String factoryPhone = "03-4459867";

	// instance variables
	int number;
	int speed;
	String color;


	public Car(int number, int speed, String color) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
	}
	
	public static void main(String[] args) {
		System.out.println("print class vriaables values");
		System.out.println("car facotry address: " + Car.factoryAddress);
		System.out.println("car facotry phone: " + Car.factoryPhone);
		
		System.out.println("print instances vriaables values");
		Car car1 = new Car(111, 0, "white");
		Car car2 = new Car(222, 30, "yellow");
		Car car3 = new Car(333, 90, "red");
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car3.color);
	}
}
