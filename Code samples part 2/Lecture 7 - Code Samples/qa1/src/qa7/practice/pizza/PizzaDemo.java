package qa7.practice.pizza;

public class PizzaDemo {
	public static void main(String[] args) {
		PizzaMaker floraMaker = new FloraPizzaMaker(33.42, 12);
		PizzaMaker hawaiiMaker = new HawaiiPizzaMaker(12.32, 10);
		
		floraMaker.makePizza();
		hawaiiMaker.makePizza();
	}
}