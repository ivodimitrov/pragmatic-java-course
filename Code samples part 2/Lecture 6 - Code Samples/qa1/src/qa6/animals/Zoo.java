package qa6.animals;

public class Zoo {
	private Animal[] animals;
	
	public Zoo(int count) {
		animals = new Animal[count];
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			// finds the first empty element in the array
			if (animals[i] == null) {
				animals[i] = animal;
				return;
			}
		}
		
		System.out.println("Not enough space, find another zoo");
	}
	
	public int getAnimalsCount() {
		int count = 0;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				return count;
			}
			count++;
		}
		return count;
	}
}
