package b.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	public final static int MAX = 10; // max elements in the stack
	private List<Integer> list = new ArrayList<>();

	// take a number out from the stack
	public synchronized int pop() {
		while (this.list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// if we are here there are numbers to consume
		notify(); // let producers know that they can produce
		int n = list.remove(list.size() - 1);
		System.out.println(list);
		return n;
	}

	public synchronized void push(int x) {
		while (this.list.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// if we are here, there is now room for more numbers to be added
		list.add(x);
		System.out.println(list);
		notify(); // notify consumers that the can consume now
	}

}
