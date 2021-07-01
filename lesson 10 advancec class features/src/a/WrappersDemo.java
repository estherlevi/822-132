package a;

public class WrappersDemo {
	
	public static void main(String[] args) {
		
		/*sometimes we need to work with objects rather than primitives - e.g collections*/
		int x = 5; // primitive
		Integer a = 5; // object
		
		// static methods
		
		// minimum and maximum
		System.out.println("max val of int: " + Integer.MAX_VALUE);
		
		x = 2147483647;
		
		// convert from String to int
		String ageAsString = "25";
		int age = Integer.parseInt(ageAsString);
		System.out.println(age);
		
		
		

	}

}
