package qa9.practice;

import java.util.Scanner;

public class ShapesRunner {
	public static void main(String[] args) {
		
		Scanner choiceScanner = new Scanner(System.in);
		while (true) {
			System.out.println("####################################");
			System.out.println("Welcome, choose:");
			System.out.println("#1: for area and perimeter of Square");
			System.out.println("#2: for area and perimeter of Rectangle");
			System.out.println("#3: for area and perimeter of Triangle");
			System.out.println("#0: for Exit");
			
			int choice = choiceScanner.nextInt();
			
			Shape shape = null;
			if (choice == 0) {
				System.out.println("Byeee");
				break;
			} else if (choice == 1) {
				shape = new Square();
			} else if (choice == 2) {
				shape = new Rectangle();
			} else if (choice == 3) {
				shape = new Triangle();
			} else {
				System.out.println("No such choice");
				continue;
			}
			
			shape.calculatePerimeter();
			shape.calculateArea();
		}
		
		choiceScanner.close();
	}

}