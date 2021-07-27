package a;

import java.util.Scanner;

public class Tar3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter start value: ");
		int a = sc.nextInt();
		System.out.print("enter end value: ");
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			a += b;
			b = a - b;
			a = a - b;
		}
		System.out.println("playing " + a + " to " + b);

		for (int i = a; i <= b; i++) {
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}
			int x = i;
			while (x != 0) {
				if (x % 10 == 7) {
					System.out.println("BOOM");
					break;
				}
				x /= 10;
			}

			if (x == 0) {
				System.out.println(i);
			}
		}
	}

}
