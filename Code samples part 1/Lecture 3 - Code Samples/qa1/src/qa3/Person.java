package qa3;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean has18;
	double weight;
	Person friend;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", personalNumber=" + personalNumber + ", has18=" + has18
				+ ", weight=" + weight + "]";
	}
	
	void eat() {
		System.out.println(name + " is eating musaka");
	}
	
	void walk() {
		System.out.println(name + " keeps walking");
	}
	
	void drinkBeer(double beerAmount) {
		if (beerAmount < 1.3) {
			System.out.println(name + " says 'Gimme more'");
		} else {
			System.out.println(name + " says 'I'm happy'");
		}
	}
	
	boolean hasFriend() {
		if (friend != null) {
			return true;
		} else {
			return false;
		}
	}
}