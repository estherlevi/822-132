package a;

import javax.swing.JOptionPane;

public class InputDemo4 {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter 1st number"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter 2nd number"));
		double sum = a + b;
		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + sum);

	}

}
