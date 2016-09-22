package com.pragmatic.test;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете низ:");
		String longString = scanner.next();
		
		System.out.println("Въведете буква:");
		char letter = scanner.next().charAt(0);
		
		int counter = 0;
		for (int i = 0; i < longString.length(); i++) {
			if (letter == longString.charAt(i)) {
				counter++;
			}
		}
		
		scanner.close();
		System.out.println("Буквата " + letter + " се среща " + counter + " пъти");
	}
}
