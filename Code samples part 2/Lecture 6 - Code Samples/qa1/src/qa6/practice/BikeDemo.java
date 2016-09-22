package qa6.practice;

import java.util.Scanner;

public class BikeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input bicycle price:");
		double bicyclePrice = scanner.nextDouble();
		
		System.out.println("Input bicycle maxSpeed:");
		int bicycleMaxSpeed = scanner.nextInt();
		
		Bicycle balkan4i = new Bicycle(bicyclePrice, bicycleMaxSpeed);
		System.out.println("Bicycle price: " + balkan4i.calculatePrice());
		
		int suzukiGears = scanner.nextInt();
		Bike suzuki = new Bike(bicyclePrice, bicycleMaxSpeed, suzukiGears);
		
		TrackBike honda = new TrackBike(bicyclePrice, bicycleMaxSpeed, suzukiGears, true);
		System.out.println("Track bike price: " + honda.calculatePrice());
	}
}
