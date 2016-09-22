package com.pragmatic.homework;

public class NikonCamera extends Camera {
	
	public NikonCamera() {
		super(); // call parent constructor 
	}

	public NikonCamera(String color, int battery, boolean hasStabilization, int maxMemory) {
		super(color, battery, hasStabilization, maxMemory); // call parent constructor
	}

	@Override
	public void turnOn() {
		System.out.println("Nikon camera is turning on");
	}

	@Override
	public void turnOff() {
		System.out.println("Nikon camera is turning off");
	}

	@Override
	public void takePhoto() {
		System.out.println("Nikon is taking a photo:");
		super.takePhoto();
	}
}