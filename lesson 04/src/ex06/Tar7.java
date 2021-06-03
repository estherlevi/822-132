package ex06;

public class Tar7 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11); // 0 - 10

		long f = 1;

		for (int kofel = 2; kofel <= r; kofel++) {
			f = f * kofel;
		}
		
		System.out.println(r + "! = " + f);
		
		

	}

}
