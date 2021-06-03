package ex05;

public class Tar6TaxCalculator {

	public static void main(String[] args) {

		double sal = (int) (Math.random() * 200_000);

		double tax = 0;

		// grade 1
		if (sal <= 23_000) {
			tax += sal * 0.1;
			// grade 2
		} else {
			tax += 23_000 * 0.1;
			if (sal <= 50_000) {
				tax += (sal - 23_000) * 0.2;
				// grade 3
			} else {
				tax += 27_000 * 0.2;
				if (sal <= 100_000) {
					tax += (sal - 50_000) * 0.3;
					// grade 4
				} else {
					tax += 50_000 * 0.3;
					tax += (sal - 100_000) * 0.4;
				}
			}

		}

		System.out.println("bruto: " + sal);
		System.out.println("tax: " + tax);
		System.out.println("net: " + (sal - tax));

	}

}
