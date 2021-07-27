package b;

public class Test2 {

	public static void main(String[] args) {

		Animal[] arr = new Animal[5];
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Dog();
		arr[4] = new Horse();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].speak();
				// use instanceof to check if the referenced object
				// is of a certain type
				if(arr[i] instanceof Cat) {
					// to see cat methods cast the Animal to Cat
					Cat cat = (Cat) arr[i];
					cat.scrach();
				}
//			}else {
//				System.out.println("NULL");
			}
			System.out.println("=========");
		}

	}

}
