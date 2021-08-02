package app.core;

public class Country {

	private Highway[] highways = new Highway[5];

	public Highway[] getHighways() {
		return highways;
	}

	public void addHighway(Highway highway) {
		for (int i = 0; i < highways.length; i++) {
			Highway curr = highways[i];
			if (curr == null) {
				highways[i] = highway;
				break;
			}
		}
	}

	public int getNumberOfCars() {
		int totalCars = 0;
		for (Highway highway : highways) {
			if (highway != null) {
				totalCars += highway.getNumberOfCars();
			}
		}
		return totalCars;
	}

}
