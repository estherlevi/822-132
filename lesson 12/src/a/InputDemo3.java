package a;

import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter first number: ");
		double a = sc.nextDouble();
		System.out.print("enter second number: ");
		double b = sc.nextDouble();

		double sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

		sc.close();

	}

}
