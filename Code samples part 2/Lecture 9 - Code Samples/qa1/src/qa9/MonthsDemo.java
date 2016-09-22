package qa9;

import java.util.Scanner;

public class MonthsDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Months jan = Months.JANUARY;
		Months may = Months.MAY;
		
		System.out.println(jan == may);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide August");
		
		String augustString = scanner.next();
		Months august = Months.fromString(augustString);
		
		if (august == Months.AUGUST) {
			System.out.println("Good job!");
		} else {
			System.out.println("You didn't provide August");
		}
		
	}
}