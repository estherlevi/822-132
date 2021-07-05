package vehicles;

public class Test {

	public static void main(String[] args) {
		Vehicle v; // declaration
		
		v = new Car();
		v.start();
		v.stop();
		
		v.setSpeed(25);
		System.out.println(v.getSpeed());
		
		v = new Boat();
		v.start();
		v.stop();
		
		v.setSpeed(25);
		System.out.println(v.getSpeed());

	}

}
