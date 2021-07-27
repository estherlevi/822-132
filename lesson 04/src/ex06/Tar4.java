package ex06;

public class Tar4 {

	public static void main(String[] args) {
		int max = (int) (Math.random() * 101) + 100; // 100 - 200
		int den = (int) (Math.random() * 10) + 1; // 1 - 10
		System.out.println("max: " + max);
		System.out.println("den: " + den);

		for (int i = 0; i <= max; i += den) {
			System.out.print(i + ", ");
		}

	}

}
