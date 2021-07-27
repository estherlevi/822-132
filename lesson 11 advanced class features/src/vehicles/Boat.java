package vehicles;

public class Boat extends Vehicle {

	@Override
	public void start() {
		System.out.println("start boat");
	}

	@Override
	public void stop() {
		System.out.println("stop boat");
	}

	@Override
	public void turnRight() {
		System.out.println("boat turns right");
	}

	@Override
	public void turnLeft() {
		System.out.println("boat turns left");
	}

}
