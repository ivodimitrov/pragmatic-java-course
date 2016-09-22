package qa8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
	List<Employee> employees;
	
	public Company() {
		employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(double salary) {
		Iterator<Employee> it = employees.iterator();
		
//		for (Iterator<Employee> i = employees.iterator(); i.hasNext();) {
//			Employee em = i.next();
//		}
		
		while (it.hasNext()) {
			Employee employee = it.next();
			if (employee.getSalary() >= salary) {
				it.remove();
			}
		}
	}
	
	public void printSortedByName() {
		Collections.sort(employees, new EmployeeNameComparator());
		System.out.println("printing sorted by name:");
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
//		employees.forEach(employee -> System.out.println(employee));
	}
	
	public void printSortedByAge() {
		Collections.sort(employees, new EmployeeAgeComparator());
		System.out.println("printing sorted by age:");
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
	}
	
	public void printSortedBySalary() {
		Collections.sort(employees, new EmployeeSalaryComparator());
		System.out.println("printing sorted by salary:");
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
	}
}
