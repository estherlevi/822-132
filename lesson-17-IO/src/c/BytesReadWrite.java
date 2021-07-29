package c;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BytesReadWrite {

	public static void main(String[] args) {
		File src = new File("c:/eldar/flower.jpg");
		File dst = new File("c:/eldar/flower_copy.jpg");
		
		try
				(
						
					BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));	
				
					BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst));
				
				)
				
				{
			
			// perform io
			int availableBytes = in.available(); // file size
			System.out.println("file size: " + availableBytes);
			
			int b = in.read(); // read the first byte
			while(b!=-1) {
				out.write(b); // write the byte to destination file
				b = in.read(); // read the next byte
			}
			
			System.out.println("data copied from");
			System.out.println(src);
			System.out.println("to");
			System.out.println(dst);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
