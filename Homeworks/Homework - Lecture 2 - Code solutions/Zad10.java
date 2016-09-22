package hw02;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		// Input a number from the keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		boolean isPrime = true;
		// Loop
		for (int i = 2; i < number; i++) {
			// On each iteration check against % ==0
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		// Check whether isPrime is true and print output
		if (isPrime) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " isn't prime");
		}
	}

}
