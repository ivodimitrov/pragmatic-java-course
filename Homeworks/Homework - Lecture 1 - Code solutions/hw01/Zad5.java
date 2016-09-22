package hw01;

import java.util.Scanner;

public class Zad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();

		System.out.println("Enter c:");
		int c = sc.nextInt();

		if (a > b && b > c) {
			System.out.println(a + " " + b + " " + c);
		} else {
			if (b > a && a > c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				if (c > b && b > a) {
					System.out.println(c + " " + b + " " + a);
				}
			}
			//....
		}
	}
}
