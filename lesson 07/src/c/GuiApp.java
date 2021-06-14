package c;

import java.awt.Point;

import javax.swing.JFrame;

public class GuiApp {

	public static void main(String[] args) {

		JFrame fr = new JFrame("my app");
//		fr.setLocation(0, 0);
		fr.setLocation(new Point(300, 100));
		fr.setSize(350, 250);

		fr.setVisible(true);

	}

}
