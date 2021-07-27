package b;

import java.util.Comparator;

public class StateComplexComparator implements Comparator<State> {

	@Override
	public int compare(State st1, State st2) {

		int res = 0;

		// try to decide by population
		res = st1.getPopulation() == st2.getPopulation() ? 0 : st1.getPopulation() - st2.getPopulation();

		// if population is same
		// try to decide by area
		if (res == 0) {
			res = st1.getArea() == st2.getArea() ? 0 : st1.getArea() - st2.getArea();
		}

		// if area is same
		// try to decide by name (natural order)
		if (res == 0) {
			res = st1.compareTo(st2);
		}

		return res;

	}

}
