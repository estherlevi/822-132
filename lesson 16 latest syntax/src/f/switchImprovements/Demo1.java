package f.switchImprovements;

public class Demo1 {

	public static void main(String[] args) {

		String command = "go";

		switch (command) {
		case "go":
			System.out.println("going");
			break;
		case "stop":
			System.out.println("stoping");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + command);
		}

	}

}
