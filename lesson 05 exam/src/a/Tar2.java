package a;

import java.util.Scanner;

public class Tar2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number. enter negative to stop");
		int n = sc.nextInt();
		int sum = 0;
		int c = 0;
		
		while(n>=0) {
			c++;
			sum += n;
			n = sc.nextInt();
		}
		sc.close();
		
		System.out.println("sum: " + sum);
		System.out.println("number of elements: " + c);
		
		if(c!=0) {
			System.out.println("average: " + (sum / c));
		}else {
			System.out.println("no data for average");
		}

	}

}
