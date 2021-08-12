package a.synchronization;

import java.time.LocalTime;

public class Car {

	private int number;
	private int km;

	public Car(int number) {
		super();
		this.number = number;
	}

	// critical section as method
	public synchronized void drive(int distance) {
		// get a reference to the tread running this car - car driver
		Thread carDriver = Thread.currentThread();
		// print start message
		System.out.print(carDriver.getName() + " started at " + km + " km ");
		System.out.print(" for a distance of " + distance);
		System.out.println(" with car " + this.number);
		try {
			Thread.sleep(distance * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// increment the km attribute of the car
		this.km += distance;
		// print end message
		System.out.print(carDriver.getName() + " finished at " + km + " km ");
		System.out.println(" with car " + this.number);
	}

	public void stop() {
		// non critical
		Thread carDriver = Thread.currentThread();
		int x = 7;
		int y = 10;
		int sum = x + y;
		System.out.println(carDriver.getName() + " time: " + LocalTime.now());
		// critical section as synchronized block
		synchronized (this) {
			System.out.println(carDriver.getName() + " stopping car " + this.number);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(carDriver.getName() + " stopped car " + this.number);
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", km=" + km + "]";
	}

}
