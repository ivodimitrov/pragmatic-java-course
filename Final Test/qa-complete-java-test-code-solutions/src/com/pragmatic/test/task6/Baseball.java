package com.pragmatic.test.task6;

public class Baseball extends Ball {
	
	public Baseball() {
		super();
	}

	public Baseball(double bounceFactor, double radius) {
		super(bounceFactor, radius);
	}

	@Override
	public void bounce() {
		System.out.println("Baseball is bouncing");
	}

	@Override
	public void roll() {
		System.out.println("Baseball is rolling");
	}
}