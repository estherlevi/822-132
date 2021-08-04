package app.core;

public class Highway {

	private String name;
	private Car[] cars = new Car[100];

	// CTOR 1
	public Highway() {
	}

	// CTOR 2
	public Highway(String name) {
		super();
		this.name = name;
	}

	// methods
	public void addCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = car;
				return;
			}
		}
	}

	public boolean removeCar(int carNumber) {
		for (int i = 0; i < cars.length; i++) {
			Car car = cars[i];
//			if(car != null && car.getNumber()==carNumber) {
//				cars[i] = null;
//				return true;
//			}

			Car carToRemove = new FamilyCar();
			carToRemove.setNumber(carNumber);

			if (carToRemove.equals(car)) {
				cars[i] = null;
				return true;
			}

		}
		return false;
	}

	public int getNumberOfCars() {
		int numOfCars = 0;
		for (Car car : cars) {
			if (car != null) {
				numOfCars++;
			}
		}
		return numOfCars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public double getAvgSpeed() {
		double sum = 0;
		int c = 0;
		for (Car car : cars) {
			if (car != null) {
				sum += car.getSpeed();
				c++;
			}
		}
		return sum / c;
	}

	@Override
	public String toString() {
		return "Highway [name=" + name + ", number of cars: " + getNumberOfCars() + "]";
	}

}
