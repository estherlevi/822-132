package a.targil;

import java.util.ArrayList;
import java.util.List;

public class Test {

	// a pool of random data
	private static String[] firstNames = { "Eli", "David", "Yosi", "Dafna", "Mira", "John", "Ann" };
	private static String[] lastNames = { "Levi", "Kohen", "Israeli", "Avrahami", "Johns", "Smith" };
	private static String[] departments = { "Legal", "Sales", "Tecnical", "Customers" };

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < 100; i++) {
			employees.add(getRandomEmployee());
		}
	}

	public static Employee getRandomEmployee() {
		// create random values for Employee CTOR
		String first = firstNames[(int) (Math.random() * firstNames.length)];
		String last = lastNames[(int) (Math.random() * lastNames.length)];
		double salary = (int) (Math.random() * 5000);
		String department = departments[(int) (Math.random() * departments.length)];
		// create an Employee from the random values
		Employee e = new Employee(first, last, salary, department);
		return e;
	}

}
