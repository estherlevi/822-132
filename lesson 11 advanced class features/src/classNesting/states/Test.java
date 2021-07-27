package classNesting.states;

import classNesting.states.State.Citizen;

public class Test {

	public static void main(String[] args) {
		
		State isr = new State("Israel");
		Citizen moshe = isr.new Citizen(101, "Moshe");
		Citizen Danna = isr.new Citizen(102, "Danna");
		Citizen david = isr.new Citizen(103, "David");

		State fra = new State("France");
		Citizen pier = fra.new Citizen(101, "Pier");
//		Citizen jane = fra.new Citizen(102, "Jane");
		Citizen jack = fra.new Citizen(103, "Jack");
		
		
		System.out.println(moshe.getName() + " from " + moshe.getStateName());
		System.out.println(jack.getName() + " from " + jack.getStateName());

		System.out.println(isr.getName() + " population: " + isr.getPopulation());
		System.out.println(fra.getName() + " population: " + fra.getPopulation());
	}

}
