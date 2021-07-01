package animals;

public class Test {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cow();
		animals[2] = new Cat();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}

	}

}
