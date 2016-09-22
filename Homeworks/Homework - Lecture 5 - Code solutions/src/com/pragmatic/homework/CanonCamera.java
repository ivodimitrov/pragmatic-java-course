package com.pragmatic.homework;

public class CanonCamera extends Camera {
	
	public CanonCamera() {
		super(); // call parent constructor
	}

	public CanonCamera(String color, int battery, boolean hasStabilization, int maxMemory) {
		super(color, battery, hasStabilization, maxMemory); // call parent constructor
	}

	@Override
	public void turnOn() {
		System.out.println("Canon camera is turning on");
	}

	@Override
	public void turnOff() {
		System.out.println("Canon camera is turning off");
	}

	@Override
	public void takePhoto() {
		System.out.println("Canon is taking a photo:");
		super.takePhoto();
	}
}