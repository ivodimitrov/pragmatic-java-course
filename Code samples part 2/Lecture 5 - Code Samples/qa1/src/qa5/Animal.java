package qa5;

public class Animal {
	protected int age;
	protected double weight;
	
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

	public void breathe() {
		System.out.println("Animal is breathing");
	}
	
	public void walk() {
		System.out.println("Animal is walking");
	}
}