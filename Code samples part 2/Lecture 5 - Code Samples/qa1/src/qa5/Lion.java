package qa5;

public class Lion extends Cat {
	public void roar() {
		System.out.println("Listening to Katy Perry");
	}

	@Override
	public void climb() {
		if (weight < 100) {
			System.out.println("Climbing like a beast");
		} else {
			System.out.println("Maan, I'm too fat");
		}
	}
}