package com.pragmatic.test.task6;

public class Football extends Ball {
	public Football() {
		
	}
	
	public Football(double bounceFactor, double radius) {
		super(bounceFactor, radius);
	}

	@Override
	public void bounce() {
		System.out.println("Football is bouncing");
	}

	@Override
	public void roll() {
		System.out.println("Football is rolling");
	}
}