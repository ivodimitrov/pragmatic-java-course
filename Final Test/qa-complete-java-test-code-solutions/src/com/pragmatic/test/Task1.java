package com.pragmatic.test;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Въведете число " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			System.out.println();
		}
		
		int minNumber = numbers[0];
		int maxNumber = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
			
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		
		scanner.close();
		
		System.out.println("Минималното число е " + minNumber);
		System.out.println("Максималното число е " + maxNumber);
	}
}
