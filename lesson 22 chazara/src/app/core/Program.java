package app.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Program program = new Program();
		program.start();
	}

	private Schedualler schedualler = new Schedualler();
	private Scanner sc = new Scanner(System.in);

	private void start() {
		this.schedualler.startMonitoringTasks();
		lbl: while (true) {
			try {

				displayMenu();
				String command = sc.nextLine();

				switch (command) {
				case "add":
				case "1":
					doAddTask();
					System.out.println("task added");
					break;
				case "disp":
				case "2":
					doDispTasks();
					break;
				case "x":
					break lbl;
				default:
					System.out.println("unsupported command: " + command);
				}
			} catch (Exception e) {

				System.out.println("Error: " + e.getMessage());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}

		this.sc.close();
		this.schedualler.stopMonitoringTasks();
		System.out.println("Bye");
	}

	private void doDispTasks() {
		this.schedualler.displayTasks();
	}

	private void doAddTask() {
		Task task = new Task();
		System.out.println("enter task description");
		String description = sc.nextLine();
		task.setDescription(description);
		// get the deadline from user
		LocalDate today = LocalDate.now();
		System.out.println("enter hour");
		int hour = Integer.parseInt(sc.nextLine());
		System.out.println("enter minute");
		int minute = Integer.parseInt(sc.nextLine());
		System.out.println("enter seconds");
		int seconds = Integer.parseInt(sc.nextLine());
		LocalTime time = LocalTime.of(hour, minute, seconds);
		// set the deadline of the task
		task.setDeadline(LocalDateTime.of(today, time));
		// add the task to the scheduler
		this.schedualler.addTask(task);

	}

	private void displayMenu() {
		System.out.println("\n======== MENU ===================");
		System.out.println("add task .......... add / 1");
		System.out.println("display tasks ..... disp / 2");
		System.out.println("quit .............. x");
		System.out.print("your choice: ");
	}

}
