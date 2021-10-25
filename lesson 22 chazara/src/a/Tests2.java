package a;

import java.time.LocalDateTime;

import app.core.Schedualler;
import app.core.Task;

public class Tests2 {
	public static void main(String[] args) throws InterruptedException {

		Schedualler s = new Schedualler();
		s.startMonitoringTasks();

		Thread.sleep(1000);

		s.addTask(new Task("test", LocalDateTime.now().plusSeconds(10), false));
		s.displayTasks();

		Thread.sleep(15_000);
		s.displayTasks();

		s.stopMonitoringTasks();
	}

}
