package a;

public class Demo1Concat {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "bbb";
		int x = 5;
		int y = 3;
		String str3 = str1 + str2 + (x + y); // concatenation

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("===================");

		System.out.println(x + ", " + y);

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " * " + y + " = " + x * y);

	}

}
