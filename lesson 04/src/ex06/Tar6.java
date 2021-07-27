package ex06;

public class Tar6 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 10_001); // 0 - 10,000
		r = 12321;
		int copy = r;
		System.out.println(r);

		int hafuch = 0;

		while (r != 0) {
			hafuch = hafuch * 10;
			hafuch += r % 10;
			r = r / 10;
		}

		System.out.println("the reveresed number: " + hafuch);

		System.out.println(copy == hafuch ? "Palindrom" : "NOT Palindrom");

	}

}
