package com.pragmatic.test.task6;

public class Volleyball extends Ball {
	
	public Volleyball() {
		super();
	}

	public Volleyball(double bounceFactor, double radius) {
		super(bounceFactor, radius);
	}

	@Override
	public void bounce() {
		System.out.println("Volleyball is bouncing");
	}

	@Override
	public void roll() {
		System.out.println("Volleyball is rolling");
	}
}