package b;

import java.util.ArrayList;
import java.util.List;

import utilities.CollectionUtil;

public class Main {

	public static void main(String[] args) {

		List<State> list = new ArrayList<>();
		list.add(new State("Israel", 5, 100));
		list.add(new State("USA", 8, 100));
		list.add(new State("Belgium", 5, 100));

		System.out.println("isert order");
		CollectionUtil.print(list);

		System.out.println("natural order");
		list.sort(null);
		CollectionUtil.print(list);

		System.out.println("other order (area)");
		list.sort(new StateAreaComparator());
		CollectionUtil.print(list);

		System.out.println("other order (population)");
		list.sort(new StatePopulationComparator());
		CollectionUtil.print(list);

	}

}
