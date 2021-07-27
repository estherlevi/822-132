package aDemos;

public class Manager extends Employee {

	// attribute
	private String department;

	public Manager() {
	}

	public Manager(String name, double salary, String department) {
		// calling a CTOR on the super class and pass arguments
		super(name, salary);
		this.department = department;
	}

	// methods
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
