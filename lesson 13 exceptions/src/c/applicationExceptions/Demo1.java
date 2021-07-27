package c.applicationExceptions;

public class Demo1 {

	public static void main(String[] args) {

		try {
			// ClassNotFoundException
			Object classInstance = Class.forName("java.lang.StringAAA");
			System.out.println(classInstance);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
