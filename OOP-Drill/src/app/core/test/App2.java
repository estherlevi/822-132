package app.core.test;

import app.core.Car;
import app.core.Country;
import app.core.FamilyCar;
import app.core.Highway;
import app.core.SportsCar;

public class App2 {

	private static int nextCarNumber = 101;
	private static int nextHighwayNumber = 1;

	public static void main(String[] args) {

		Country country = new Country();

		country.addHighway(getRandomHighway());
		country.addHighway(getRandomHighway());
		country.addHighway(getRandomHighway());

		// number of cars in country
		System.out.println("number of cars in country: " + country.getNumberOfCars());

		// average speed of all cars in the country
		double avgSpeedAllCarsInCountry;
		int numOfAllCarsInTheCountry = 0;

		for (Highway highway : country.getHighways()) {
			if (highway != null) {
				// number of cars on each highway
				System.out.println(highway.getName() + ": " + highway.getNumberOfCars());
				// average speed of all cars in the country
				numOfAllCarsInTheCountry += highway.getNumberOfCars();
				for (Car car : args) {

				}

			}
		}

		// max speed of all cars in the country
		int max = getMaxSpeedOfCarsInCountry(country);
		System.out.println("max speed of all cars in the country: " + max);

		// most busy highway in the country
		System.out.println("most busy highway in country: " + getMostBusyHighway(country));
		// fastest highway in the country
		System.out.println("fastest highway in country: " + getFastestHighway(country));
	}

	private static Highway getMostBusyHighway(Country country) {
		Highway buisyHighway = country.getHighways()[0];
		// int numOfCars = 0;
		for (int i = 1; i < country.getHighways().length; i++) {
			Highway highway = country.getHighways()[i];
			if (highway != null) {
				if (highway.getNumberOfCars() > buisyHighway.getNumberOfCars()) {
//					numOfCars = highway.getNumberOfCars();
					buisyHighway = highway;
				}
			}
		}
		return buisyHighway;
	}

	private static int getMaxSpeedOfCarsInCountry(Country country) {
		int max = Car.MIN_SPEED;
		for (Highway highway : country.getHighways()) {
			if (highway != null) {
				for (Car car : highway.getCars()) {
					if (car != null) {
						if (car.getSpeed() > max) {
							max = car.getSpeed();
						}
					}
				}
			}
		}
		return max;
	}

	private static Highway getFastestHighway(Country country) {
		double max = Car.MIN_SPEED;
		Highway fastestHighway = null;

		for (Highway highway : country.getHighways()) {
			if (highway != null) {
				if (highway.getAvgSpeed() > max) {
					max = highway.getAvgSpeed();
					fastestHighway = highway;
				}
			}
		}
		return fastestHighway;
	}

	private static double getAverageSpeedOfCarsInCountry(Country country) {
		double sum = 0;
		int counter = 0;
		for (Highway highway : country.getHighways()) {
			if (highway != null) {
				for (Car car : highway.getCars()) {
					if (car != null) {
						sum += car.getSpeed();
						counter++;
					}
				}
			}
		}
		double avg = sum / counter;
		return avg;
	}

	private static Highway getRandomHighway() {
		String name = "H" + nextHighwayNumber++;
		Highway highway = new Highway(name);
		int numberOfCars = (int) (Math.random() * 50) + 5;
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
