package a.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3Map {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		// add entries to the map
		map.put("Java", "a programming language");
		map.put("Israel", "a country in the midle east");
		map.put("Table", "a furniture");
		// print the map
		System.out.println(map);
		// give the key and get the value
		System.out.println(map.get("Java"));

		System.out.println("====================");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("q to quit or enter word: ");
			String word = sc.nextLine();
			if (word.equals("q")) {
				break; // exit the loop
			}
			String def = map.get(word);
			if (def != null) {
				System.out.println(def);
			} else {
				System.out.println("the word " + word + " is not in the dictionary");
				System.out.println("would you like to add the word? y/n");
				String input = sc.nextLine();
				if (input.equalsIgnoreCase("y")) {
					System.out.print("enter definition: ");
					def = sc.nextLine();
					map.put(word, def);
					System.out.println(word + " was add to dictionary");
				} else {
					System.out.println(word + " was not added");
				}

			}
		}
		System.out.println("Bye");
		sc.close();

	}

}
