package ex06;

public class Tar2 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 26); // 0 - 25
		int b = (int) (Math.random() * 26);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("swap");
		}

		System.out.println("a:" + a);
		System.out.println("b:" + b);

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}

	}

}
