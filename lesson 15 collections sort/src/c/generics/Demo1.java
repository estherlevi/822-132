package c.generics;

import java.util.Arrays;

import c.generics.foods.Apple;
import c.generics.foods.Fruit;

public class Demo1 {

	public static void main(String[] args) {

		// generic collections are type safe
//		List<Fruit> list = new ArrayList<Apple>();

		Fruit[] arr = new Apple[5];
		arr[0] = new Apple();
		arr[1] = new Apple();
		arr[2] = new Apple();
		arr[3] = new Fruit(); // insert fruit into apples

		System.out.println(Arrays.toString(arr));

	}

}
