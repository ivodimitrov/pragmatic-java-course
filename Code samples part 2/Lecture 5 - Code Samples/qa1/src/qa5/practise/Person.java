package qa5.practice;

public class Person {
	private String name;
	private double money;
	
	public Person(String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}

	public double getMoney() {
		return money;
	}

	public boolean purchaseBook(Book book) {
		double bookPrice = book.calculatePrice();
		if (bookPrice > money) {
			return false;
		} else {
			System.out.println(name + " has purchased a book");
			money -= bookPrice;
			return true;
		}
	}
}
