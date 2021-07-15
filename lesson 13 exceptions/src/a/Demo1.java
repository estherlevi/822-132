package a;

public class Demo1 {

	public static void main(String[] args) {

		try {
			String str = "345A";
			int x = Integer.parseInt(str);
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("Error");
		}

		System.out.println("END");

	}

}
