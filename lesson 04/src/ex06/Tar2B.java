package ex06;

public class Tar2B {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 26); // 0 - 25
		int b = (int) (Math.random() * 26);

		System.out.println("a:" + a);
		System.out.println("b:" + b);

		int mekadem = a < b ? 1 : -1;

		for (int i = a; i != b; i += mekadem) {
			System.out.print(i + ", ");
		}
		System.out.println(b);

	}

}
