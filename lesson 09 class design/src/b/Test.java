package b;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.speak();
		cat.scrach();
		
		Dog dog = new Dog();
		dog.speak();
		
		System.out.println("============");
		Animal animal;
		animal = new Cat();
		animal.speak();
		((Cat)animal).scrach();
		
		animal = new Dog();
		animal.speak();
//		((Cat)animal).scrach();
		
		System.out.println("=============");
		Animal[] animals = new Animal[5];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		animals[0].speak();
		animals[1].speak();
		animals[2].speak();

	}

}
