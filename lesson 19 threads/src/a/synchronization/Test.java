package a.synchronization;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car(101);
		Car car2 = new Car(102);

		CarDriver moshe = new CarDriver("Moshe", car1, 3);
		moshe.start();

		CarDriver rina = new CarDriver("Rina", car1, 5);
		rina.start();

		CarDriver dan = new CarDriver("Dan", car2, 2);
		dan.start();

	}

}
