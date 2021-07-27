package b.enumTypes.planets;

public enum Planet {

	// list of constant objects of type Planet
	MERCURY(10, 325, Type.SOLID), VENUS(15, 326, Type.SOLID), EARTH(20, 885, Type.SOLID), MARS(25, 885, Type.SOLID),
	JUPITER(30, 885, Type.SOLID), SATURN(35, 885, Type.SOLID), URANUS(40, 885, Type.GAS), NEPTUNE(45, 885, Type.GAS),
	PLUTO(50, 885, Type.GAS);

	// attributes
	private int orbit;
	private int mass;
	private Type type;

	public enum Type {
		GAS, SOLID;
	}

	// private CTOR
	private Planet(int orbit, int mass, Type type) {
		this.orbit = orbit;
		this.mass = mass;
		this.type = type;
	}

	// methods
	public int getOrbit() {
		return orbit;
	}

	public int getMass() {
		return mass;
	}

	public Type getType() {
		return type;
	}

}
