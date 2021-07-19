package a.collections;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// create a list
		List<String> list = new LinkedList<>();
		// add elements
		list.add("BBB");
//		list.add(1); // integer is not allowed here
		list.add("CCC");
		list.add("CCC");
		list.add("AAA");
		// print the list
		System.out.println(list);
	}

}
