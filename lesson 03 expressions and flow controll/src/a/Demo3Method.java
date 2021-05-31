package a;

public class Demo3Method {

	public static void main(String[] args) {

		// use the method
		int res;

		res = sum(4, 9);
		System.out.println(res);
		res = sum(100, 5);
		System.out.println(res);
		res = sum(-3, 10);
		System.out.println(res);
		System.out.println("================");
		double a = 10;
		double b = 15;
		System.out.println(sum((int) a, (int) b));
		
		

	}

	// method definition
	public static int sum(int a, int b) {
		return a + b;
	}

}
