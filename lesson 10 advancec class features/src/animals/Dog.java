package animals;

public class Dog extends Animal {

	/*
	 * the concrete class must implement the 
	 * inherited abstract method
	 */

	@Override
	public void speak() {
		System.out.println("speak like a dog");
	}

}
