package qa3;

public class Car {
	int currentSpeed;
	int maxSpeed;
	String color;
	String brand;
	int gear;
	Person owner;
	
	@Override
	public String toString() {
		return "Car [owner = " + owner.name + ", currentSpeed = " + currentSpeed + ", maxSpeed = " + maxSpeed + ", color = " + color + ", brand = " + brand
				+ ", gear = " + gear + "]";
	}
	
	void accelerate(int speed) {
		if (currentSpeed + speed > maxSpeed) {
			System.out.println("Cannot accelerate that much");
		} else {
			currentSpeed += speed;
		}
	}
	
	void changeGearUp() {
		if (gear < 5) {
			gear++;
		}
	}
	
	void changeGearDown() {
		if (gear > 1) {
			gear--;
		}
	}
	
	void chageColor(String color) {
		this.color = color;
	}
}