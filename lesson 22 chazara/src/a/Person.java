package a;

import java.util.Objects;

public class Person {

	private int id;
	private String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Person getRandomPerson() {
		Person p = new Person();
		p.id = 1;
		p.name = "aaa";
		return p;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
	}

}
