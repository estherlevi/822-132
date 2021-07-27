package animals;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[6];
		animals[0] = new Bat();
		animals[1] = new Dog();
		animals[2] = new Butterfly();
		animals[3] = new Hawk();
		animals[4] = new Ant();
		animals[5] = new Ostrich();

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.speak();

			if (animal instanceof AdvancedFlyer) {
				AdvancedFlyer af = (AdvancedFlyer) animal;
				af.takeOf();
				af.fly();
				af.navigate();
				af.land();
			} else { 
				// if current animal is a flyer - call fly
				if (animal instanceof Flyer) {
//				((Flyer)a).fly();
					Flyer flyer = (Flyer) animal;
					flyer.fly();
				}
				if (animal instanceof Navigator) {
					Navigator navigator = (Navigator) animal;
					navigator.navigate();
				}
			}

			System.out.println("========");
		}

	}

}
