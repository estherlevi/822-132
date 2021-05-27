package a;

public class Test {

	public static void main(String[] args) {
		
		// create 2 new Object of type Person
		// to create a new object we use the keyword: new
		Person p1 = new Person();
		Person p2 = new Person();
		
		// give them id, name and age
		p1.id = 101;
		p1.name = "David";
		p1.age = 23;

		p2.id = 102;
		p2.name = "Sarrah";
		p2.age = 21;
		
		// print the state of p1
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);

		// print the state of p2
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
