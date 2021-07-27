package a.targil;

import java.util.List;

public class EmployeeStatistics {

	/**
	 * @param employees the list of employees on which we need to calculate average
	 *                  salary
	 * @return the average
	 * @throws RuntimeException if the list is empty
	 */
	public static double averageSalary(List<? extends Employee> employees) throws RuntimeException {
		double sum = 0;
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null) {
				sum += currEmp.getSalary();
				n++;
			}
		}
		if (n > 0) {
			double avg = sum / n;
			return avg;
		} else {
			throw new RuntimeException("no average - list is empty");
		}
	}

	public static int getNumberOfEmployees(List<? extends Employee> employees) {
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null) {
				n++;
			}
		}
		return n;
	}

	public static int getNumberOfEmployees(List<? extends Employee> employees, String department) {
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null && currEmp.getDepartment().equals(department)) {
				n++;
			}
		}
		return n;
	}

}
