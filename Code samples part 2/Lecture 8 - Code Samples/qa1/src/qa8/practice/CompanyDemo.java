package qa8.practice;

import java.util.Scanner;

public class CompanyDemo {
	public static void main(String[] args) {
		Company tkzs = new Company();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Please provide name " + (i + 1));
			String name = scanner.next();
			
			System.out.println("Please provide age " + (i + 1));
			int age = scanner.nextInt();
			
			System.out.println("Please provide salary " + (i + 1));
			double salary = scanner.nextDouble();
			
			Employee employee = new Employee(name, age, salary);
			tkzs.addEmployee(employee);
		}
		
		tkzs.printSortedByName();
		
		tkzs.removeEmployee(100);
		
		tkzs.printSortedBySalary();
	}
}