package a;

import java.time.LocalDateTime;

public class DemoDates {

	public static void main(String[] args) {

		LocalDateTime time = LocalDateTime.of(1980, 1, 26, 0, 0);
		System.out.println(time);

		time = LocalDateTime.now();
		System.out.println(time);

		System.out.println(time.getHour());
		System.out.println(time.getMinute());

		Person p = Person.getRandomPerson();

		Person p1 = new Person(101, "Aaa");
		Person p2 = new Person(101, "Bbb");

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
