package d.data.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFromFile {

	public static void main(String[] args) {

		// read from file using DataInputStream with FileInputStream
		try (DataInputStream in = new DataInputStream(new FileInputStream("files/numbers.data"));) {
			int a = in.readInt();
			boolean b = in.readBoolean();
			double c = in.readDouble();
			byte d = in.readByte();
			long e = in.readLong();
			short f = in.readShort();
			String name = in.readUTF();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(name);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
