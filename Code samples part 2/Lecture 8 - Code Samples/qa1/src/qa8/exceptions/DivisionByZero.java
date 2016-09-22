package qa8.exceptions;

public class DivisionByZero {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a / b);
			System.out.println("this line never gets printed");
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Division by zero is forbidden!");
		}
		
		System.out.println("Hey, this is soooooooo boooooriiiing");
	}

}
