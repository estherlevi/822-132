package ex06;

public class Tar3 {

	public static void main(String[] args) {

		int top = (int) (Math.random() * 26);
		System.out.println("top: " + top);

		for (int i = 0; i <= top; i += 2) {
			System.out.print(i + ", ");
		}

	}

}
