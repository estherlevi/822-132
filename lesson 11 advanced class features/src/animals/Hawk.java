package animals;

public class Hawk extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a hawk");

	}


	public void fly() {
		System.out.println("fly like a hawk");
	}


	public void navigate() {
		System.out.println("navigate like a hawk");
	}

}
