package c.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import c.generics.foods.Apple;
import c.generics.foods.Food;
import c.generics.foods.Fruit;

public class Demo2 {

	public static void main(String[] args) {
		Apple[] applesArray = { new Apple(), new Apple() };
		Food[] foods = { new Apple(), new Fruit(), new Food() };
		print(applesArray);
		print(foods);

		List<Food> applesList = new ArrayList<>();
		applesList.add(new Apple());
		applesList.add(new Apple());
		applesList.add(new Fruit());
		print(applesList);
	}

	public static void print(Food[] foods) {
		System.out.println("==========");
		for (Food food : foods) {
			System.out.println(food.name);
		}
		System.out.println("==========");
//		foods[0] = new Food(); // runtime error
	}

	public static void print(Collection<? extends Food> foods) {
		System.out.println("==========");
		for (Food food : foods) {
			System.out.println(food.name);
		}
		System.out.println("==========");
		// foods.add(new Food()); // we cannot add anything
	}

}
