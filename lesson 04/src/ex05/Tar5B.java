package ex05;

public class Tar5B {

	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int c = (int) (Math.random() * 101);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		int max = a;

		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		System.out.println(max);
	}

}
