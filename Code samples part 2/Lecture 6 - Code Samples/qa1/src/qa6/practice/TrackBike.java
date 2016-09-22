package qa6.practice;

public class TrackBike extends Bike {
	private boolean hasTractionControl;

	public TrackBike(double price, int maxSpeed, int gears, boolean hasTractionControl) {
		super(price, maxSpeed, gears);
		this.hasTractionControl = hasTractionControl;
		System.out.println("TrackBike constructor invoked");
	}

	public boolean isHasTractionControl() {
		return hasTractionControl;
	}

	public void setHasTractionControl(boolean hasTractionControl) {
		this.hasTractionControl = hasTractionControl;
	}

	@Override
	public double calculatePrice() {
		return super.calculatePrice() * 2;
	}
}
