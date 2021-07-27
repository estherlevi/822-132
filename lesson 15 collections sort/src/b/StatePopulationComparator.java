package b;

import java.util.Comparator;

public class StatePopulationComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		return s1.getPopulation() - s2.getPopulation();
	}

}
