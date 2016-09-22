package com.pragmatic.homework;

public class FujiCamera extends Camera {
	
	public FujiCamera() {
		super(); // call parent constructor
	}

	public FujiCamera(String color, int battery, boolean hasStabilization, int maxMemory) {
		super(color, battery, hasStabilization, maxMemory); // call parent constructor
	}

	@Override
	public void turnOn() {
		System.out.println("Fuji camera is turning on");
	}

	@Override
	public void turnOff() {
		System.out.println("Fuji camera is turning off");
	}

	@Override
	public void takePhoto() {
		System.out.println("Fuji is taking a photo:");
		super.takePhoto();
	}
}
