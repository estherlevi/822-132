package b.conditions;

public class Demo3 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);
		System.out.println(r);
		
		if(r > 5) {
			System.out.println("BIG");
		}else {
			System.out.println("SMALL");
		}

	}

}
