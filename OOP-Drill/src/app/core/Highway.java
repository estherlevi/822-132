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

	@Override
	public String toString() {
		return "Highway [name=" + name + ", number of cars: " + getNumberOfCars() + "]";
	}

	public static void main(String[] args) {
		Highway h1 = new Highway("H1");
		h1.addCar(new FamilyCar(101, 30));
		h1.addCar(new FamilyCar(102, 100));
		System.out.println(h1);

		boolean isRemoved = h1.removeCar(102);
		System.out.println("removed? " + isRemoved);
		isRemoved = h1.removeCar(110);
		System.out.println("removed? " + isRemoved);
		System.out.println(h1);
	}

}
