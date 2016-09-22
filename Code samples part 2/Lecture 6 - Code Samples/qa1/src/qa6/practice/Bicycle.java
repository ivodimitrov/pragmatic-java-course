package qa6.practice;

public class Bicycle {
	protected double price;
	protected int maxSpeed;
	
	public Bicycle(double price, int maxSpeed) {
		System.out.println("Bicycle constructor invoked");
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculatePrice() {
		return Math.random() * 10 * price;
	}
}