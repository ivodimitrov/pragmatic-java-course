package hw04;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiscMemory;
	double freeMemory;
	String operationSystem;
	
	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiscMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook,
			double hardDiscMemory, double freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiscMemory = hardDiscMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer comp) {
		if(price > comp.price) {
			return -1;
		}
		if(price < comp.price) {
			return 1;
		}
		//the prices are equals
		return 0;
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
		System.out.println("The new operation system is: " + newOperationSystem);
	}
	
	void useMemory(double memory) {
		if(memory > freeMemory) {
			System.out.println("There is not enought memory");
		} else {
			freeMemory = freeMemory - memory;
		}
	}
}
