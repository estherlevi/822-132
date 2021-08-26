package app.core;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {

	public final int id;
	private String description;
	private LocalDateTime deadline;
	private boolean alertPopped;

	// class variable
	private static int nextId = 101;

	{ // initializer - runs before CTOR
		this.id = nextId++;
	}

	// CTOR 1
	public Task() {
	}

	// CTOR 3
	public Task(String description, LocalDateTime deadline, boolean alertPopped) {
		super();
		this.description = description;
		this.deadline = deadline;
		this.alertPopped = alertPopped;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public boolean isAlertPopped() {
		return alertPopped;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", deadline=" + deadline + ", alertPopped="
				+ alertPopped + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Task other) {
		return this.deadline.compareTo(other.deadline);
	}

}
