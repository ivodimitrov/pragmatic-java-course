package com.pragmatic.test;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Въведете число " + (i + 1) + ": ");
			int number = scanner.nextInt();
			
			if (isPrime(number)) {
				sum += number;
			}
		}
		
		scanner.close();
		System.out.println("Сумата на въведените прости числа е: " + sum);
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i ++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
