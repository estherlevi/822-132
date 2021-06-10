package a;

public class Demo2 {

	public static void main(String[] args) {

		// static initialization
		int[] numbers = { 2, 4, 6 };
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		// print an array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
	}

}
