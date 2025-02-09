package b;

import java.util.Comparator;

public class StateAreaComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		return s1.getArea() - s2.getArea();
	}

}
