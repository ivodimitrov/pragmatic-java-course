package qa2;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Моля, въведете първото число:");
		int number1 = scanner.nextInt();
		
		System.out.println("Моля, въведете второто число:");
		int number2 = scanner.nextInt();
		
		int min = (number1 < number2) ? number1 : number2;
		int max = (number1 > number2) ? number1 : number2;
		
		int min2 = Math.min(number1, number2);
		while (min <= max) {
			System.out.println(min);
			min++;
		}
		
		scanner.close();
	}
}
