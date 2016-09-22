package hw02;

import java.util.Scanner;

public class Zad09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		
		System.out.println("Enter B:");
		int b = sc.nextInt();
		
		if(a > b) {
			int buf = b;
			b = a;
			a = buf;
		}
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if(i % 3 != 0) {
				System.out.print(i*i);
				sum += i*i;
			} else {
				System.out.print("skip " + i);
			}
			if(sum > 200)
				break;
			if(i != b)
				System.out.print(", ");
		}
	}
}
