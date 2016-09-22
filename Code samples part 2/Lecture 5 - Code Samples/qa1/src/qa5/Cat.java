package qa5;

public class Cat extends Animal {
	protected void climb() {
		System.out.println("Meowww I am climbing.");
	}

	@Override
	public void walk() {
		System.out.println("walking on sunshine");
	}
}