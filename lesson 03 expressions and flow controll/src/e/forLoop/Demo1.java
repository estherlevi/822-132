package e.forLoop;

public class Demo1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("=========");

		for (int i = 0; i <= 100; i += 5) {
			System.out.println(i);
		}
		System.out.println("=========");

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}

	}
}
