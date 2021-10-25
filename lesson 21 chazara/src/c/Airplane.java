package c;

public class Airplane extends Vehicle implements Flyer {

	public Airplane(int number) {
		super(number);
	}

	@Override
	public void navigate(int x, int y) {
		this.location.x = x;
		this.location.y = y;
	}

	@Override
	public void drive() {
		System.out.println("airplane is driving");

	}

	@Override
	public void fly(int altitude) {
		if (altitude >= Flyer.MIN_ALT && altitude <= Flyer.MAX_ALT) {
			System.out.println("airplaine flyes at " + altitude + " altitude");
		} else {
			System.out.println("ERROR: illegal altitude: " + altitude);
		}

	}

}
