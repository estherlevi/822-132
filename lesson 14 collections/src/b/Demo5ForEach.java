package b;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo5ForEach {

	public static void main(String[] args) {

		// create a set
		Set<Integer> set = new LinkedHashSet<>();

		// populate with elements
		while (set.size() < 10) {
			set.add((int) (Math.random() * 11));
		}

		// iterate with for-each loop
		int sum = 0;
		for (Integer x : set) {
			System.out.println(x);
			sum += x;
		}

		System.out.println("=====");
		System.out.println(sum);

	}

}
