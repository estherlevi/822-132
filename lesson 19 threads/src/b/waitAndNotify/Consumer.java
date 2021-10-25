package b.waitAndNotify;

// צרכן
public class Consumer extends Thread {

	private Stack stack; // the stack to pop from
	private int amount; // how many numbers to pop
	private long rate; // how many milliseconds to sleep between each pop

	public Consumer(String name, Stack stack, int amount, long rate) {
		super(name);
		this.stack = stack;
		this.amount = amount;
		this.rate = rate;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int num = this.stack.pop();
			System.out.println(getName() + " popped " + num);
			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
