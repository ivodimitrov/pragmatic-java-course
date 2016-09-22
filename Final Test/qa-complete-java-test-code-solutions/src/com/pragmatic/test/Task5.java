package com.pragmatic.test;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете големина на масива:");
		
		int size = scanner.nextInt();
		if (size <= 3) {
			System.out.println("Въвели сте число по-малко или равно на 3");
			return;
		}
		
		int[] numbers = new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Въведете число " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			System.out.println();
		}
		
		Arrays.sort(numbers);
		
		System.out.println("Първите най-малки 3 числа са :");
		System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
	}
}
