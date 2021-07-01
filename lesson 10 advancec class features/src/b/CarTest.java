package b;

public class CarTest {
	
	public static void main(String[] args) {
		
		System.out.println("number of cars made: " + Car.getCounter()); 
		
		System.out.println("print class vriaables values");
		System.out.println("car facotry address: " + Car.getFactoryAddress());
		System.out.println("car facotry phone: " + Car.getFactoryPhone());
		
		System.out.println("print instances vriaables values");
		Car car1 = new Car(111, 0, "white");
		System.out.println("number of cars made: " + Car.getCounter()); 
		Car car2 = new Car(222, 30, "yellow");
		System.out.println("number of cars made: " + Car.getCounter()); 
		Car car3 = new Car(333, 90, "red");
		System.out.println("number of cars made: " + Car.getCounter()); 
		
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
		System.out.println(car3.getColor());
	}
}
