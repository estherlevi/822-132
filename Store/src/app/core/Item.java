package app.core;

import java.util.Objects;

public class Item {

	// attributes
	// 1. access modifier - private
	// 2. type - int
	// 3. identifier - id
	// 4. value - default = 0 
	private int id;
	private String name;
	private double price;

	// constructor
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
//		this.price = price;
		setPrice(price); // use the method to check price
	}

	// methods
	public void print() {
		System.out.println(this);
	}

	public void setPrice(double price) {
		// check that the price is not negative
		if (price >= 0) {
			this.price = price;
		}
	}

	public double getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item other = (Item) obj;
		return id == other.id;
	}

}
