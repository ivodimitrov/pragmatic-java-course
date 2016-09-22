package hw01;

import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		double a = sc.nextDouble();
		System.out.println("Enter B:");
		double b = sc.nextDouble();

		if (a < b) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);
		}
	}
}
