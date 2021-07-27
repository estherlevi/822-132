package homework;

import java.util.Arrays;

public class Tar3Clean {

	public static void main(String[] args) {

		// create an array
		int[] arr = new int[10];
		// populate with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		// print
		System.out.println(Arrays.toString(arr));

		int[] temp = new int[arr.length];

		int length = 0; // this is the index for next element and length of new array

		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			for (j = 0; j < length; j++) {
				if (arr[i] == temp[j]) {
					// if we are here we found a duplicate
					break;
				}
			}
			if (j == length) {
				// if we are here we found a unique element to be copied
				temp[length] = arr[i];
				length++;
			}
		}

		int[] arrUnique = new int[length];

		System.arraycopy(temp, 0, arrUnique, 0, length);
		System.out.println(Arrays.toString(arrUnique));

	}

}
