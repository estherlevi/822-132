package c.switchDemos;

public class Demo1 {

	public static void main(String[] args) {

		String key = "AAA"; // set the machine state
		System.out.println(key);

		// declare a switch
		switch (key) {
		case "OFF":
			System.out.println("red");
			break;
		case "STAND_BY":
			System.out.println("yellow");
			break;
		case "ON":
			System.out.println("green");
			break;
		default:
			System.out.println(key + " is not legal");
		}

	}

}
