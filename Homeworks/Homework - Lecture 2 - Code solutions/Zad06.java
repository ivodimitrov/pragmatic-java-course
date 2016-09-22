package hw02;

import java.util.Scanner;

public class Zad06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			//sum += i;
			sum = sum + i;
		}
		
		System.out.println("The sum is " + sum);
	}
}
