package a;

import java.util.Scanner;

public class InputDemo1 {

	public static void main(String[] args) {
		
		// How to do input in Java
		
		// ask the user for input
		System.out.print("enter your name: ");
		
		// create an object for input operations - for example: Scanner
		// the input is from the keyboard - System.in
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine(); // wait for user input
		sc.close();
		
		// say hello to the user
		System.out.println("Hello " + userName);
		

	}

}
