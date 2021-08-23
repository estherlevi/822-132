package a;

public class Car {

	// == 1. fields:
	// static variable - class variable
	public static final String name = "car factory";
	private static int counter;

	// dynamic variable - non-static variable - instance variable
	private int km; // private - access from this class only
	String type; // default - no access modifier - access from any class in this package
	protected String color; // protected - access from package and any sub class
	public final int number; // public - access from anywhere

	// == 2. CTORs:
	private Car() {
		this.number = counter;
	}

	// == 3. methods:
	// static method - class method
	public static Car createCar() {
		counter++;
		Car car = new Car();
		return car; // return a Car
	}

	// dynamic method - instance method
	/**
	 * @param speed    the speed of the drive
	 * @param distance how many km to travel
	 * @return the total km of this car after this drive
	 */
	public int drive(int speed, int distance) {
		System.out.println("car number " + this.number + " is driving at " + speed + " km/h");
		this.km += distance;
		return this.km; // return int value
	}

	// dynamic method - instance method
	public int getKm() {
		return this.km;
	}

}
