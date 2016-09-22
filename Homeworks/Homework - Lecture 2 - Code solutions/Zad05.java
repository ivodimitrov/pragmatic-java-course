package hw02;

import java.util.Scanner;

public class Zad05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		if (a > b) {
			int buf = a;
			a = b;
			b = buf;
		}
		
		for (int i = a; i <= b ; i++) {
			System.out.print(i + " ");
		}
	}
}
