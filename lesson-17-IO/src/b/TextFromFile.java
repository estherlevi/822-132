package b;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFromFile {

	public static void main(String[] args) {

		// create file
		File file = new File("c:/eldar/letter.txt");

		// create a FileReader to read characters from file
		try (FileReader in = new FileReader(file)) {
			
			int c = in.read(); // read the first character
			while(c!=-1) {
				System.out.print((char)c);
				c = in.read(); // read the next character
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
