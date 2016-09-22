package qa4;

public class Car {
	String brand;
	String color;
	boolean isSportsCar;
	int doorsCount;
	int maxSpeed;
	int gear;
	Person owner;
	
	Car() {
		
	}
	
	Car(String brand, String color, boolean isSportsCar) {
		this.brand = brand;
		this.color = color;
		this.isSportsCar = isSportsCar;
	}

	public Car(String brand, String color, boolean isSportsCar, int doorsCount, int maxSpeed, int gear) {
		this(brand, color, isSportsCar);
		this.doorsCount = doorsCount;
		this.maxSpeed = maxSpeed;
		this.gear = gear;
	}
	
	Car(String brand, int maxSpeed, Person owner) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", isSportsCar=" + isSportsCar + ", doorsCount="
				+ doorsCount + ", maxSpeed=" + maxSpeed + ", gear=" + gear + ", owner=" + owner + "]";
	}
}