package a;

public class Person {

	// attributes
	private int id;
	private String name;
	private int age;

	// constructor 1
	public Person() {

	}

	// constructor 2
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age); // the method will check that the value is valid
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
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	public void speak() {
		System.out.println(name + " is speaking");
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

}
