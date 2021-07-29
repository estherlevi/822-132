package b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFromFileBuffered {

	public static void main(String[] args) {

		// create file
		File file = new File("c:/eldar/letter.txt");

//			try (FileReader in = new FileReader(file)) {
			try (BufferedReader in = new BufferedReader(new FileReader(file)) ) {
			
			String line = in.readLine(); // read the first line
			while(line != null) {
				System.out.println(line);
				line = in.readLine(); // read the next line
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
