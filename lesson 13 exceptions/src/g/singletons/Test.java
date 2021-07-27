package g.singletons;

public class Test {

	public static void main(String[] args) {

		Superman superman1 = Superman.getInstance();
		Superman superman2 = Superman.getInstance();
		Superman superman3 = Superman.getInstance();

		// all references points to the same instance of Superman
		superman1.fly();
		superman2.fly();
		superman3.fly();

	}

}
