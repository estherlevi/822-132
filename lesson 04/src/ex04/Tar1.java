package ex04;

public class Tar1 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		System.out.println(a + ", " + b);
		int sum = a + b;
		double avg = sum / 2D;
		int rightDigA = a % 10;
		int rightDigB = b % 10;
		int area = a * b;

		// printouts
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
		System.out.println("right digit of a: " + rightDigA);
		System.out.println("right digit of b: " + rightDigB);
		System.out.println("area: " + area);

	}

}
