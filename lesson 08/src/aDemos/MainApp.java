package aDemos;

public class MainApp {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setName("David");
		e.setSalary(25_000);
		System.out.println(e.getName());
		System.out.println(e.getSalary());

		Manager m = new Manager();
		m.setName("Roni");
		m.setSalary(30_000);
		m.setDepartment("Sales");
		System.out.println(m.getName());
		System.out.println(m.getSalary());
		System.out.println(m.getDepartment());

	}

}
