package a.targil;

public class Manager extends Employee {

	public Manager() {
	}

	public Manager(String first, String last, double salary, String department) {
		super(first, last, salary, department);
	}

	@Override
	public String toString() {
		return "Manager [first=" + getFirst() + ", last=" + getLast() + ", salary=" + getSalary() + ", department="
				+ getDepartment() + "]";
	}

}
