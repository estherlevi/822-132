package app.core;

public class App2 {

	public static void main(String[] args) {

		Store store = new Store();
		store.addItem(new Item(101, "Bread", 6.80));
		store.addItem(new Item(102, "Milk", 5.94));
		store.addItem(new Item(103, "Potatos", 19.32));
		store.addItem(new Item(104, "Lamp", 100));
		store.printItems();
		
		store.raiseEntireStore(25);
		store.printItems();


	}

}
