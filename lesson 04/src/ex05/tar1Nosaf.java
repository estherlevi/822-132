package ex05;

public class tar1Nosaf {

	public static void main(String[] args) {
		/*create a random value in the range 0 to 1
		 * if smaller than 0.5 print SMALL otherwise
		 * print BIG
		 * */

		// work with variables
		boolean isSmall = Math.random() < 0.5;
		String res = isSmall?"SMALL":"BIG";
		System.out.println(res);

		// work without variables
		System.out.println(Math.random() < 0.5 ? "BIG" : "SMALL");

	}

}
