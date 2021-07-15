package d.finallyDemo;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {

		try {
			String str = JOptionPane.showInputDialog("Enter number");
			int x = Integer.parseInt(str);
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return;
		} finally {
			// do it anyway block
			System.out.println("from finally block");
		}

		System.out.println("END with Success");

	}

}
