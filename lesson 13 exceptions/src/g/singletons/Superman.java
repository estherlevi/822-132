package g.singletons;

public class Superman {

	// 2. one instance of the singleton type
	private static Superman instance = new Superman();

	// 1. private CTOR
	private Superman() {
	}

	// 3. public getter for the single instance
	public static Superman getInstance() {
		return instance;
	}

	public void fly() {
		System.out.println("super is flying");
	}

}
