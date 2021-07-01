package b;

public class Car {
	
	// static initializer - for class variables - static
	// when the initialization is complex
	static {
		System.out.println("=== class car loaded to memory");
	}
	
	// dynamic initializer - for instance variables - non static
	// when we have several CTORs and some identical lines of code
	{
		System.out.println("*** car made");
	}

	// class variables - static - belongs to the class
	private static String factoryAddress = "Tel Aviv";
	private static String factoryPhone = "03-4459867";
	private static int counter;
	// constants
	public static final int MAX_SPEED = 110;

	// instance variables
	private final int number;
	private int speed;
	private String color;

	public Car(int number, int speed, String color) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static String getFactoryAddress() {
		return factoryAddress;
	}

	public static String getFactoryPhone() {
		return factoryPhone;
	}

	public int getNumber() {
		return this.number;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
