package qa7.practice.pizza;

public class FloraPizzaMaker extends AbstractPizzaMaker {

	public FloraPizzaMaker(double price, int slicesCount) {
		super(price, slicesCount);
	}

	@Override
	protected void makeDoe() {
		System.out.println("Flora doe is being made.");
	}

	@Override
	protected void makeTopping() {
		System.out.println("Flora topping master chef baby");
	}
}