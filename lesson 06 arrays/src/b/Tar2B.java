package b;

import java.util.Arrays;

public class Tar2B {

	/*
	 * Create a class that creates an array[50] of numbers with random values
	 * between 0-100 and prints the highest value and its index in the array
	 */
	public static void main(String[] args) {

		int[] arr = new int[50];
		int max = 0;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			int x = (int) (Math.random() * 101);
			arr[i] = x;
			if (x > max) {
				max = x;
				index = i;
			}
			System.out.println(i + ": " + x);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("max: " + max);
		System.out.println("index: " + index);

	}

}
