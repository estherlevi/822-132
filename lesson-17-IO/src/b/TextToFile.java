package b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextToFile {

	public static void main(String[] args) {

		// create file
		File file = new File("c:/eldar/letter.txt");

		// create file writer - use append=true if you want to append
		//	try(FileWriter out = new FileWriter(file, true);) { // with append
			try(FileWriter out = new FileWriter(file);) { // without append
			// write the text data to file
			out.write("Hello from Java App\n");
			System.out.println("data written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
