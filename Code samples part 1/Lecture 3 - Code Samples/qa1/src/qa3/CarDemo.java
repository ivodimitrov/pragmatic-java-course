package qa3;

public class CarDemo {
	public static void main(String[] args) {
		Car myBrichka = new Car();
		myBrichka.brand = "moskvi4";
		myBrichka.maxSpeed = 160;
		myBrichka.currentSpeed = 10;
		myBrichka.gear = 1;
		myBrichka.color = "blue";
		
		Person brichkaOwner = new Person();
		brichkaOwner.name = "Pesho";
		brichkaOwner.age = 22;
		myBrichka.owner = brichkaOwner;
		
		Car ferrari = new Car();
		ferrari.brand = "Ferrari";
		ferrari.maxSpeed = 300;
		ferrari.currentSpeed = 120;
		ferrari.gear = 3;
		ferrari.color = "orange";
		
		Person alfonso = new Person();
		alfonso.name = "Alfonso diMaria";
		alfonso.age = 37;
		ferrari.owner = alfonso;
		
		System.out.println(myBrichka.toString());
		System.out.println(ferrari.toString());
		
		myBrichka.currentSpeed = myBrichka.currentSpeed + 50;
		myBrichka.gear += 2;
		
		System.out.println(myBrichka.toString());
		
		myBrichka.accelerate(50);
		System.out.println(myBrichka.toString());
		myBrichka.accelerate(60);
		
		myBrichka.changeGearUp();
		myBrichka.changeGearUp();
		System.out.println(myBrichka.toString());
		myBrichka.changeGearUp();
		System.out.println(myBrichka.toString());
		
		myBrichka.chageColor("red");
		System.out.println(myBrichka.toString());
	}
}
