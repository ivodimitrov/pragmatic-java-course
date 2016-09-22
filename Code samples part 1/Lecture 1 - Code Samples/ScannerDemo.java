package lesson01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		System.out.println("Your age is:" + age);
		
		System.out.println("Enter your height:");
		double height = scanner.nextDouble();
		System.out.println("Your height is " + height);
		
		System.out.println("Ponedelnik li e, pachanga: ");
		boolean isMonday = scanner.nextBoolean();
		System.out.println(isMonday);
		
	}

}
