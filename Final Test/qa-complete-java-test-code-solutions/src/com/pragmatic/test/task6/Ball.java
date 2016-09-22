package com.pragmatic.test.task6;

public abstract class Ball implements Bounceable {
	protected double bounceFactor;
	protected double radius;
	
	public Ball() {

	}

	public Ball(double bounceFactor, double radius) {
		this.bounceFactor = bounceFactor;
		this.radius = radius;
	}

	public double getBounceFactor() {
		return bounceFactor;
	}

	public void setBounceFactor(double bounceFactor) {
		this.bounceFactor = bounceFactor;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Ball [bounceFactor=" + bounceFactor + ", radius=" + radius + "]";
	}
}