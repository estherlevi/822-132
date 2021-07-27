package a;

import java.util.ArrayList;
import java.util.List;

import utilities.CollectionUtil;

public class Demo3 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(102, "Dan", 30));
		list.add(new Person(101, "Tova", 25));
		list.add(new Person(103, "Amir", 5));

		System.out.println("insert order:");
		CollectionUtil.print(list);

		System.out.println("natural order (id):");
		list.sort(null);
		CollectionUtil.print(list);

		System.out.println("other order (age):");
		list.sort(new PersonAgeComparator());
		CollectionUtil.print(list);

		System.out.println("other order (name):");
		list.sort(new PersonNameComparator());
		CollectionUtil.print(list);

	}

}
