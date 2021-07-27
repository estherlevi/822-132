package a;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		// create an array of length 3
		int[] arr = { 2, 4, 6 };
		// print
		System.out.println(Arrays.toString(arr));

		// create a temporary array of length 5
		int[] arr2 = new int[5];

		// copy elements from arr to arr2
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		// assign the arr reference to a new array object
		arr = arr2;
		arr2 = null; // cancel the temporary reference

		// print the new array with the old data
		System.out.println(Arrays.toString(arr));
	}

}
