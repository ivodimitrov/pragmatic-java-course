package qa8.exceptions;

public class TestChainedException {

	public static void main(String[] args) {
		String s = null;
		try {
			printStringSize(s);
		} catch(RuntimeException re) {
			System.out.println(re.getMessage());
		}
		printStringSize("#spimise");
	}

	private static void printStringSize(String s) {
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("Something went wrong");
			throw new RuntimeException("don't like this");
		}
	}
}