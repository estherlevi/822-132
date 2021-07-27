package vehicles;

public abstract class Vehicle {

	private int speed;

	// concrete methods
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// abstract methods
	public abstract void start();

	public abstract void stop();

	public abstract void turnRight();

	public abstract void turnLeft();

}
