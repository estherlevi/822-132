package a;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6 };
		System.out.println(Arrays.toString(arr));

		System.out.println("========================");

		int[][] arrDim = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };
		System.out.println(Arrays.deepToString(arrDim));

		System.out.println("========================");
		for (int i = 0; i < arrDim.length; i++) {
			System.out.println(Arrays.toString(arrDim[i]));
		}

	}

}
