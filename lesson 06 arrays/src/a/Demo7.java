package a;

public class Demo7 {

	public static void main(String[] args) {
		String[] arr = { "aaa", "bbb", "ccc", "ddd", "eee" };

		System.out.println(arr[0]); // lowest
		System.out.println(arr[arr.length - 1]); // highest
		System.out.println(arr[300]); // out of bounds - too high
		System.out.println(arr[-300]); // out of bounds - too low
	}

}
