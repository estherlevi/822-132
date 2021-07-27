package vehicles;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("start car");
	}

	@Override
	public void stop() {
		System.out.println("stop car");
	}

	@Override
	public void turnRight() {
		System.out.println("car turns right");
	}

	@Override
	public void turnLeft() {
		System.out.println("car turns left");
	}

}
