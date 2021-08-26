package a;

import app.core.Schedualler;

public class Tests2 {
	public static void main(String[] args) throws InterruptedException {
		Schedualler s = new Schedualler();
		s.startMonitoringTasks();

		Thread.sleep(5000);

		s.stopMonitoringTasks();
	}

}
