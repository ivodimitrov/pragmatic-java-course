package qa2;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Моля въведете число");
		int a = s.nextInt();
		boolean b = s.nextBoolean();
		
		if (b) { // if (b == true)
			System.out.println("Въведохте: " + a);
		} else {
			System.out.println("Нищо не казвам!");
		}
	}
}
