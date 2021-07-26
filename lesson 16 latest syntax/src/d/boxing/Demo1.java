package d.boxing;

public class Demo1 {

	public static void main(String[] args) {
		Integer a = new Integer(4); // inboxing
		Integer b = 4; // auto-inbox

		int n1 = a.intValue(); // outbox
		int n2 = b; // auto-outbox

	}

}
