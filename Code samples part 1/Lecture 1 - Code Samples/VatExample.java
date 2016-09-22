package lesson01;

import java.util.Scanner;

public class VatExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price:");
		double price = sc.nextDouble();
		double vat = price * 0.2;
		
		System.out.println("The VAT of " + price + "$ is " + vat + "$");
	}
}
