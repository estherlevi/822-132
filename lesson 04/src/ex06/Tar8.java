package ex06;

import java.util.Iterator;

public class Tar8 {

	public static void main(String[] args) {

		int index = (int) (Math.random() * 51); // 0 - 50
//		index = 6;
		System.out.println("index: " + index);

		long f1 = 1;
		long f2 = 1;
		System.out.print(f1 + ", ");

		for (int i = 3; i <= index; i++) {
			System.out.print(f2 + ", ");
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		System.out.println(f2);

	}

}
