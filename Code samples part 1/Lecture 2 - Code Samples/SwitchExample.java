package lecture2;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		System.out.println("Моля, въведете число между 1 и 12");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		String result;
		
		switch (month) {
			case 1:
				result = "Януари";
				break;
			case 2:
				result = "Февруари";
				break;
			case 3:
				result = "March";
				break;
			case 4:
				result = "April";
				break;
			case 5:
				result = "May";
				break;
			case 6:
				result = "June";
				break;
			case 7:
				result = "July";
				break;
			case 8:
				result = "August";
				break;
			case 9:
				result = "September";
				break;
			case 10:
				result = "October";
				break;
			case 11:
				result = "November";
				break;
			case 12:
				result = "December";
				break;
			default:
				result = "Въведената стойност не е между 1 и 12";
				break;
		}
		
		System.out.println(result);
	}
}
