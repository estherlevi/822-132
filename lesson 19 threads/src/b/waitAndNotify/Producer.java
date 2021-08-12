package b.waitAndNotify;

// יצרן
public class Producer extends Thread {

	private Stack stack; // the stack to add
	private int amount; // how many numbers to add
	private long rate; // how many milliseconds to sleep between each push

	public Producer(String name, Stack stack, int amount, long rate) {
		super(name);
		this.stack = stack;
		this.amount = amount;
		this.rate = rate;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int r = (int) (Math.random() * 101);
			this.stack.push(r);
			System.out.println(getName() + " pushed " + r);
			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
