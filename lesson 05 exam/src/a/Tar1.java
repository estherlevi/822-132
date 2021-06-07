package a;

import java.util.Scanner;

public class Tar1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		sc.close();
		int div = 2;
		
		for (; div < n; div++) {
			if(n % div == 0) {
				break;
			}
		}
		
		if(div == n) {
			System.out.println("primary");
		}else {
			System.out.println("NOT primary. Can be devided by " + div);
		}

	}

}
