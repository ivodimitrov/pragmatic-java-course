package qa8.practice;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		if (employee1.getAge() > employee2.getAge()) {
			return 1;
		} else if (employee1.getAge() < employee2.getAge()) {
			return -1;
		} 
		
		return 0;
	}
}