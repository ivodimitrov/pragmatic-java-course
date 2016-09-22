package hw02;

import java.util.Scanner;

public class Zad08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int number = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(number + " ");
			}
			System.out.println();
			number = number + 2;
		}
		
		
	}
}
