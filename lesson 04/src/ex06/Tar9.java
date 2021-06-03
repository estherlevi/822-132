package ex06;

import java.util.Iterator;

public class Tar9 {

	public static void main(String[] args) {

		int limit = (int) (Math.random() * 51); // 0 - 50
//		limit = 46;
		System.out.println("limit: " + limit);

		long f1 = 1;
		long f2 = 1;

		while (f2 <= limit) {
			System.out.print(f1 + ", ");
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		System.out.println(f1);

	}

}
