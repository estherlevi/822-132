package c;

public class Test {

	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt);

		pt.navigate(100, 30);
		System.out.println(pt);

		Pixel px = new Pixel(0, 0, Color.GREEN);
		System.out.println(px);

		px.navigate(500, 930);
		System.out.println(px);

		Vehicle vehicle = new Airplane(101);
		vehicle.drive();
		// vehicle.fly(); // fly is not defined in Vehicle

		// cast the vehicle (actually an airplane) to Flyer
		Flyer flyer = (Flyer) vehicle;
		// now - with the new reference we get access to the fly method
		flyer.fly(750);

	}

}
