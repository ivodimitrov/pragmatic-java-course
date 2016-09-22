package qa7.practice.pizza;

public class HawaiiPizzaMaker extends AbstractPizzaMaker {

	public HawaiiPizzaMaker(double price, int slicesCount) {
		super(price, slicesCount);
	}

	@Override
	protected void makeDoe() {
		System.out.println("Hawaii doe tastes excellent");
	}

	@Override
	protected void makeTopping() {
		System.out.println("Salami and pineapple is weird");
	}
}