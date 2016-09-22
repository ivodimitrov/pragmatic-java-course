package hw02;

import java.util.Scanner;

public class Zad07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		int counter = 0;
		for (int i = 3; true ; i++) {
			if( i == 3) {
				System.out.print(i);
				counter ++;
			} else if(i % 3 == 0) {
				System.out.print("," + i);
				counter++;
			}
			
			if(counter == n) {
				break;
			}
			
		}
		
	}
}
//5
//3 6 9 12 15
//
//3
//3 6 9