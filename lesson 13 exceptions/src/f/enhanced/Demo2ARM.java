package f.enhanced;

import java.util.Scanner;

public class Demo2ARM {

	// ARM - Auto Resource Management

	public static void main(String[] args) {

		// try with resources is ARM
		// the resources will be closed automatically
		try (

				Scanner sc = new Scanner(System.in);

				Phone p = new Phone();

				Phone p2 = new Phone();

		) {
			System.out.print("enter name: ");
			String name = sc.nextLine();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
