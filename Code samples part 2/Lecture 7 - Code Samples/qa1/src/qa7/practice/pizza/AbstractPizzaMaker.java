package qa7.practice.pizza;

public abstract class AbstractPizzaMaker implements PizzaMaker {
	protected double price;
	protected int slicesCount;
	
	public AbstractPizzaMaker(double price, int slicesCount) {
		this.price = price;
		this.slicesCount = slicesCount;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getSlicesCount() {
		return slicesCount;
	}
	
	public void setSlicesCount(int slicesCount) {
		this.slicesCount = slicesCount;
	}

	@Override
	public void makePizza() {
		makeDoe();
		makeTopping();
	}

	protected abstract void makeDoe();
	protected abstract void makeTopping();
}
