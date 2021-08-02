package app.core.test;

import app.core.Car;
import app.core.Country;
import app.core.FamilyCar;
import app.core.Highway;
import app.core.SportsCar;

public class App {

	private static int nextCarNumber = 101;
	private static int nextHighwayNumber = 1;

	public static void main(String[] args) {

		Country country = new Country();

		country.addHighway(getRandomHighway());
		country.addHighway(getRandomHighway());
		country.addHighway(getRandomHighway());

		// number of cars in country
		System.out.println("number of cars in country: " + country.getNumberOfCars());

		// number of cars on each highway
		for (Highway highway : country.getHighways()) {
			if (highway != null) {
				System.out.println(highway.getNumberOfCars());
			}
		}

	}

	private static Highway getRandomHighway() {
		String name = "H" + nextHighwayNumber++;
		Highway highway = new Highway(name);
		int numberOfCars = (int) (Math.random() * 7) + 4;
		for (int i = 0; i < numberOfCars; i++) {
			highway.addCar(getRandomCar());
		}
		return highway;
	}

	// add method for getting a random car
	private static Car getRandomCar() {
		Car car;
		int number = nextCarNumber++;
		int speed = (int) (Math.random() * (Car.MAX_SPEED - Car.MIN_SPEED + 1)) + Car.MIN_SPEED;
		if (Math.random() < 0.5) {
			car = new FamilyCar(number, speed);
		} else {
			car = new SportsCar(number, speed);
		}
		return car;
	}

}
