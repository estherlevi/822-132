package b;

public class Tar1 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints the total sum and the average
	 */
	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + ", ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("sum: " + sum);
		System.out.println("average: " + ((double) sum / arr.length));

	}

}
