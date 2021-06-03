package ex06;

public class Tar5 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 10_001); // 0 - 10,000
//		r = 10;
		System.out.println(r);

		int digits = 1;
		int leftDig = 0;
		int sumOfDigits = 0;
		int hafuch = 0;

		while (r > 9) {
			// number of digits
			digits++;
			// sum of digits
			sumOfDigits += r % 10;
			// the reveresed number
			hafuch = hafuch*10 + r % 10;

			r = r / 10;
		}
		leftDig = r;
		sumOfDigits += r;
		hafuch = hafuch*10 + r ;

		System.out.println("number of digits: " + digits);
		System.out.println("left digit: " + leftDig);
		System.out.println("sum of digits: " + sumOfDigits);
		System.out.println("the reveresed number: " + hafuch);

	}

}
