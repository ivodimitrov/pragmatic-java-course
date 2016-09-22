package qa2;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Моля, въведете число:");
		int number = scanner.nextInt();
		
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
