package qa6.interfaces;

public class Rectangle implements Shape {
	private double sideA;
	private double sideB;
	
	public Rectangle(double sideA, double sideB) {
		if (sideA < 1) {
			sideA = 1;
		}
		if (sideB < 1) {
			sideB = 1;
		}
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * sideA + 2 * sideB;
	}

	@Override
	public double calculateArea() {
		return sideA * sideB;
	}
}
