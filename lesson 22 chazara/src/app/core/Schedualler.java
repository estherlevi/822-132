package app.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Schedualler {

	private List<Task> tasks = new ArrayList<Task>();
	private SchedulerThread thread = new SchedulerThread();

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
		this.printTasks(this.tasks);
	}

	public void displayTueUntilTasks(LocalDateTime deadline) {
		this.printTasks(this.getAllTaskDue(deadline));
	}

	public Task getTask(int taskId) {
		for (Task task : tasks) {
			if (task.id == taskId) {
				return task;
			}
		}
		return null;
	}

	public List<Task> getAllTasks() {
		return this.tasks;
	}

	public List<Task> getAllTaskDue(LocalDateTime deadline) {
		List<Task> list = new ArrayList<Task>();
		for (Task task : this.tasks) {
			if (task.getDeadline().isBefore(deadline)) {
				list.add(task);
			}
		}
		return list;
	}

	public void printTasks(Collection<Task> col) {
		System.out.println("=== tasks ===========");
		for (Task task : col) {
			System.out.println(task);
		}
		System.out.println("=== ===== ===========");
	}

	public void startMonitoringTasks() {
		thread.start();
	}

	public void stopMonitoringTasks() {
		thread.interrupt();
	}

	private class SchedulerThread extends Thread {
		@Override
		public void run() {
			while (true) {
				// TODO: check due tasks
				System.out.println("thread is checking");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					break;
				}
			}

			System.out.println("thread is stopped");
		}
	}

}
