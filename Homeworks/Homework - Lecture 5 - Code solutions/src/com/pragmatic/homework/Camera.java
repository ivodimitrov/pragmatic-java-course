package com.pragmatic.homework;

public class Camera {
	protected String color;
	protected int battery;
	protected boolean hasStabilization;
	protected int maxMemory;
	
	public Camera() {
		battery = 100;
		maxMemory = 10;
	}

	public Camera(String color, int battery, boolean hasStabilization, int maxMemory) {
		this.color = color;
		this.battery = battery;
		this.hasStabilization = hasStabilization;
		this.maxMemory = maxMemory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public boolean isHasStabilization() {
		return hasStabilization;
	}

	public void setHasStabilization(boolean hasStabilization) {
		this.hasStabilization = hasStabilization;
	}

	public int getMaxMemory() {
		return maxMemory;
	}

	public void setMaxMemory(int maxMemory) {
		this.maxMemory = maxMemory;
	}
	
	public void turnOn() {
		System.out.println("Camera is turning on.");
	}
	
	public void turnOff() {
		System.out.println("Camera is turning off.");
	}
	
	public void takePhoto() {
		if (maxMemory < 1) {
			System.out.println("Not enough memory to take a photo.");
			return;
		}
		
		maxMemory--;
		System.out.println("Photo has been taken successfully.");
	}

	@Override
	public String toString() {
		return "Camera [color=" + color + ", battery=" + battery + ", hasStabilization=" + hasStabilization
				+ ", maxMemory=" + maxMemory + "]";
	}
}