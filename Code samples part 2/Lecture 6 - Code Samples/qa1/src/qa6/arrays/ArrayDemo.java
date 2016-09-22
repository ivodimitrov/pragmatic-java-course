package qa6.arrays;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Please, provide name " + (i + 1) + ":");
			names[i] = scanner.nextLine();
		}
		
		System.out.println("Provided names are listed below:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
