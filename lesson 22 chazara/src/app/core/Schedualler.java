package app.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Schedualler {

	private List<Task> tasks = new ArrayList<Task>();

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void removeTask(int taskId) {
		Iterator<Task> it = this.tasks.iterator();

		while (it.hasNext()) {
			Task currTask = it.next();
			if (currTask.id == taskId) {
				it.remove();
				return;
			}
		}
	}

	public void displayTasks() {
		System.out.println("=== tasks =========");
		for (Task task : tasks) {
			System.out.println(task);
		}
		System.out.println("===================");
	}

	public static void main(String[] args) {
		Schedualler s = new Schedualler();
		s.addTask(new Task("aaa", LocalDateTime.now().plusHours(2), false));
		s.addTask(new Task("bbb", LocalDateTime.now().plusHours(3), false));
		s.addTask(new Task("ccc", LocalDateTime.now().plusHours(5), false));

		s.displayTasks();
	}

}
