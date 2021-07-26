package a.targil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

	// a pool of random data
	private static String[] firstNames = { "Eli", "David", "Yosi", "Dafna", "Mira", "John", "Ann" };
	private static String[] lastNames = { "Levi", "Kohen", "Israeli", "Avrahami", "Johns", "Smith" };
	private static String[] departments = { "Legal", "Sales", "Tecnical", "Customers" };

	public static void main(String[] args) {
		// get a list of random employees
		List<Employee> list = getRandomEmployees(7);
		// print the list
		print(list);
		// print statistic data using the EmployeeStatistics class
		System.out.println("total employees: " + EmployeeStatistics.getNumberOfEmployees(list));
		System.out.println("total legal employees: " + EmployeeStatistics.getNumberOfEmployees(list, "Legal"));
		System.out.println("total average: " + EmployeeStatistics.averageSalary(list));
	}

	public static void print(Collection<Employee> list) {
		System.out.println("===== list =====");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("=====------=====");
	}

	public static List<Employee> getRandomEmployees(int size) {
		List<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < size; i++) {
			employees.add(getRandomEmployee());
		}
		return employees;
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
