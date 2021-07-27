package classNesting.states;

public class State {

	private String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public class Citizen {
		private int id;
		private String name;

		public Citizen(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			State.this.population++;
		}

		public String getName() {
			return Citizen.this.name;
		}

		public String getStateName() {
			return State.this.name;
		}

	}

}
