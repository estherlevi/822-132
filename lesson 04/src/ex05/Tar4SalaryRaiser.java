package ex05;

public class Tar4SalaryRaiser {

	public static void main(String[] args) {
		double sal = (int) (Math.random() * 1001) + 5000;

		System.out.println(sal);

		if (sal * 1.1 <= 6000) {
			sal = sal * 1.1;
		}else {
			sal = 6000;
		}

		System.out.println(sal);
	}

}
