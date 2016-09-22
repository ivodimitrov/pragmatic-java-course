package qa6.practice;

public class Bike extends Bicycle {
	protected int gears;
	
	public Bike(double price, int maxSpeed, int gears) {
		super(price, maxSpeed);
		this.gears = gears;
		System.out.println("Bike constructor invoked");
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public void makeNoise() {
		System.out.println("Making some noise");
	}
}
