package qa6.interfaces;

public class Circle implements Shape, Geometry {
	private double radius;
	
	private static final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * radius * PI;
	}

	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public void calculate() {
		System.out.println("Alabala");
	}
}
