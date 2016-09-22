package qa4;

public class CarsDemo {
	public static void main(String[] args) {
		Car kolichka = new Car("ferrari", "red", true);
		System.out.println(kolichka);
		
		Car tarataika = new Car();
		System.out.println(tarataika);
		
		Person johnDoe = new Person();
		Car johnsCar = new Car("laguna", 220, johnDoe);
		System.out.println(johnsCar);
	}
}