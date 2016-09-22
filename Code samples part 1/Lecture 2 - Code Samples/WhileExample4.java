package qa2;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Моля, въведете число:");
		int number = scanner.nextInt();
		
		int i = 100;
		while (i > 0) {
			if (i % number == 0) {
				System.out.println(i);
			}
			i--;
		}
	}
}
