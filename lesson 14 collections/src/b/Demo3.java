package b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 25; i++) {
			list.add((int) (Math.random() * 11));
		}

		System.out.println(list);

		// remove duplicates
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);

	}

}
