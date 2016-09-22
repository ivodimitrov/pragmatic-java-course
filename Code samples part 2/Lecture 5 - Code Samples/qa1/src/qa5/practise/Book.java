package qa5.practice;

public class Book {
	private static final double VAT = 0.2;
	private static final double promotion = 0.1;
	
	private String author;
	private String name;
	private String isdn;
	private double price;
	private int yearPublished;
	
	public Book() {

	}

	public Book(String author, String name, String isdn, double price, int yearPublished) {
		this.author = author;
		this.name = name;
		this.isdn = isdn;
		this.price = price;
		this.yearPublished = yearPublished;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public String getIsdn() {
		return isdn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public double calculatePrice() {
		if (yearPublished > 1990) {
			return price + price * VAT;
		} else {
			double priceWithVAT = price + price * VAT;
			return priceWithVAT - (priceWithVAT * promotion);
		}
	}
}
