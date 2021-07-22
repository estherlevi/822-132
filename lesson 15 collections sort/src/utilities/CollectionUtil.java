package utilities;

import java.util.Collection;

public class CollectionUtil {

	public static void print(Collection<?> col) {
		System.out.println("=====================");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("=====================");
	}

}
