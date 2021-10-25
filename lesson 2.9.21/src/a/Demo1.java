package a;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

	public Collection<String> collection = new ArrayList<>();

	public static void main(String[] args) {

		Demo1 demo1 = new Demo1();

		demo1.collection.add("aaa");
		demo1.collection.add("bbbbb");
		demo1.collection.add("cc");

		for (String str : demo1.collection) {
			System.out.println(str + " length: " + str.length());
		}

	}

}
