package a;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		{ // numerals natural order is from lower to higher
			Set<Integer> set = new TreeSet<>();
			set.add(4);
			set.add(7);
			set.add(1);
			set.add(-8);
			set.add(3);
			System.out.println(set);
		}
		{ // Date natural order is from early to late
			Set<LocalDate> set = new TreeSet<>();
			set.add(LocalDate.of(2021, 10, 22));
			set.add(LocalDate.of(2021, 7, 22));
			set.add(LocalDate.of(2021, 3, 22));
			System.out.println(set);
		}

		{ // String natural order is alphabetically
			Set<String> set = new TreeSet<>();
			set.add("xml");
			set.add("java");
			set.add("html");
			set.add("apple");
			System.out.println(set);
		}

		{ // Person natural order is Person.id
			Set<Person> set = new TreeSet<>();
			set.add(new Person(102, "Dan", 30));
			set.add(new Person(101, "Tova", 25));
			set.add(new Person(103, "Amir", 5));
			System.out.println(set);
		}
		{ // Person other order: Person.name
			PersonNameComparator nameComparator = new PersonNameComparator();
			Set<Person> set = new TreeSet<>(nameComparator);
			set.add(new Person(102, "Dan", 30));
			set.add(new Person(101, "Tova", 25));
			set.add(new Person(103, "Amir", 5));
			System.out.println(set);
		}
		{ // Person other order: Person.age
			PersonAgeComparator ageComparator = new PersonAgeComparator();
			Set<Person> set = new TreeSet<>(ageComparator);
			set.add(new Person(102, "Dan", 30));
			set.add(new Person(101, "Tova", 25));
			set.add(new Person(103, "Amir", 5));
			System.out.println(set);
		}

	}

}
