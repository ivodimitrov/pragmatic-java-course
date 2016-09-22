package qa6.animals;

public class Cat extends Animal {

	public Cat(int age, double weight) {
		super(age, weight);
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("meaw");
	}
}