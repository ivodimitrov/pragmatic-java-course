package com.pragmatic.test.task6;

public class Playground {
	public static void main(String[] args) {
		Ball football = new Football();
		football.setBounceFactor(20.3);
		football.setRadius(15.3);
		
		System.out.println(football);
		football.roll();
		football.bounce();
		
		System.out.println();
		
		Ball volleyball = new Volleyball(18.8, 17.2);
		System.out.println(volleyball);
		volleyball.roll();
		volleyball.bounce();
		
		System.out.println();
		
		Ball baseball = new Baseball(3.2, 7.3);
		System.out.println(baseball);
		baseball.roll();
		baseball.bounce();
	}
}
