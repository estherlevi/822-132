package c;

public class Test3 {

	public static void main(String[] args) {
		
		Person p1 = new Person(111, "David", 25);
		Person p2 = new Person(111, "David", 25);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		
	}

}
