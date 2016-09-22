package qa4;

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Въведете първото число: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Въведете второто число: ");
		double num2 = scanner.nextDouble();
		
		Calculator elka = new Calculator();
		double sum = elka.add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		double diff = elka.diff(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + diff);
	}
}
