package a;

import java.time.LocalDateTime;

import app.core.Schedualler;
import app.core.Task;

public class Tests {
	public static void main(String[] args) {
		Schedualler s = new Schedualler();
		s.addTask(new Task("aaa", LocalDateTime.now().plusHours(2), false));
		s.addTask(new Task("bbb", LocalDateTime.now().plusMinutes(3), false));
		s.addTask(new Task("ccc", LocalDateTime.now().plusHours(5), false));

		System.out.println(s.getTask(102));
		System.out.println(s.getTask(109));

		s.displayTasks();
		s.displayTueUntilTasks(LocalDateTime.now().plusHours(4));
	}

}
