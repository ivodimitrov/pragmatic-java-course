package qa7.arrays;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Provide number " + (i + 1));
			numbers[i] = scanner.nextInt();
		}
		
		int min = numbers[0];
		
		// enhanced for loop		
//		for (int i : numbers) {
//			if (min > i) {
//				min = i;
//			}
//		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		System.out.println("Minimum number is: " + min);
	}
}