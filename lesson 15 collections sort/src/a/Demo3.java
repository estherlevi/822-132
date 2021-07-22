package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(102, "Dan", 30));
		list.add(new Person(101, "Tova", 25));
		list.add(new Person(103, "Amir", 5));

		System.out.println("insert order:");
		print(list);

		System.out.println("natural order (id):");
		list.sort(null);
		print(list);

		System.out.println("other order (age):");
		list.sort(new PersonAgeComparator());
		print(list);

		System.out.println("other order (name):");
		list.sort(new PersonNameComparator());
		print(list);

	}

	private static void print(Collection<?> col) {
		System.out.println("=====================");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("=====================");
	}

}
