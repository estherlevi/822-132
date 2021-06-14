package a;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();

		Person p3 = new Person(103, "Danna", 22);

		System.out.println(p3.getId());
		System.out.println(p3.getName());
		System.out.println(p3.getAge());

		p1.setId(101);
		p1.setName("Dan");
		p1.setAge(18);

		p2.setId(102);
		p2.setName("Ran");
		p2.setAge(20);

		p1.speak();
		p2.speak();

		p1.setAge(200);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}

}
