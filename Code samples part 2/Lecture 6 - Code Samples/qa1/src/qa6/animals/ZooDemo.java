package qa6.animals;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo zooPark = new Zoo(10);
		
		Dog dog = new Dog(2, 44);
		Cat cat = new Cat(3, 44.3);
		
		zooPark.addAnimal(dog);
		zooPark.addAnimal(cat);
		
		System.out.println(zooPark.getAnimalsCount());
	}
}