package b.runtimeExceptions;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {

		// ClassCastException
		Object obj = "AAA";
		String str = (String) obj;
		Date date = (Date) obj; // class cast exception

		// NumberFormatException
		int x = Integer.parseInt("AAA");

		// ArrayIndexOutOfBoundsException
		System.out.println(args[9]);

		// NegativeArraySizeException
		int[] arr = new int[-3];

		// NullPointerException
		args = null;
		System.out.println(args.toString());

		// ArithmeticException
		System.out.println(4 / 0);

	}

}
