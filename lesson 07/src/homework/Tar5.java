package homework;

import java.util.Arrays;

public class Tar5 {

	public static void main(String[] args) {
		int[][] grades = new int[20][10];
		int TotalSum = 0;
		for (int i = 0; i < grades.length; i++) {
			int studentSum = 0;
			for (int j = 0; j < grades[i].length; j++) {
				grades[i][j] = (int) (Math.random() * 101);
				studentSum += grades[i][j];
			}

			TotalSum += studentSum;

			System.out.println(
					"st " + i + ":\t" + Arrays.toString(grades[i]) + " avg: " + (double) studentSum / grades[i].length);
		}

		double schoolAvg = TotalSum / (double) (grades.length * 10);
		System.out.println("school average: " + schoolAvg);

	}

}
