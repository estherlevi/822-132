package a.synchronization;

public class CarDriver extends Thread {

	private Car car;
	private int travelDistance;

	public CarDriver(String driverName, Car car, int travelDistance) {
		super(driverName);
		this.car = car;
		this.travelDistance = travelDistance;
	}

	@Override
	public void run() {
		this.car.drive(travelDistance);
		this.car.stop();
	}

}
