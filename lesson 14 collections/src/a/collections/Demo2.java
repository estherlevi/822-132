package a.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		// create a set of String

		Set<String> set = new HashSet<>(); // unordered
//		Set<String> set = new LinkedHashSet<>(); // ordered
//		Set<String> set = new TreeSet<>(); // sorted

		// add elements
		set.add("BBB");
//		list.add(1); // integer is not allowed here
		set.add("CCC");
		set.add("CCC");
		set.add("AAA");
		// print the set
		System.out.println(set);

		System.out.println("AAA".hashCode());
		System.out.println("BBB".hashCode());
		System.out.println("CCC".hashCode());
	}

}
