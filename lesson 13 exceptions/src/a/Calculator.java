package a;

public class Calculator {
	// handling 1 - throws declaration
	public int divide(int a, int b) throws Exception {
		if (b != 0) {
			int res = a / b; // calculate the int result
			return res; // return the int result
		} else {
			Exception e = new Exception("divide by 0"); // create an exception object
			throw e; // throwing the exception object
		}
	}
}
