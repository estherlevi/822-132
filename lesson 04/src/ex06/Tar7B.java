package ex06;

import java.math.BigInteger;

public class Tar7B {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 101); // 0 - 100

		BigInteger f = new BigInteger("1");

		for (int kofel = 2; kofel <= r; kofel++) {
			f = f.multiply(new BigInteger(String.valueOf(kofel)));
		}
		
		System.out.println(r + "! = " + f);
		
		

	}

}
