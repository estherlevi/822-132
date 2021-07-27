package b;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 11));
		}

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));

	}

}
