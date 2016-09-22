package hw01;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		
		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		int temp = b;
		b = a;
		a = temp;
		System.out.println("A is " + a);
		System.out.println("B is " + b);
		
	}

}
