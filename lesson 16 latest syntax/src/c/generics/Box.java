package c.generics;

public class Box<T> { // generic class is defined with type parameters - T

	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public static void main(String[] args) {
		// when creating an object from a generic class we give a type argument
		Box<Integer> boxOfInt = new Box<>(8);
		Box<String> boxOfStr = new Box<>("aaa");

		boxOfInt.setContent(100);
		boxOfStr.setContent("bbb");

		int x = boxOfInt.getContent();
		String str = boxOfStr.getContent();
	}

}
