package e.objects.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectToFile {

	public static void main(String[] args) {
		Person p = new Person(101, "Avi", 25);
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files/person.obj"))) {
			out.writeObject(p);
			System.out.println(p);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
