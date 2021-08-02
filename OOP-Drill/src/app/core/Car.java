package app.core;

import java.util.Objects;

public abstract class Car {

	public static final int MIN_SPEED = 0;
	public static final int MAX_SPEED = 110;

	private int number;
	private int speed; // 0 - 110

	public Car() {
	}

	public Car(int number, int speed) {
		super();
		this.number = number;
		setSpeed(speed); // the CTOR delegates call to setter (for validation)
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return number == other.number;
	}

}
