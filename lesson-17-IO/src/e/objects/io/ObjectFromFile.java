package e.objects.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFromFile {

	public static void main(String[] args) {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("files/person.obj"))) {
			Object obj = in.readObject(); // read the person object from the file
			System.out.println(obj);
			// cast to Person
			Person p = (Person) obj;
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
