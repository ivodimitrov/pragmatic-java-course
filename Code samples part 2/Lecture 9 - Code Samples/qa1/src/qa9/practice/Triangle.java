package qa9.practice;

import java.util.Scanner;

public class Triangle implements Shape {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle() {
		try {
			init();
		} catch(RuntimeException re) {
			System.out.println("The provided input is invalid");
			this.sideA = 0;
			this.sideB = 0;
			this.sideC = 0;
		}
	}
	
	private void init() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide length of side A:");
		this.sideA = scanner.nextInt();
		
		System.out.println("Please, provide length of side B:");
		this.sideB = scanner.nextInt();
		
		System.out.println("Please, provide length of side C:");
		this.sideC = scanner.nextInt();
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = sideA + sideB + sideC;
		System.out.println("Perimeter is: " + perimeter);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double hp = calculatePerimeter() / 2;
		double area = Math.sqrt(hp * (hp - sideA) * (hp - sideB) * (hp - sideC));
		System.out.println("Area is: " + area);
		return area;
	}
}