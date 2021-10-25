package a;

class CarTest {

	public static void main(String[] args) {

		// static reference - using class name
		System.out.println(Car.name);

		// dynamic reference - using instance name
		Car car1 = Car.createCar();
//		car1.number = 123;
		System.out.println(car1.number);

		Car car2 = Car.createCar();
		System.out.println(car2.number);
		System.out.println("total km: " + car2.getKm());

		// static reference - using class name
//		Car.name = "table factory";
		System.out.println(Car.name);

		Car car3 = Car.createCar();
		System.out.println(car3.number);

		// method caller gives 2 arguments - speed and distance
		// method caller get a result in return - the total km of this car after drive
		int totalKm = car2.drive(30, 200);
		totalKm = car2.drive(85, 70);
		System.out.println("car total km is " + totalKm);

	}

}
