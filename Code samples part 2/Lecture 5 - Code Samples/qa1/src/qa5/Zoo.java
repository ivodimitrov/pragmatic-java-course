package qa5;

public class Zoo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe();
		animal.walk();
		
		Cat littleKitten = new Cat();
		littleKitten.climb();
		littleKitten.walk();
		
		Lion alex = new Lion();
		alex.roar();
		alex.climb();
		alex.walk();
		
		System.out.println(alex.getAge());
		alex.setAge(23);
		System.out.println(alex.getAge());
	}
}