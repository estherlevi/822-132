package c;

public abstract class Vehicle implements Navigator {
	// fields
	protected int number;
	protected Point location;

	// CTOR
	public Vehicle(int number) {
		super();
		this.number = number;
	}

	// abstract class can contain concrete methods
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// abstract class can contain abstract methods
	public abstract void drive();

}
