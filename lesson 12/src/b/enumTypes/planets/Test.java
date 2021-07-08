package b.enumTypes.planets;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Planet " + Arrays.toString(Planet.values()));
		Planet planet = Planet.valueOf(sc.nextLine());
		System.out.println(planet);
		System.out.println("orbit " + planet.getOrbit());
		System.out.println("mas " + planet.getMass());
		System.out.println("type " + planet.getType());
		sc.close();

	}

}
