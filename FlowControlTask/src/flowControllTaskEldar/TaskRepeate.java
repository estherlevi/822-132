package flowControllTaskEldar;

import java.util.Arrays;

public class TaskRepeate {

	public static void main(String[] args) {
		int c = 0;
		while (true) {
			c++;
			// part 1, 2 - create 2 arrays and print
			System.out.println("=== part 1, 2 - create 2 arrays and print");
			int[] nums1 = new int[15];
			int[] nums2 = new int[15];
			for (int i = 0; i < nums1.length; i++) {
				int x = (int) (Math.random() * 10);
				int y = (int) (Math.random() * 10);
				nums1[i] = x;
				nums2[i] = y;
			}
			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));

			// part 3 - biggest 3 digits number (bi-directional)
			System.out.println("\n=== part 3 - create the biggest 3 digits number");
			int bigest3dig = 0;
			for (int i = 0; i < nums1.length - 3; i++) {
				int num1 = nums1[i] * 100 + nums1[i + 1] * 10 + nums1[i + 2];
				int num2 = nums1[i + 2] * 100 + nums1[i + 1] * 10 + nums1[i];
				int max = num1 > num2 ? num1 : num2;
				bigest3dig = max > bigest3dig ? max : bigest3dig;
			}
			System.out.println(bigest3dig);

			// part 4, 5 - create distinct array and print
			System.out.println("\n=== part 4, 5 - create distinct array and print");
			int[] distinc1 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
			int[] distinc2 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
			int[] distinct = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
			for (int i = 0; i < nums1.length; i++) {
				distinc1[nums1[i]] = nums1[i];
				distinc2[nums2[i]] = nums2[i];
			}
			for (int i = 0; i < distinct.length; i++) {
				distinct[i] = distinc1[i] != -1 && distinc2[i] != -1 ? -1 : i;
			}
			System.out.println(Arrays.toString(distinct));

			// part 6 - number from distinct array
			System.out.println("\n=== part 6 - create number from distinct array");
			String str = "";
			for (int i = distinct.length - 1; i >= 0; i--) {
				if (distinct[i] != -1) {
					str += distinct[i];
				}
			}
			if (str.length() > 0) {
				long theNumber = Long.parseLong(str);
				System.out.println(theNumber);
			} else {
				System.out.println("no unique digits");
				break;
			}

		}
		System.out.println("it took " + c + " iterations");
	}

}
