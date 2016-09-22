package qa6.animals;

public abstract class Animal {
	protected int age;
	protected double weight;
	
	public Animal(int age, double weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void walk() {
		System.out.println("Animal is walking");
	}
	
//	public void breathe() {
//		System.out.println("Animal is breathing");
//	}
	
	public abstract void makeSomeNoise();
}
