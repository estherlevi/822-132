package a;

public class Demo2Casting {

	public static void main(String[] args) {

		byte x = 100;
		int y = x; // cast from byte to int (implicit)

		System.out.println(x);
		System.out.println(y);

		int a = 1500;
		byte b = (byte) a; // cast from int to byte (explicit)

		System.out.println(a);
		System.out.println(b);

		System.out.println("==================");
		// why do we need casting
		// 1 - convert from decimal to integer

		double n = 45.325;
		int num = (int) n; // cast from double to int
		System.out.println(n);
		System.out.println(num);

	}

}
