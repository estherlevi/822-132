package e.forLoop;

public class Demo2 {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 11);

		int f = 1;

		for (int i = 2; i <= n; i++) {
			f *= i; // [f = f * i;]
		}

		System.out.println(n + "! = " + f);

	}
}
