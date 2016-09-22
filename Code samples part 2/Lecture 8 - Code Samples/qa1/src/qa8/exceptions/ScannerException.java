package qa8.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide a number:");
		
		int number = -1;
		int counter = 0;
		boolean isProvided = false;
		while (counter < 3 && !isProvided) {
			try {
				number = scanner.nextInt();
				isProvided = true;
			} catch (InputMismatchException e) {
				System.out.println("The provided input is not a number");
				scanner.nextLine();
			} finally {
				counter++;
			}
		}
		
		if (!isProvided) {
			System.out.println("sorry, you are stupid");
			return;
		}
		
		System.out.println("Number is " + number);
		scanner.close();
	}
}