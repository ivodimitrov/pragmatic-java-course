package qa6.animals;

public class Dog extends Animal {

	public Dog(int age, double weight) {
		super(age, weight);
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("bark");
	}
}