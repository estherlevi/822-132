package d.data.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataToFile {

	public static void main(String[] args) {
		// define some data to be written to a file:
		// the format is known to us - data size and order
		int a = 150;
		boolean b = 10 < 100;
		double c = 5.56;
		byte d = 25;
		long e = 15_000;
		short f = 20;
		String name = "Dan";
		
		// write to file using DataOutputStream with FileOutputStream
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("files/numbers.data"));) {
			out.writeInt(a);
			out.writeBoolean(b);
			out.writeDouble(c);
			out.writeByte(d);
			out.writeLong(e);
			out.writeShort(f);
			out.writeUTF(name);
			System.out.println("data written to file");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
