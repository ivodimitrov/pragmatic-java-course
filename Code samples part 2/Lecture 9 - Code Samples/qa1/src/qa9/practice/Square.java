package qa9.practice;

import java.util.Scanner;

public class Square implements Shape {
	private double side;
	
	public Square() {
		try {
			init();
		} catch(RuntimeException re) {
			System.out.println("The provided input is invalid");
			this.side = 0;
		}
	}
	
	private void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide length of side:");
		this.side = scanner.nextInt();
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 4 * side;
		System.out.println("Perimeter is: " + perimeter);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = side * side;
		System.out.println("Area is: " + area);;
		return area;
	}
}