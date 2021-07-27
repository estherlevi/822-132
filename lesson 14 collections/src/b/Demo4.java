package b;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		while (set.size() < 10) {
			set.add((int) (Math.random() * 11));
		}

		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int x = it.next(); // call next() only once per iteration
			System.out.println(x);
			if (x % 2 == 1) {
				it.remove();
			}
		}

		System.out.println(set);
	}

}
