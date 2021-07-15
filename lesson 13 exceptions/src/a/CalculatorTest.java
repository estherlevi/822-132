package a;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		// handling 2 - try-catch
		try {
			int res = c.divide(10, 0); // calling the method that might throw an exception
			System.out.println(res);
		} catch (Exception e) {
			// handler code
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("END");
	}

}
