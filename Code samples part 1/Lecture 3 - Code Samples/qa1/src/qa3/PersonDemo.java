package qa3;

public class PersonDemo {
	public static void main(String[] args) {
		Person diego = new Person();
		diego.name = "Diego Fernando Alonso Maradona";
		diego.age = 33;
		diego.has18 = true;
		diego.personalNumber = 1234;
		diego.weight = 78.98;
		
		Person paola = new Person();
		paola.name = "Paola Maria Lucia Guadalahara";
		paola.age = 25;
		paola.has18 = true;
		paola.personalNumber = 2345;
		paola.weight = 48.94;
		
		System.out.println(diego.toString());
		System.out.println(paola.toString());
		
		diego.friend = paola;
		diego.friend.age += 1;
		System.out.println(paola.toString());
		
		Person p = paola;
		p.name = "Paola Maradona";
		
		System.out.println(diego.friend);
		System.out.println(paola);
		System.out.println(p);
		
		paola.eat();
		diego.walk();
		
		p.drinkBeer(0.7);
		diego.drinkBeer(2);
		
		boolean hasDiegoFriend = diego.hasFriend();
		System.out.println("Has " + diego.name + " friend: " + hasDiegoFriend);
	}
}
