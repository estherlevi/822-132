package ex06;

public class Tar1 {

	public static void main(String[] args) {

		int top = (int) (Math.random() * 26);
		System.out.println("top: " + top);

		for (int i = 1; i <= top; i++) {
			System.out.print(i + ", ");
		}

	}

}
