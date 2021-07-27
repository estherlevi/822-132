package b.varargs;

import java.util.Arrays;
import java.util.List;

import a.targil.Employee;
import a.targil.Manager;

public class Util {

	public static void main(String... args) {
		System.out.println(sum(5, 6));
		System.out.println(sum(5, 6, 3, 7, 8, 77, 23));

		System.out.println(sum("Eldar", 5, 6, 3, 7, 8, 77, 23));
		System.out.println(sum("Eldar"));

		List<Integer> list = Arrays.asList(2, 4, 7, 2, 77);
		System.out.println(list);

		List<Employee> emps = Arrays.asList(new Employee(), new Manager());
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int sum(int... arr) {
		int sum = 0;
		for (int e : arr) {
			sum += e;
		}
		return sum;
	}

	public static int sum(String name, int... arr) {
		System.out.println("Hello " + name);
		int sum = 0;
		for (int e : arr) {
			sum += e;
		}
		return sum;
	}

}
