package hw05;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer lenovo = new Computer();
		
		hp.year = 2000;
		hp.hardDiscMemory = 200;
		hp.freeMemory = hp.hardDiscMemory;
		hp.isNotebook = false;
		hp.operationSystem = "Linux";
		hp.price = 1000;
		
		lenovo.year = 2010;
		lenovo.hardDiscMemory = 300;
		lenovo.freeMemory = lenovo.hardDiscMemory;
		lenovo.isNotebook = true;
		lenovo.operationSystem = "Windows";
		lenovo.price = 2000;
		
		lenovo.changeOperationSystem("Linux");
		lenovo.useMemory(300);
		hp.useMemory(100);

		System.out.println("HP:" + "year=" + hp.year + " " + "price=" + hp.price + " " + "isNotebook="
				+ hp.isNotebook + " " + "hardDiskMemory=" + hp.hardDiskMemory + " " + "freeMemory="
				+ hp.freeMemory + " " + "operationSystem=" + hp.operationSystem);

		System.out.println("Lenovo:" + "year=" + lenovo.year + " " + "price=" + lenovo.price + " " + "isNotebook="
				+ lenovo.isNotebook + " " + "hardDiskMemory=" + lenovo.hardDiskMemory + " " + "freeMemory="
				+ lenovo.freeMemory + " " + "operationSystem=" + lenovo.operationSystem);
	}
}
