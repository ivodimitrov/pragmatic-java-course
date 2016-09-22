package qa5.practice;

import java.util.Scanner;

public class Bookshop {
	private double money;
	
	public void sellBook(Book book, Person person) {
		if (person.purchaseBook(book)) {
			money += book.calculatePrice();
		} else {
			System.out.println("Cannot sell to " + person.getName());
		}
	}
	
	@Override
	public String toString() {
		return "Bookshop [money=" + money + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book author");
		String authorName = scanner.nextLine();
		System.out.println("Enter book name");
		String bookName = scanner.nextLine();
		System.out.println("Enter book isdn");
		String isdn = scanner.nextLine();
		System.out.println("Enter book price");
		double bookPrice = scanner.nextDouble();
		System.out.println("Enter book year published");
		int yearPublished = scanner.nextInt();
		
		Book book1 = new Book(authorName, 
				bookName, 
				isdn, 
				bookPrice, 
				yearPublished);
		
		Person person1 = new Person("Petko", 50);
		Person person2 = new Person("Ivan", 20);
		
		Bookshop bookshop = new Bookshop();
		bookshop.sellBook(book1, person2);
		bookshop.sellBook(book1, person1);
		
		System.out.println(bookshop.toString());
	}
}
