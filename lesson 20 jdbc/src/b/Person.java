package b;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private int id;
	private String name;
	private int age;

	private static int currId = 10001;
	private static String[] names = { "Ann", "Ran", "Dann", "Liora", "Eva" };

	public static Person getRandomPerson() {
		Person p = new Person();
		p.id = currId++;
		p.name = names[(int) (Math.random() * names.length)];
		p.age = (int) (Math.random() * 121);
		return p;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static List<Person> getRandomPerson(int amount) {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < amount; i++) {
			list.add(getRandomPerson());
		}
		return list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
