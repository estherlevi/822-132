package e.shapes;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		while (true) {
			try {
				System.out.print("enter length: ");
				r.setLength(Integer.parseInt(sc.nextLine()));
				System.out.print("enter width: ");
				r.setWidth(Integer.parseInt(sc.nextLine()));
				break;
			} catch (IlegalLengthWidthException | NumberFormatException e) {
				System.out.println("wrong input: " + e);
			} catch (Exception e) {
				System.out.println("general error: " + e.getMessage());
			}
		}

		sc.close();
		System.out.println(r);
	}

}
