package app.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Schedualler {

	private Set<Task> tasks = new TreeSet<Task>();
	private SchedulerThread thread;

	public void addTask(Task task) {
		if (task.getDeadline().isBefore(LocalDateTime.now())) {
			throw new RuntimeException("you can't add tasks for the past");
		}
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

	public Task getLastTask() {
		List<Task> list = new ArrayList<Task>(this.tasks);
		return list.get(list.size() - 1);
	}

	public Set<Task> getAllTasks() {
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
		this.thread = new SchedulerThread();
		thread.start();
	}

	public void stopMonitoringTasks() {
		this.thread.interrupt();
	}

	private class SchedulerThread extends Thread {
		@Override
		public void run() {
			while (true) {
				Schedualler.this.checkDeadlines();
//				System.out.println("thread is checking");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					break;
				}
			}

			System.out.println("thread is stopped");
		}
	}

	private void checkDeadlines() {
		LocalDateTime now = LocalDateTime.now();
		for (Task task : tasks) {
			if (task.getDeadline().isBefore(now) && !task.isAlertPopped()) {
				task.setAlertPopped(true);
				System.out.println("===== ALERT for due task !!! " + task);
			}
		}
	}

}
