package animals;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");
	}

	@Override
	public void takeOf() {
		System.out.println("takeOf like a bat");
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
	}

}
