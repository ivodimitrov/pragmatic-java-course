package qa2;

import java.util.Scanner;

public class BiggerThan10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number > 10) {
			System.out.println("Числото е по-голямо от 10");
		} else if (number < 10) {
			System.out.println("Числото е по-малко от 10");
		} else {
			System.out.println("Числото е равно на 10");
		}
	}
}
