package qa9.practice;

import java.util.Scanner;

public class Rectangle implements Shape {
	private double sideA;
	private double sideB;
	
	public Rectangle() {
		try {
			init();
		} catch(RuntimeException re) {
			System.out.println("The provided input is invalid");
			this.sideA = 0;
			this.sideB = 0;
		}
	}
	
	private void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide length of side A:");
		this.sideA = scanner.nextInt();
		
		System.out.println("Please, provide length of side B:");
		this.sideB = scanner.nextInt();
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * sideA + 2 * sideB;
		System.out.println("Perimeter is: " + perimeter);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = sideA * sideB;
		System.out.println("Area is: " + area);;
		return area;
	}
}