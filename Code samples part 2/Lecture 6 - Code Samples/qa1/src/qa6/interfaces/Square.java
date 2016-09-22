package qa6.interfaces;

public class Square implements Shape {
	private double side;
	
	public Square(double side) {
		if (side < 1) {
			side = 1;
		}
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}
	
}
