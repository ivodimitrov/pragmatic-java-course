package hw01;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		
		System.out.println("Enter B:");
		int b = sc.nextInt();
		
		System.out.println("Enter C:");
		int c = sc.nextInt();
		
		if ((a < c && c < b) || (b < c && c < a)) {
			System.out.println("C is between A and B!");
		} else {
			System.out.println("C is not between A and B!");
		}
	}
}
