package a;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

		String[] arr = { "aaa", "bbb", "ccc" };

		// convert an array to String
		String str = Arrays.toString(arr);
		// print
		System.out.println(str);

		// do it in a single line
		System.out.println(Arrays.toString(arr));
	}

}
