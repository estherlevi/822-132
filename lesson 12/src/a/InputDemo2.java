package a;

import javax.swing.JOptionPane;

public class InputDemo2 {

	public static void main(String[] args) {
		
		// How to do input in Java
		String userName = JOptionPane.showInputDialog("Enter your name");
		
		// say hello to the user
		JOptionPane.showMessageDialog(null, "Hello " + userName);

	}

}
