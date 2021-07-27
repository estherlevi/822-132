package classNesting;

public class Outer {
	
	private int x = 5;
	private static int y = 5;

	// inside a class we can nest other classes:
	
	// dynamic class - each object of this class depends on object of the outer class
	public class Inner{
		public void method() {
			// access to private members of the outer class
			System.out.println(x);
		}
	}
	
	// static class - each object of this class is independent
	public static class StaticNested{
		public void method() {
			// access to static private members of the outer class
			System.out.println(y);
		}
		
	}

}
