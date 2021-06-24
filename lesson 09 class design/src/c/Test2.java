package c;

public class Test2 {

	public static void main(String[] args) {
		Person p = new Person(111, "David", 22);
		Person p2 = new Person(111, "Moshe", 25);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}

}
