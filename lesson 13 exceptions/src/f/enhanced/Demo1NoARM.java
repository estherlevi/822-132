package f.enhanced;

import java.util.Scanner;

public class Demo1NoARM {

	// ARM - Auto Resource Management

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			System.out.print("enter name: ");
			String name = sc.nextLine();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
