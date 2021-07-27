package ex05;

public class Tar7 {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 2023);
		System.out.println("year: " + year);

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("NOT Leap Year");
		}

	}

}
